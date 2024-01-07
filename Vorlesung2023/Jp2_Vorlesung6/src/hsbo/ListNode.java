package hsbo;

public class ListNode {
	private Object payload;
	ListNode next;

	public ListNode(Object payload, ListNode next) {
		this.payload = payload;
		this.next = next;
	}
	
	public Object getPayload() {
		return this.payload;
	}
}