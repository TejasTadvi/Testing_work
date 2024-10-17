package Thread;

public class T1 {

	    static class MyRunnable implements Runnable {
	        @Override
	        public void run() {
	            System.out.println("Thread is running. Thread ID: " + Thread.currentThread().getId());
	        }
	    }

	    public static void main(String[] args) {
	        MyRunnable myRunnable = new MyRunnable();
	        
	        Thread thread = new Thread(myRunnable);
	        
	        thread.start();
	        
	        System.out.println("Main thread is running. Thread ID: " + Thread.currentThread().getId());
	    }
	}



