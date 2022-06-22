package com.company.day039;

class Candy{
	private String cName;
	private int cPrice;
	
	public Candy() {
		super();
	}
	
	public Candy(String cName, int cPrice) {
		super();
		this.cName = cName;
		this.cPrice = cPrice;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcPrice() {
		return cPrice;
	}

	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}

	@Override
	public String toString() {
		return "Candy [cName=" + cName + ", cPrice=" + cPrice + "]";
	}
}

class Mentos extends Candy implements Runnable{
	private int num;

	public Mentos() { super("멘토스", 200); }
	public Mentos(String cName, int cPrice) { super(cName, cPrice); }

	public Mentos(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		for(int i = 0; ; i++) {
			setNum(i);
			System.out.println("멘토스 팔린 개수: " + getNum());
			// ++num도 가능
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread005 {
	public static void main(String[] args) {
		Thread m = new Thread(new Mentos());
		m.start();
		
		// ver2
		Mentos bakha = new Mentos("박하사탕", 150);
		// bakha.start() 불가능
		Thread m1 = new Thread(bakha);
		m1.start();
	}
}
