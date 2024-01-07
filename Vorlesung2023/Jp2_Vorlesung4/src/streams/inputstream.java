package streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class inputstream {
	public static void main(String args[]) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("zahlen.txt");
			for(int i= 0; i< 10; i++) {
				fos.write(i);
			}
			fos.close();
			
			
		FileInputStream fis = new FileInputStream("zahlen.txt");
			for(int i= 0; i< 10; i++)
				System.out.print(fis.read());
				fis.close();
			
	
	
		byte[] b= { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
			baos.write(b);
		int by;
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
			while((by = bais.read()) != -1) 
				System.out.println(by);
			// Jeden Stream explizit schließen @bais!
				bais.close();	
			
				// https://web.cecs.pdx.edu/~harry/compilers/ASCIIChart.pdf
				// Liest das was in der COnsole eigegeben wird ein und gibt es als Byte zurück
				int i = System.in.read();
				System.out.println(i);
	}
}
