package com.codingdojo.objectmaster;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	public void attack(Human Human) {
		Human.health -= this.strength;
		System.out.println("You have attacked another human.");
		System.out.println("Health: " + this.health + ", Opponent's Health: " + Human.health);
		
	}
}

