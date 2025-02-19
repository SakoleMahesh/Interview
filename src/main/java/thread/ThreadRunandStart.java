package thread;

public class ThreadRunandStart extends Thread {
	public void run() {
		System.out.println("Run Method Calling");
	}
	public static void main(String[] args) {
		ThreadRunandStart t1=new ThreadRunandStart();
		t1.start();
		startVirtualThread(t1).start();;
	//	t1.run();
	}

}
