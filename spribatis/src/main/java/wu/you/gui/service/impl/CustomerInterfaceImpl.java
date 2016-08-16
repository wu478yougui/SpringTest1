package wu.you.gui.service.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import wu.you.gui.dto.Customer;
import wu.you.gui.service.CustomerInterface;

public class CustomerInterfaceImpl extends SqlSessionDaoSupport implements CustomerInterface {


	public void customer_delete(int id) {
		// TODO Auto-generated method stub

	}

	public Customer customer_queryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void customer_save(Customer u) {
		this.getSqlSession().insert("save", u);
		
	}

	public void customer_update(Customer u) {
		// TODO Auto-generated method stub
		
	}

	

	public List<Customer> customer_queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
