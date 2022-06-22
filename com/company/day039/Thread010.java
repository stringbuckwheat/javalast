package com.company.day039;

class VideoFrame_1 implements Runnable{
	int[] intArray;
	
	public VideoFrame_1() {
		super();
	}

	public VideoFrame_1(int[] intArray) {
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

class Caption_1 implements Runnable{
	String[] strArray;
	
	public Caption_1() {
		super();
	}

	public Caption_1(String[] strArray) {
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

public class Thread010 {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		Thread todo1 = new Thread(new VideoFrame_1(intArray));
		Thread todo2 = new Thread(new Caption_1(strArray));
		
		todo1.start();
		todo2.start();
		
		// ver2 변수에 저장
		VideoFrame_1 vf = new VideoFrame_1(intArray);
		Caption_1 c = new Caption_1(strArray);
		
		Thread todo2_1 = new Thread(vf);
		Thread todo2_2 = new Thread(c);
		
		todo1.start();
		todo2.start();
		
		// ver3 익명 클래스
		Thread todo3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < intArray.length; i++) {
					System.out.print("(비디오 프레임) " + intArray[i]);
					
					try {
						Thread.sleep(199);
					} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread todo4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < strArray.length; i++) {
					System.out.println(" - (자막 번호) " + strArray[i]);
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {}
				}
			}
		});
		
		todo3.start();
		todo4.start();
	}
}
