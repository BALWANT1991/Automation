package Threads;

public class ThreadMethodsEx extends Thread {

  // @Override (Optional)
  public void run() { // Another thread started concurrently
    String threadName = Thread.currentThread().getName();
    System.out.println("ThreadMethodsEx: " + threadName);
  }

  public static void main(String[] args) {
    ThreadMethodsEx thread = new ThreadMethodsEx();

    // 1. Start the thread
    thread.start();

    // 2. Check thread status: true/ false
    if (thread.isAlive()) { // true
      System.out.println("Thread is running");
    }

    // 3. Get thread state: NEW/ RUNNABLE/ BLOCKED/ WAITING/ TERMINATED
    Thread.State state = thread.getState();
    System.out.println(state); // RUNNABLE

    // 4. Get thread priority: 1 to 10
    System.out.println(thread.getPriority()); // 5

    // 5. Set thread priority: MAX_PRIORITY = 10
    thread.setPriority(Thread.MAX_PRIORITY);

    // 6. Get thread priority
    System.out.println(thread.getPriority()); // 10

    try {
      // 7. Thread Sleeping(waiting/ pause)
      Thread.sleep(1000); // Sleep for milliseconds
    } catch (InterruptedException e) {
      System.out.println("Thread sleeping");
    }
  }
}
