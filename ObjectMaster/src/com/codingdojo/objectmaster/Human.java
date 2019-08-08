package com.codingdojo.objectmaster;

public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public void attack(Human Human) {
		Human.health -= this.strength;
		System.out.println("You have attacked another human.");
		System.out.println("Health: " + this.health + ", Opponent's Health: " + Human.health);
		
	}
}

