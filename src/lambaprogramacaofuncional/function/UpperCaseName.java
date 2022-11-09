package lambaprogramacaofuncional.function;

import java.util.function.Function;

import lambaprogramacaofuncional.entity.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
