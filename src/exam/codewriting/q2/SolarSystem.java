package exam.codewriting.q2;

import java.util.LinkedList;

/*
 * We now wish to create a SolarSystem class. The beginnings of this class have been
provided to you below. Examine the instructions and complete the remaining methods.
 */

public class SolarSystem {

	// Instance variables (do not change)
	private String name ;
	private LinkedList < Planet > planets ;
	// Write the constructor for the SolarSystem class.

	public SolarSystem(String name){
		this.name=name;
		LinkedList planets = new LinkedList<>();
	}
	// When a SolarSystem is first created, it should not contain any planets.
	
	public String getName () {
		return name; //FIXME
	}
	
	public void addPlanet ( Planet p) {
		planets.add(p);
	}
	
	public int getNumberOfPlanets () {
		return planets.size(); //FIXME
	}
	
	/**
	* Returns the sum of the masses of all planets in the solar system
	*/
	public double getTotalMass () {
		double totalMass =0;
		for(Planet p: planets){
			totalMass += p.getMass();
		}
		return totalMass; //FIXME
	}
	
	public static void main(String[] args) {
		//Write a line of code that creates an instance of the Planet class by calling the constructor. You should
		//also declare a variable to hold the newly created instance.
		Planet jupiter = new Planet("Jupiter", 256783);
		Planet saturn = new Planet("Saturn", 174592.5);

		//Write a line of code that creates an instance of the SolarSystem class by calling the constructor. You
		//should also declare a variable to hold the newly created instance.
		SolarSystem sun = new SolarSystem("Sun");

		//Write a line of code that will add the Planet to the SolarSystem
		sun.addPlanet(jupiter);
		sun.addPlanet(saturn);
		
		//Write a line of code that will retrieve the total mass from the SolarSystem
		sun.getTotalMass();
	}
}
