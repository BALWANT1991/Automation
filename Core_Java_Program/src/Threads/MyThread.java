package Threads;

public class MyThread extends Thread {

  // @Override (Optional)
  public void run() {
    System.out.println("Second Thread");
  }

  // Main thread started
  public static void main() {
    // Create a new thread
    MyThread thread1 = new MyThread();

    // Start a new thread
    thread1.start();

    // Main thread continues execution
    System.out.println("Main Thread");
  }
}
