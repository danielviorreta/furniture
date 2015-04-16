/**
 * 
 */
package com.viorreta;

import org.junit.Test;

/**
 * @author daniel.viorreta
 *
 */
public class FurnitureTest {

	@Test
	public void chairWoodOverTemperatureTest() {
		Furniture chair = new WoodChair();
		chair.getDescription();
		chair.setCurrentTemperature(10);
		chair.setCurrentTemperature(100);
		chair.setCurrentTemperature(40);
	}
	
	@Test
	public void chairSteelOverTemperatureTest() {
		Furniture chair = new SteelChair();
		chair.setCurrentTemperature(10);
		chair.setCurrentTemperature(500);
		chair.setCurrentTemperature(40);
	}

}
