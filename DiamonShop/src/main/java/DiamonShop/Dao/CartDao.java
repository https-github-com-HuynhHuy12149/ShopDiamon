package DiamonShop.Dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DiamonShop.Dto.CartDto;
import DiamonShop.Dto.ProductsDto;
@Repository
public class CartDao extends BaseDao {
//	@Autowired
//	ProductsDao productDao = new ProductsDao();
//	public HashMap<Long,CartDto> AddCart(long id, HashMap<Long,CartDto> Cart) {
//		CartDto itemCart = new CartDto();
//		ProductsDto product = productDao.FindProductByID(id);
//		if (product != null && Cart.containsKey(id)) {
//			itemCart = Cart.get(id);
//			itemCart.setQuanty(itemCart.getQuanty()+1);
//			itemCart.setTotalPrice(itemCart.getQuanty()*itemCart.getProduct().getPrice());
//		}else {
//			itemCart.setProduct(product);
//			itemCart.setQuanty(1);
//			itemCart.setTotalPrice(product.getPrice());
//		}
//		Cart.put(id, itemCart);
//		return Cart;
//	}
//
//	public HashMap<Long,CartDto> EditCart(long id,int quanty ,HashMap<Long,CartDto> Cart) {
//		if(Cart == null) {
//			return null;
//		}
//		CartDto itemCart = new CartDto();
//		
//		if(Cart.containsKey(id)) {
//			itemCart = Cart.get(id);
//			itemCart.setQuanty(quanty);
//			double totalPrice = quanty*itemCart.getProduct().getPrice();
//			
//			itemCart.setTotalPrice(totalPrice);
//		}
////		Cart.containsKey(id);
////		if (product != null) {
////			itemCart.setProduct(product);
////			itemCart.setQuanly(1);
////			itemCart.setTotalPrice(product.getPrice());
////		}
//		Cart.put(id, itemCart);
//		return Cart;
//	}
//	
//	public HashMap<Long,CartDto> DeleteCart(long id ,HashMap<Long,CartDto> Cart) {
//		if(Cart == null) {
//			return null;
//		}
//		if(Cart.containsKey(id)) {
//			Cart.remove(id);
//		}
//		
//		
//		return Cart;
//	}
//	public int TotalQuanty(HashMap<Long,CartDto> Cart) {
//		int totalQuanty = 0;
//		for(Map.Entry<Long, CartDto> itemCart : Cart.entrySet()) {
//			totalQuanty += itemCart.getValue().getQuanty();
//		}
//		return totalQuanty;
//		
//	}
//	
//	public int TotalPrice(HashMap<Long,CartDto> Cart) {
//			
//		int totalPrice = 0;
//		for(Map.Entry<Long, CartDto> itemCart : Cart.entrySet()) {
//			totalPrice += itemCart.getValue().getTotalPrice();
//		}
//		return totalPrice;
//		}

}
