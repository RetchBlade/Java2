package streams;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class cascadestream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		Writer writer = null;
			try{
				fos = new FileOutputStream("cascadestream.txt", true);
				writer = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.US_ASCII));
				writer.write(252);
			} catch(IOException e) {
					e.printStackTrace();
			} finally{
					try{
						writer.flush();
						writer.close();
					}catch(IOException e) {
						e.printStackTrace();
			}
		}
	}
}
