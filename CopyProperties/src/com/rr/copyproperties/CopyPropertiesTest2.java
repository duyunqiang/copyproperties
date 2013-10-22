package com.rr.copyproperties;

import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;

public class CopyPropertiesTest2 {

	/**
	 * Compares the execution times of using setters and getters vs apache commons 
	 * BeanUtils copy properties to copy a ManyProps object 1, 1000 and 1000000 times
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void copyPropertiesTest2() throws IllegalAccessException, InvocationTargetException {
		
		ManyProps s = new ManyProps();
		CopyPropertiesUtils.populate(s);
		ManyProps d = new ManyProps();

		int copies = 1;
		for(int i = 0; i < 3; i++) {			
			long timeStamp = System.currentTimeMillis();
			for( int j = 0; j < copies; j++) {
				CopyPropertiesUtils.myCopyProperties(d, s);
			}
			System.out.println("Time to do " + copies + " manual copies: " + (System.currentTimeMillis() - timeStamp));
			
			timeStamp = System.currentTimeMillis();
			for( int j = 0; j < copies; j++) {
				BeanUtils.copyProperties(d, s);
			}
			System.out.println("Time to do " + copies + " copyProperties:   " + (System.currentTimeMillis() - timeStamp) + "\n");

			copies = copies * 1000;
		}
	}

	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		CopyPropertiesTest2.copyPropertiesTest2();
	}
}
