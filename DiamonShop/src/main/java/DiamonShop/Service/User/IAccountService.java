package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Dao.UsersDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
}
