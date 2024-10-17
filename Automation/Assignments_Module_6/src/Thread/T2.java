package Thread;

public class T2 {
	public class OuterClass {
	    // Define a static inner class that extends Thread
	    static class MyThread extends Thread {
	        @Override
	        public void run() {
	            // Code to be executed by the thread
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Thread is running. Thread ID: " + Thread.currentThread().getId() + " - Count: " + i);
	                try {
	                    Thread.sleep(1000); // Sleep for 1 second
	                } catch (InterruptedException e) {
	                    System.out.println("Thread interrupted: " + e.getMessage());
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Create an instance of MyThread
	        MyThread myThread = new MyThread();
	        
	        // Start the thread
	        myThread.start();
	        
	        // Main thread continues to run concurrently
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Main thread is running. Thread ID: " + Thread.currentThread().getId() + " - Count: " + i);
	            try {
	                Thread.sleep(500); // Sleep for 0.5 seconds
	            } catch (InterruptedException e) {
	                System.out.println("Main thread interrupted: " + e.getMessage());
	            }
	        }
	    }
	}

}
