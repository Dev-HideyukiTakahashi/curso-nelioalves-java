package lambaprogramacaofuncional.predicate;

import java.util.function.Predicate;

import lambaprogramacaofuncional.entity.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}

}
