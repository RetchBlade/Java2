package streams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStram {
	public static void main(String args[]) throws IOException{
		FileOutputStream fos = new FileOutputStream("DataOutputStram.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(1);
		dos.writeDouble(1.1);
		dos.close();
		}
}
