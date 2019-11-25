package Client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	public static void main(String[] args) throws UnknownHostException, IOException{
		
		int num = 0;
		String temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1", 1344);
		Scanner sc1 = new Scanner(s.getInputStream());
		while (num != -1){
		System.out.println("Enter a number between 1 and 20");
		num = sc.nextInt();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(num);
		temp = sc1.nextLine();
		System.out.println(temp);
		}
		s.close();
		sc.close();
		sc1.close();
	}
}
