package java线程练习;

public class  SimpleRunnable implements Runnable{
	//覆盖方法

	@Override
	public void run() {
		int i;
		 for(i=0;i<5;i++){
			try {
				System.out.println("love");
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		//创建线程
		Thread t=new Thread(new SimpleRunnable(),"线程");
		//启动线程
		t.start();
	}

}
