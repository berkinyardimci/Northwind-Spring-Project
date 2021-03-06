package kodlamaios.northwindProject.business.abstracts;

import java.util.List;

import kodlamaios.northwindProject.core.utilities.results.DataResult;
import kodlamaios.northwindProject.core.utilities.results.Result;
import kodlamaios.northwindProject.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
