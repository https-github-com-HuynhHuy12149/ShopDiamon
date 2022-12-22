package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.MapperCategorys;
import DiamonShop.Entity.MapperSlides;
import DiamonShop.Entity.Slides;

@Repository
public class CategorysDao extends BaseDao {
	public List<Categorys> GetDataCategorys(){
	List<Categorys> list = new ArrayList<Categorys>();
	String sql ="select * from categorys";
	list = _jdbcTemplate.query(sql, new MapperCategorys());
	return list;
	
}

}
