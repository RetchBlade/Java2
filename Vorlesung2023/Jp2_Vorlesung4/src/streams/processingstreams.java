package streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class processingstreams {
	// DataInputStream: Ein Objekt von dieser Klasse kann alle primitiven Datentypen sowie String-Objekte lesen.
	public static void main(String args[]) throws IOException{
		FileOutputStream fos= new FileOutputStream("Daten.txt");
		DataOutputStream dos= new DataOutputStream(fos);
			dos.writeInt(1);
			dos.writeDouble(1.1);
			dos.close();
		FileInputStream fis = new FileInputStream("Daten.txt");
		DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			dis.close();
		}
}
