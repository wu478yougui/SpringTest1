package wu.you.gui.service.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import wu.you.gui.dto.Customer;
import wu.you.gui.service.CustomerInterface;

public class CustomerInterfaceImpl extends SqlSessionDaoSupport implements CustomerInterface {


	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public Customer queryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Customer u) {
		this.getSqlSession().insert("save", u);
		
	}

	public void update(Customer u) {
		// TODO Auto-generated method stub
		
	}

	public List<Customer> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
