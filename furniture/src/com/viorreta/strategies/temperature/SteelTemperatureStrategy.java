/**
 * 
 */
package com.viorreta.strategies.temperature;


/**
 * @author daniel.viorreta
 *
 */
public class SteelTemperatureStrategy implements ITemperatureStrategy {
	private static int MAX_TEMPERATURE = 200;
	
	public boolean isOverTemperature(int currentTemperature) {
		if (currentTemperature > MAX_TEMPERATURE) {
			System.out.println("You are above the maximum temperature of " + MAX_TEMPERATURE + " degrees!");
			return true;
		}
		System.out.println("The steel material is so resistant, no problem with the current temperature :P");
		return false;
	}

	@Override
	public void update(int temperature) {
		this.isOverTemperature(temperature);	
	}
}
