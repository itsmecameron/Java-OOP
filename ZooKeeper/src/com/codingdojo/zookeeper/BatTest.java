package com.codingdojo.zookeeper;

public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat();
		b.attackTown();
		b.attackTown();
		b.attackTown();
		System.out.println(b.getBatEnergyLevel());
		
		b.eatHuman();
		b.eatHuman();
		System.out.println(b.getBatEnergyLevel());
		
		b.fly();
		b.fly();
		System.out.println(b.getBatEnergyLevel());
	}
}
