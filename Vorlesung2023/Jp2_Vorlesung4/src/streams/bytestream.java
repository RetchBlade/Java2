package streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class bytestream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = { 'a', 'c', 'b'};
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
			try{
				baos.write(b);
				System.out.println(baos.toString());
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			try{
				baos.close();
			} catch(IOException e) {
				e.printStackTrace();
		}
	}

}
