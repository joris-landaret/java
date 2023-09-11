package jour4.job02;

public class RunnableInterfaceExercice implements Runnable  {

    @Override
    public void run() {
        System.out.println("En cours d'exécution...");
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new RunnableInterfaceExercice();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            Thread.sleep(1000);
        }
    }

}
