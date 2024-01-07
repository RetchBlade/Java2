package streams;

import java.io.IOException;
import java.io.PrintStream;

public class printstream {
	public static void main(String args[]) throws IOException{
		int i = 10;
		double d = 1.3;
		PrintStream p = new PrintStream(System.out);
		p.println(i);
		p.println(d);
		p.close();
		}
}
