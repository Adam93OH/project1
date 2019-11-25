package Server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) throws IOException{
		
		int num = 0, temp;
		String win = "Congratulations you won!!";
		String lose = "You lost... The correct number was ";
		ServerSocket s1 = new ServerSocket(1344);
		Socket ss = s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		PrintStream p = new PrintStream(ss.getOutputStream());
		while (num != -1){
		num = sc.nextInt();
		Random r = new Random();
		temp = r.nextInt(20) + 1;
		if(num == temp)
			p.println(win);
		else
			p.println(lose + Integer.toString(temp));
		
		
		}
		System.out.println("Connection terminated");
		s1.close();
		sc.close();
		ss.close();
		
	}
	
}
