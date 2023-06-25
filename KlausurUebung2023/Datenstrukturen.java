import java.util.Vector;

public class Datenstrukturen {
	
	public String[] sampleVectorIntoArray(Vector<String> vector){
		String[] data = new String[vector.size()];
		for (int i = 0; i < vector.size(); i += 2)
			data[i / 2] = vector.get(i);
        
		return data;
	}
}
