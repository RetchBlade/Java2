public class Deadlock { 
	//Credits an Yanik
	/*	Wenn bei der Interpretation von Programmcode ein Zustand auftritt,
	 *  aus dem heraus es dem Programm nicht mehr gelingen kann,
	 *  sie selbst zu beenden, so nennt man das ein Deadlock (im allgemeinsten Sinne des Wortes).
	 */
		
		// Die beiden Locks 
		private static Object lock1 = new Object(); 
		private static Object lock2 = new Object(); 

	public static void main(String[] args) { 

		Thread1 thread1 = new Thread1(); 
		Thread2 thread2 = new Thread2(); 
		thread1.start(); 
		thread2.start(); 
	} 

	// Erster Thread nimmt Lock1, wartet, und versucht Lock2 zu erhalten 
	private static class Thread1 extends Thread { 
		public void run() { 
			synchronized(lock1) { 
				System.out.println("Thread1 hält Lock1 "); 
				try { 
					Thread.sleep(100); 
				}catch(InterruptedException e) { 
					System.out.println(e); 
				} 
				System.out.println("Thread1 versucht Lock2 zu erhalten"); 
				synchronized(lock2) { 	
					System.out.println("Thread1 hält Lock2"); 
				} 
			} 
		} 
	} 

	private static class Thread2 extends Thread { 
		public void run() { 
			synchronized(lock2){
				System.out.println("Thread2 hält Lock2"); 
					try { 
						Thread.sleep(100);; 
					}catch(InterruptedException e) { 
						System.out.println(e); 
			}	 
			System.out.println("Thread 2 versucht Lock1 zu erhalten"); 
			synchronized(lock1) { 
				System.out.println("Thread2 hält Lock1");
			}
			}
		}
	}
}

