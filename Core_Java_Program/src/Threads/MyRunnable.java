package Threads;

public class MyRunnable implements Runnable {

  // Implementing the run() method from the Runnable interface
  @Override
  public void run() {
      System.out.println("Thread2");
  }

  // Main method (main thread entry point)
  public static void main(String[] args) {
      // Create a new instance of MyRunnable
      MyRunnable myRunnable = new MyRunnable();
      
      // Create a new thread passing myRunnable as the Runnable target
      Thread thread1 = new Thread(myRunnable);
      
      // Start the newly created thread
      thread1.start();

      // Main thread continues execution
      System.out.println("Main Thread");
  }
}

