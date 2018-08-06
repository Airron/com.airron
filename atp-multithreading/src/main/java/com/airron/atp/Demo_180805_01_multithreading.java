package com.airron.atp;

public class Demo_180805_01_multithreading extends Thread {

	public static final int MAX_PRIMES = 1000000;
	public static final int TEN_SECONDS = 10000;
	public volatile boolean finished = false;
	public void run() {
	int[] primes = new int[MAX_PRIMES];
	int count = 0;
	for (int i=2; count<MAX_PRIMES; i++) {
	// Check to see if the timer has expired
	if (finished) {
	break;
	}
	boolean prime = true;
	for (int j=0; j<count; j++) {
	if (i % primes[j] == 0) {
	prime = false;
	break;
	}
	}
	if (prime) {
	primes[count++] = i;
	System.out.println("Found prime: " + i);
	}
	}
	}
	public static void main(String[] args) {
		Demo_180805_01_multithreading calculator = new Demo_180805_01_multithreading();
	calculator.start();
	try {
	Thread.sleep(TEN_SECONDS);
	}
	catch (InterruptedException e) {
	// fall through
	}
	calculator.finished = true;
	}
	}