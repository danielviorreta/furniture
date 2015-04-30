/**
 * 
 */
package com.viorreta;

/**
 * @author daniel.viorreta
 * Class to wrap furniture common features
 */
public abstract class Chair extends Furniture {
	protected int numOfLegs = 4;
	
	public Chair() {
		super();
		this.setName("I am a current chair");
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
}
