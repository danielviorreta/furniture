/**
 * 
 */
package com.viorreta.strategies.weight;


/**
 * @author daniel.viorreta
 *
 */
public class SteelWeightStrategy implements IWeightStrategy{
	private static int MAX_WEIGHT = 150;
	
	public boolean isOverWeight(int currentWeight) {
		if (currentWeight > MAX_WEIGHT) {
			return true;
		}
		return false;
	}
	
	@Override
	public void update(int weight) {
		this.isOverWeight(weight);	
	}
}
