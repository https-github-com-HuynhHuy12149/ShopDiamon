package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dto.ProductsDto;
@Service
public class ProductServiceImpl implements IProductService  {
	@Autowired
	ProductsDao productsDao = new ProductsDao();
	public ProductsDto GetProductByID(long id) {
		// TODO Auto-generated method stub
		List<ProductsDto> listProducts = productsDao.GetProductByID(id);
		return listProducts.get(0);
	}
	public List<ProductsDto> GetProductByIDCategory(int id) {
		// TODO Auto-generated method stub
		return  productsDao.GetAllProductsByID(id);
	}

}
