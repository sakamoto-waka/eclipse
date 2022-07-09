package practice;
import java.math.BigDecimal;

class Apple extends Fruit {
	Apple(String name, BigDecimal proce) {
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
