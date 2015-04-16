/**
 * 
 */
package com.viorreta;

import com.viorreta.strategies.temperature.ITemperatureStrategy;
import com.viorreta.strategies.temperature.SteelTemperatureStrategy;
import com.viorreta.strategies.weight.IWeightStrategy;
import com.viorreta.strategies.weight.SteelWeightStrategy;

/**
 * @author daniel.viorreta
 *
 */
public abstract class SteelCloset extends Closet {
	public SteelCloset() {
		ITemperatureStrategy temperatureStrategy = new SteelTemperatureStrategy();
		IWeightStrategy weightStrategy = new SteelWeightStrategy();
		
		this.setTemperatureStrategy(temperatureStrategy);
		this.setWeightStrategy(weightStrategy);
	}
}
