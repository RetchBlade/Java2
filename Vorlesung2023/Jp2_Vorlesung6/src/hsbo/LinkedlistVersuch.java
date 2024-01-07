package hsbo;

import java.util.LinkedList;

public class LinkedlistVersuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("Test1");
		list.addLast("Test2");
		list.add(1, "Test3");
		list.add(0, "Test4");
		list.add(0, "Test4");
		System.out.println(list);
		list.remove("Test4");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++)
		System.out.println(list.get(i));
	}

}
