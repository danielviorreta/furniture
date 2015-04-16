/**
 * 
 */
package com.viorreta.strategies.weight;

import com.viorreta.observers.weight.WeightObserver;

/**
 * @author daniel.viorreta
 *
 */
public interface IWeightStrategy extends WeightObserver{
	public boolean isOverWeight(int currentWeight);
}
