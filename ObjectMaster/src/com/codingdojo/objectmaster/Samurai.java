package com.codingdojo.objectmaster;

public class Samurai extends Human{
	static int totalSamurai = 0;
	int health = 200;
	
	public Samurai() {
		totalSamurai++;
	}
	public void deathBlow( Human human) {
		System.out.println("Samurai has delivered a death blow and killed the human! " + "Dmg: " + human.health);
		human.health -= human.health;
		health -= health/2;
		System.out.println("Samurai lost " + health/2 + " health"+ " Current health: " + health);	
	}
	public void meditate() {
		System.out.println("Samurai meditated and healed  " + health/2);	
		health += health/2;
		System.out.println("Samurai current health: " + health);
	}
	public void howMany() {
		System.out.println("There are " + totalSamurai + " Samurai's in your army");
	}
}
