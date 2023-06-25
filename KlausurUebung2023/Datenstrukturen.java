import java.util.Vector;
//Credits an Marlon
public class Datenstrukturen {
	int counter = 0;
	String[] data;
	public String[] sampleVectorIntoArray(Vector<String> vector){
		if(vector.size()%2!=0){
			data = new String[vector.size()/2+1];
		} else {
			data = new String[vector.size()/2];
		}
		for(int i = 0; i < vector.size(); i = i+2){
			data[counter] = vector.elementAt(i);
			counter++;
		}
		return data;
	}
}
