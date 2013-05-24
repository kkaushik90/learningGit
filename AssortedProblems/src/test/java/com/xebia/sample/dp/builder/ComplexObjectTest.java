package com.xebia.sample.dp.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.xebia.sample.dp.builder.CompositeElements;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement1;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement2;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement3;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement4;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement5;
import com.xebia.sample.dp.builder.bad.ComplexObject;
import com.xebia.sample.dp.builder.good.ComplexObjectGood;

public class ComplexObjectTest {

	private CompositeElement1 compositeElement1;
	private CompositeElement2 compositeElement2;
	private CompositeElement3 compositeElement3;
	private CompositeElement5 compositeElement5;
	private CompositeElement4 compositeElement4;

	@Before
	public void setup() {
		CompositeElements compositeElements = new CompositeElements();
		compositeElement1 = compositeElements.new CompositeElement1();
		compositeElement2 = compositeElements.new CompositeElement2();
		compositeElement3 = compositeElements.new CompositeElement3();
		compositeElement4 = compositeElements.new CompositeElement4();
		compositeElement5 = compositeElements.new CompositeElement5();
	}

	@Test
	public void shouldCreateBadComplexObjectWithFiveArguments() {
		ComplexObject complexObject = new ComplexObject(compositeElement1, compositeElement2, compositeElement3,
				compositeElement4, compositeElement5);
		assertNotNull(complexObject);
	}

	@Test
	public void shouldCreateGoodComplexObjectWithFiveArguments() {
		ComplexObjectGood complexObjectGood = new ComplexObjectGood.Builder().withCompositeElemente1(compositeElement1)
				.withCompositeElement2(compositeElement2).withCompositeElement3(compositeElement3)
				.withCompositeElement4(compositeElement4).withCompositeElement5(compositeElement5).build();
		assertNotNull(complexObjectGood);

	}

	@Test
	public void shouldCreateBadComplexObjectWithSecondAndThirdArgument() {
		ComplexObjectGood complexObjectGood = new ComplexObjectGood.Builder().withCompositeElement2(compositeElement2)
				.withCompositeElement3(compositeElement3).build();
		assertNotNull(complexObjectGood);
	}

	@Test
	public void shouldCreateBadComplexObjectWithFifthArgument() {
		ComplexObjectGood complexObjectGood = new ComplexObjectGood.Builder().withCompositeElement5(compositeElement5)
				.build();
		assertNotNull(complexObjectGood);
	}

}
