package kodlamaios.northwindProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaios.northwindProject.business.abstracts.ProductService;
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
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
