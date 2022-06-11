package kodlamaios.northwindProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaios.northwindProject.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
