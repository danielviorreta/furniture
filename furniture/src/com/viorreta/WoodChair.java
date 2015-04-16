/**
 * 
 */
package com.viorreta;

import com.viorreta.strategies.temperature.ITemperatureStrategy;
import com.viorreta.strategies.temperature.WoodTemperatureStrategy;
import com.viorreta.strategies.weight.IWeightStrategy;
import com.viorreta.strategies.weight.SteelWeightStrategy;

/**
 * @author daniel.viorreta
 *
 */
public class WoodChair extends Chair {

	public WoodChair() {
		ITemperatureStrategy woodTemperature = new WoodTemperatureStrategy();
		IWeightStrategy weightStrategy = new SteelWeightStrategy();
		
		this.setTemperatureStrategy(woodTemperature);
		this.setWeightStrategy(weightStrategy);
	}	
}
