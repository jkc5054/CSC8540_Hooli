package MVC;

public class ResetIconRunnable implements Runnable {
	ImageButton btn1 = null;
	ImageButton btn2 = null;
	
	public ResetIconRunnable(){
		
	}
	
	public ResetIconRunnable(ImageButton inBtn1, ImageButton inBtn2){
		btn1 = inBtn1;
		btn2 = inBtn2;
	}
	
	@Override
	public void run() {
		if(btn1 != null && btn2 != null){
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			btn1.setToDefault();
			btn2.setToDefault();
		}
		
	}

}
