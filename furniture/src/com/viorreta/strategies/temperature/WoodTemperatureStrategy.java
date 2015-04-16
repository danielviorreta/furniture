/**
 * 
 */
package com.viorreta.strategies.temperature;



/**
 * @author daniel.viorreta
 *
 */
public class WoodTemperatureStrategy implements ITemperatureStrategy {
	private static int MAX_TEMPERATURE = 50;
	
	public boolean isOverTemperature(int currentTemperature) {
		if (currentTemperature > MAX_TEMPERATURE) {
			System.out.println("Wood temperature is too hot!!");
			return true;
		}
		System.out.println("Wood temperature is perfect :P");
		return false;
	}

	@Override
	public void update(int temperature) {
		this.isOverTemperature(temperature);
	}

}
