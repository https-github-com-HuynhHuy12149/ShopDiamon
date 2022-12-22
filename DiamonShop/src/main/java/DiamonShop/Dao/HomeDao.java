package DiamonShop.Dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperSlides;
import DiamonShop.Entity.Slides;

@Repository
public class HomeDao extends BaseDao{
	
	public List<Slides> GetDataSlides(){
		List<Slides> list = new ArrayList<Slides>();
		String sql ="select * from slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
	
	
}
