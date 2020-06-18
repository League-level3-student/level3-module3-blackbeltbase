package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<Animal>();
	Cow cow = new Cow();
	Sheep sheep = new Sheep();
	Horse horse = new Horse();
	Pig pig = new Pig();
	Pig pig2 = new Pig();
	Sheep sheep2 = new Sheep();
	farm.add(cow);
	farm.add(sheep);
	farm.add(pig);
	farm.add(horse);
	farm.add(pig2);
	farm.add(sheep2);
	for(int i = 0;i<farm.size(); i++) {
		farm.get(i).makeNoise();
	}
}
}
