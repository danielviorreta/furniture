/**
 * 
 */
package com.viorreta;

import java.util.ArrayList;

import com.viorreta.observers.temperature.TemperatureObserver;
import com.viorreta.observers.temperature.TemperatureSubject;
import com.viorreta.observers.weight.WeightObserver;
import com.viorreta.observers.weight.WeightSubject;
import com.viorreta.strategies.temperature.ITemperatureStrategy;
import com.viorreta.strategies.weight.IWeightStrategy;

/**
 * @author daniel.viorreta
 *
 */
public abstract class Furniture implements TemperatureSubject, WeightSubject{
	private ArrayList<TemperatureObserver> temperatureObservers;
	private ArrayList<WeightObserver> weightObservers;
	
	String description;
	int currentTemperature;
	int currentWeight;
	ITemperatureStrategy temperatureStrategy;
	IWeightStrategy weightStrategy;
	
	public Furniture() {
		temperatureObservers = new ArrayList<TemperatureObserver>();
		weightObservers = new ArrayList<WeightObserver>();
	}
	
	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.description = name;
	}
	
	public int getCurrentTemperature() {
		return currentTemperature;
	}

	public void setCurrentTemperature(int currentTemperature) {
		this.currentTemperature = currentTemperature;
		temperatureMeasurementsChanged();
	}

	public int getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
		weightMeasurementsChanged();
	}

	public void setTemperatureStrategy(ITemperatureStrategy temperatureStrategy) {
		this.temperatureStrategy = temperatureStrategy;
		registerTemperatureObserver(temperatureStrategy);
	}
	
	public void setWeightStrategy(IWeightStrategy weightStrategy) {
		this.weightStrategy = weightStrategy;
		registerWeightObserver(weightStrategy);
	}
	
	public void temperatureMeasurementsChanged() {
		notifyTemperatureObservers();
	}
	
	public void weightMeasurementsChanged() {
		notifyWeightObservers();
	}
	
	//Observer pattern for temperature
	public void registerTemperatureObserver(TemperatureObserver observer) {
		temperatureObservers.add(observer);
	}
	public void removeTemperatureObserver(TemperatureObserver observer) {
		int index = temperatureObservers.indexOf(observer);
		if (index > 0) {
			temperatureObservers.remove(index);
		}
	}
	public void notifyTemperatureObservers() {
		for(TemperatureObserver observer: temperatureObservers) {
			observer.update(this.currentTemperature);
		}
	}
	
	
	//Observer pattern for weight
	public void registerWeightObserver(WeightObserver observer) {
		weightObservers.add(observer);
	}
	public void removeWeightObserver(WeightObserver observer) {
		int index = weightObservers.indexOf(observer);
		if (index > 0) {
			weightObservers.remove(index);
		}
	}
	public void notifyWeightObservers() {
		for(WeightObserver observer: weightObservers) {
			observer.update(this.currentWeight);
		}
	}

	//strategy pattern
	public boolean checkTemperature() {
		return temperatureStrategy.isOverTemperature(currentTemperature);
	}

	public boolean checkWeight() {
		return weightStrategy.isOverWeight(currentWeight);
	}
}
