class MyThread extends Thread{
	@Override
	public void run(){
 	System.out.println("Mein Thread");
 }

 	public static void main ( String[] args){
 		MyThread thread = new MyThread ();
 		thread.start();
 	}
 }

class MySecondThread implements Runnable{
	 @Override
	 public void run(){
		 System.out.println("Mein zweiter Thread");
	 }
	 public static void main(String [ ] args){
		 MySecondThread secondThread = new MySecondThread ( ) ;
		 Thread thread = new Thread ( secondThread ) ;
		 thread.start();
	 }
}