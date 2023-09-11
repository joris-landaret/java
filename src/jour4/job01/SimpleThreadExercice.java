package jour4.job01;

public class SimpleThreadExercice {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Salut du thread!");
                    try {
                        Thread.sleep(1000); // Pause d'une seconde entre chaque affichage
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();
    }
}
