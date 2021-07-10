package com;

import java.util.Random;

public class Otprandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Random r = new Random();
		for(int i = 1; i<=5; i++) {
			int a = r.nextInt(7);
			System.out.print(a);
		}
	}}