/**
 * 
 */
package com.viorreta.strategies.temperature;

import com.viorreta.observers.temperature.TemperatureObserver;


/**
 * @author daniel.viorreta
 *
 */
public interface ITemperatureStrategy extends TemperatureObserver {
	public boolean isOverTemperature(int currentTemperature);
}
