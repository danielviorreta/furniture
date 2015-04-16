/**
 * 
 */
package com.viorreta.observers.weight;


/**
 * @author daniel.viorreta
 *
 */
public interface WeightSubject {
	public void registerWeightObserver(WeightObserver observer);
	public void removeWeightObserver(WeightObserver observer);
	public void notifyWeightObservers();
}
