package streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class stream {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos= null;
		try{
			// Erstellt oder öffnet eine neue/vorhande Datei namens Test.txt
			fos = new FileOutputStream("Streamausgabe.txt", true);
			// Daten werden eingefuegt
			fos.write(252);
			// Schreibt ein Byte 0xFC(UTF-8: ‚ü‘) in die Datei und schließt
			// Das Byte wird in einem Systemabhängigen Default-Encoding gespeichert.
				} catch(IOException e) {
					e.printStackTrace();
				} finally{
					 try{
						fos.close();
					}catch(IOException e ) {
						e.printStackTrace();
					}
			}
	}
}
