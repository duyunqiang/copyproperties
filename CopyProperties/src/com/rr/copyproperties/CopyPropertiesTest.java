package com.rr.copyproperties;

import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;

public class CopyPropertiesTest {

	/**
	 * Compares the execution times of using setters and getters vs apache commons 
	 * BeanUtils copy properties to copy a ManyProps object once
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void copyPropertiesTest() throws IllegalAccessException, InvocationTargetException {	
		ManyProps s = new ManyProps();
		CopyPropertiesUtils.populate(s);
		ManyProps d = new ManyProps();
	
		long timeStamp = System.currentTimeMillis();
		CopyPropertiesUtils.myCopyProperties(d, s);
		System.out.println("Time to do 1 manual copy: " + (System.currentTimeMillis() - timeStamp));
		
		timeStamp = System.currentTimeMillis();
		BeanUtils.copyProperties(d, s);
		System.out.println("Time to do 1 copy with copyProperties: " + (System.currentTimeMillis() - timeStamp));
	}

	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		CopyPropertiesTest.copyPropertiesTest();
	}
}
