package com.multithreading;

public class ThEx extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread " + i);
			try {
				Thread.sleep(1000); // 1000 milli seconds = 1 sec
			} catch (Exception ex) {

			}
		}
	}

	public static void main(String[] args) {
		ThEx t1 = new ThEx();
		t1.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread " + i);
			try {
				Thread.sleep(1000); // 1000 milli seconds = 1 sec
			} catch (Exception ex) {

			}
		}
	}

}
