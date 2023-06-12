public class ThreadBeispiel {
    public static void main(String[] args) {
        // Erzeugung und Starten des ersten Threads
        Thread thread1 = new MeinThread("Thread 1");
        thread1.start();

        // Erzeugung und Starten des zweiten Threads
        Thread thread2 = new MeinThread("Thread 2");
        thread2.start();

        // Hauptthread führt seine eigene Arbeit aus
        for (int i = 0; i < 5; i++) {
            System.out.println("Hauptthread: " + i);
            try {
                Thread.sleep(1000); // Pause von 1 Sekunde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Eigene Thread-Klasse, die von Thread erbt
    static class MeinThread extends Thread {
        private String name;

        public MeinThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(1000); // Pause von 1 Sekunde
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
