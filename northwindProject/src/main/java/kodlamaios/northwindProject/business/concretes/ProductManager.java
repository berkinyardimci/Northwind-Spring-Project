package kodlamaios.northwindProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaios.northwindProject.business.abstracts.ProductService;
import kodlamaios.northwindProject.core.utilities.results.DataResult;
import kodlamaios.northwindProject.core.utilities.results.Result;
import kodlamaios.northwindProject.core.utilities.results.SuccessDataResult;
import kodlamaios.northwindProject.core.utilities.results.SuccessResult;
import kodlamaios.northwindProject.dataAccess.abstracts.ProductDao;
import kodlamaios.northwindProject.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(
				this.productDao.findAll(),
				"Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}
