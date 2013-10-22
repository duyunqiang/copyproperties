package com.rr.copyproperties;

public class CopyPropertiesUtils {

	/**
	 * Copies, using setters and getters all the properties from source
	 * to dest
	 * @param dest
	 * @param source
	 */
	public static void myCopyProperties( ManyProps dest, ManyProps source) {
		dest.setP1(source.getP1());
		dest.setP2(source.getP2());
		dest.setP3(source.getP3());
		dest.setP4(source.getP4());
		dest.setP5(source.getP5());
		dest.setP6(source.getP6());
		dest.setP7(source.getP7());
		dest.setP8(source.getP8());
		dest.setP9(source.getP9());
		
		dest.setS1(source.getS1());
		dest.setS2(source.getS2());
		dest.setS3(source.getS3());
		dest.setS4(source.getS4());
		dest.setS5(source.getS5());
		dest.setS6(source.getS6());
		dest.setS7(source.getS7());
		dest.setS8(source.getS8());
		dest.setS9(source.getS9());
	}
	
	
	/**
	 * Populates, for testing purposes some values to manyProps
	 * @param manyProps
	 */
	public static void populate( ManyProps manyProps) {
		manyProps.setP1(1);
		manyProps.setP2(2);
		manyProps.setP3(3);
		manyProps.setP4(4);
		manyProps.setP5(5);
		manyProps.setP6(6);
		manyProps.setP7(7);
		manyProps.setP8(8);
		manyProps.setP9(9);

		manyProps.setS1("1");
		manyProps.setS2("2");
		manyProps.setS3("3");
		manyProps.setS4("4");
		manyProps.setS5("5");
		manyProps.setS6("6");
		manyProps.setS7("7");
		manyProps.setS8("8");
		manyProps.setS9("9");
	}
}
