package hsbo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class lorenz {
	
	static BufferedReader b = null;
	
	public static String readln() throws IOException {
		if (b == null)
			b = new BufferedReader(new InputStreamReader(System.in));
		return b.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		String s;
		while (!(s = lorenz.readln()).isEmpty())
			System.out.println(">" + s + "<");
		}
	}