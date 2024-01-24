package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import springmvc.entity.Product;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class ProductDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void createProduct(Product product){
        this.hibernateTemplate.save(product);
    }
    @Transactional
    public List<Product> getBYId(){
        return hibernateTemplate.loadAll(Product.class);
    }
    @Transactional
    public void deleteProduct(Integer id){
       Product p= this.hibernateTemplate.load(Product.class,id);
       this.hibernateTemplate.delete(p);
    }
    @Transactional
    public Product getProduct(Integer id){
        return this.hibernateTemplate.load(Product.class,id);
    }

}
