package java�߳���ϰ;

public class  SimpleRunnable implements Runnable{
	//���Ƿ���

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
		//�����߳�
		Thread t=new Thread(new SimpleRunnable(),"�߳�");
		//�����߳�
		t.start();
	}

}
