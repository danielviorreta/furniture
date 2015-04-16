/**
 * 
 */
package com.viorreta.observers.temperature;


/**
 * @author daniel.viorreta
 *
 */
public interface TemperatureSubject {
	public void registerTemperatureObserver(TemperatureObserver observer);
	public void removeTemperatureObserver(TemperatureObserver observer);
	public void notifyTemperatureObservers();
}
