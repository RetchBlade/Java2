package hsbo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackVersuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		String s;
		while ((s = queue.poll()) != null)
		System.out.println(s);
	}

}
