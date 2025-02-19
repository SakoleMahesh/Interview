package thread;

public class CreateingThreadUsingRunnable  implements Runnable{

	@Override
	public void run() {
		System.out.println("This is Runnable");
		
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new CreateingThreadUsingRunnable());
		t1.start();
	}

}
