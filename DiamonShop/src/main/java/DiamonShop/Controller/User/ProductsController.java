package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.IProductService;
import DiamonShop.Service.User.PaginateServiceImpl;

@Controller
public class ProductsController extends BaseController {
//	@Autowired
//	private IProductService _productSevice;
//	@RequestMapping(value = {"chi-tiet-san-pham/{id}"})
//	public ModelAndView Index(@PathVariable long id) {
////		ModelAndView mv = new ModelAndView("user/index");
//		_mvShare.setViewName("user/products/product");
//		_mvShare.addObject("product", _productSevice.GetProductByID(id));
//		int idcategory = _productSevice.GetProductByID(id).getId_category();
//		_mvShare.addObject("productByIDCategory", _productSevice.GetProductByIDCategory(idcategory));
//		return _mvShare;
//	}
	
}
