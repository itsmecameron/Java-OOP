package com.codingdojo.objectmaster;

public class Ninja extends Human {
	int stealth = 10;
	
	public void steal(Human human) {
		human.health -= stealth;
		health += stealth;
		System.out.println( "Ninja used steal and healed for " + stealth + " life points" + " Their Health is now at " + human.health);
	}
	public void runAway() {
		health -= 10;
		System.out.println("Ninja ran away and lost  10 life points" + " current ninja health: " + health);
	}
}
