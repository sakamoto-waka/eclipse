package practice;

import java.math.BigDecimal;

public class Peach extends Fruit {
	Peach(String name, BigDecimal proce) {
		super(name, price);
	}
	
	@override
	protected String getName() {
		return name;
	}
	
	@override
	protected BigDecimal getPrice() {
		return price;
	}
}
}
