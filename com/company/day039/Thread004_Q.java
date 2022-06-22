package com.company.day039;

class VideoFrame extends Thread{
	int[] intArray;
	
	public VideoFrame() {
		super();
	}

	public VideoFrame(int[] intArray) {
		super();
		this.intArray = intArray;
	}

	@Override
	public void run() {
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			
			try {
				Thread.sleep(199);
			} catch (InterruptedException e) {}
		}
	}
}

class Caption extends Thread{
	String[] strArray;
	
	public Caption() {
		super();
	}

	public Caption(String[] strArray) {
		super();
		this.strArray = strArray;
	}

	@Override
	public void run() {
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

public class Thread004_Q {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		VideoFrame vf = new VideoFrame(intArray);
		vf.start();		
		
		Caption c = new Caption(strArray);
		c.start();
	}
}
