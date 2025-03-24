package academy.digitallab.store.product.demo.repository;

import academy.digitallab.store.product.demo.entity.Category;
import academy.digitallab.store.product.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product>  findByCategory(Category category);
}
