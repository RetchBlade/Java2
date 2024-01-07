package hsbo;


public class Start {

	public static void main(String[] args) {
		
		/*
		Stapel k = new Stapel();
		
		for(int i=0; i<10; i++)
			k.push(i);
		
		while(!k.empty()){
			System.out.println(k.element());
			k.pop();
		}
		*/
		
		Schlange k = new Schlange();
		
		for(int i=0; i<10; i++)
			k.enqueue(i);
		
		k.enqueue("Ich bin auch ein Objekt!");
		k.enqueue(3.78);
		
		while(!k.empty()){
			System.out.println(k.element());
			k.dequeue();
		}
	}
}
