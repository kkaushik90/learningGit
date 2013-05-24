package com.xebia.sample.dp.builder.bad;

import com.xebia.sample.dp.builder.CompositeElements.CompositeElement1;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement2;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement3;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement4;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement5;

@SuppressWarnings("unused")
public class ComplexObject {

	private CompositeElement1 compositeElement1;
	private CompositeElement2 compositeElement2;
	private CompositeElement3 compositeElement3;
	private CompositeElement4 compositeElement4;
	private CompositeElement5 compositeElement5;

	
	/**
	 * Complex Object constructor with one argument
	 * @param compositeElement1
	 */
	public ComplexObject(CompositeElement1 compositeElement1) {
		super();
		this.compositeElement1 = compositeElement1;
	}

	
	/**
	 * Complex Object constructor with two arguments
	 */
	public ComplexObject(CompositeElement1 compositeElement1, CompositeElement2 compositeElement2) {
		super();
		this.compositeElement1 = compositeElement1;
		this.compositeElement2 = compositeElement2;
	}


	/**
	 * Complex Object constructor with three arguments
	 */
	public ComplexObject(CompositeElement1 compositeElement1, CompositeElement2 compositeElement2,
			CompositeElement3 compositeElement3) {
		super();
		this.compositeElement1 = compositeElement1;
		this.compositeElement2 = compositeElement2;
		this.compositeElement3 = compositeElement3;
	}


	/**
	 * Complex Object constructor with four arguments
	 */
	public ComplexObject(CompositeElement1 compositeElement1, CompositeElement2 compositeElement2,
			CompositeElement3 compositeElement3, CompositeElement4 compositeElement4) {
		super();
		this.compositeElement1 = compositeElement1;
		this.compositeElement2 = compositeElement2;
		this.compositeElement3 = compositeElement3;
		this.compositeElement4 = compositeElement4;
	}


	/**
	 * Complex Object constructor with five arguments
	 */
	public ComplexObject(CompositeElement1 compositeElement1, CompositeElement2 compositeElement2,
			CompositeElement3 compositeElement3, CompositeElement4 compositeElement4,
			CompositeElement5 compositeElement5) {
		super();
		this.compositeElement1 = compositeElement1;
		this.compositeElement2 = compositeElement2;
		this.compositeElement3 = compositeElement3;
		this.compositeElement4 = compositeElement4;
		this.compositeElement5 = compositeElement5;
	}

	
	
}
