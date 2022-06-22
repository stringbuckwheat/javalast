package com.company.day039;

class VideoFrame1 implements Runnable{
	int[] intArray;
	
	public VideoFrame1() {
		super();
	}

	public VideoFrame1(int[] intArray) {
		super();
		this.intArray = intArray;
	}

	@Override
	public void run() {
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

class Caption1 extends VideoFrame1 implements Runnable{
	// int[] intArray;
	String[] strArray;
	
	public Caption1() {
		super();
	}

	public Caption1(int[] intArray, String[] strArray) {
		super(intArray);
		this.strArray = strArray;
	}


	@Override
	public void run() {
		for(int i = 0; i < strArray.length; i++) {
			super.run();
			System.out.println(" - (자막 번호) " + strArray[i]);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

public class Thread004_Q2 {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		Runnable r = new VideoFrame1(intArray);
		Thread vf = new Thread(r);
		Thread c = new Thread(new Caption1(intArray, strArray));
		
		vf.start();
		c.start();
	}
}
