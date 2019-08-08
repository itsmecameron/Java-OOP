package com.codingdojo.objectmaster;

public class Wizard extends Human {
	int health = 50;
	int intelligence = 8;
	
	public void heal(Human human) {
		human.health += intelligence;
		System.out.println("Wizard have healed another human.");
		System.out.println( "Wizard healed for: " + intelligence  + " health"+ " Human Health: " + human.health);
	}
	public void fireball(Human human) {
		human.health -= intelligence * 3;
		System.out.println("Wizard have attacked another human.");
		System.out.println( "Wizard did " + intelligence * 3 + " Dmg!" + " Their health is at: " + human.health);
	}
}
