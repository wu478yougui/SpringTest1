package wu.you.gui.service.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import wu.you.gui.dto.Address;
import wu.you.gui.dto.User;
import wu.you.gui.service.AddressInterFace;

public class AddressInterfaceImpl extends SqlSessionDaoSupport implements AddressInterFace {

	public Address queryById(int id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("queryById",id);
		
	}


	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public List<Address> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Address u) {
		// TODO Auto-generated method stub
		
	}

	public void update(Address u) {
		// TODO Auto-generated method stub
		
	}

}
