package com.xebia.sample.dp.builder.good;

import com.xebia.sample.dp.builder.CompositeElements.CompositeElement1;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement2;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement3;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement4;
import com.xebia.sample.dp.builder.CompositeElements.CompositeElement5;

@SuppressWarnings("unused")
public class ComplexObjectGood {

	private CompositeElement1 compositeElement1;
	private CompositeElement2 compositeElement2;
	private CompositeElement3 compositeElement3;
	private CompositeElement4 compositeElement4;
	private CompositeElement5 compositeElement5;

	private ComplexObjectGood(){
	}
	
	/**
	 * Builder Class for creating Complex Object with different combination and different number of arguments.
	 *
	 */
	public static class Builder {

		public Builder() {
			complexObject = new ComplexObjectGood();
		}

		private ComplexObjectGood complexObject;

		public Builder withCompositeElemente1(CompositeElement1 compositeElement1) {
			complexObject.setCompositeElement1(compositeElement1);
			return this;
		}

		public Builder withCompositeElement2(CompositeElement2 compositeElement2) {
			complexObject.setCompositeElement2(compositeElement2);
			return this;
		}

		public Builder withCompositeElement3(CompositeElement3 compositeElement3) {
			complexObject.setCompositeElement3(compositeElement3);
			return this;
		}

		public Builder withCompositeElement4(CompositeElement4 compositeElement4) {
			complexObject.setCompositeElement4(compositeElement4);
			return this;
		}

		public Builder withCompositeElement5(CompositeElement5 compositeElement5) {
			complexObject.setCompositeElement5(compositeElement5);
			return this;
		}

		public ComplexObjectGood build() {
			return complexObject;
		}
	}

	public void setCompositeElement1(CompositeElement1 compositeElement1) {
		this.compositeElement1 = compositeElement1;
	}

	public void setCompositeElement2(CompositeElement2 compositeElement2) {
		this.compositeElement2 = compositeElement2;
	}

	public void setCompositeElement3(CompositeElement3 compositeElement3) {
		this.compositeElement3 = compositeElement3;
	}

	public void setCompositeElement4(CompositeElement4 compositeElement4) {
		this.compositeElement4 = compositeElement4;
	}

	public void setCompositeElement5(CompositeElement5 compositeElement5) {
		this.compositeElement5 = compositeElement5;
	}

}
