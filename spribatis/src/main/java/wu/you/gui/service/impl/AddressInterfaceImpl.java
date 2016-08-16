package wu.you.gui.service.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import wu.you.gui.dto.Address;
import wu.you.gui.service.AddressInterFace;

public class AddressInterfaceImpl extends SqlSessionDaoSupport implements AddressInterFace {

	public Address address_queryById(int id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("address_queryById",id);
		
	}


	public void address_delete(int id) {
		// TODO Auto-generated method stub

	}

	public List<Address> address_queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void address_save(Address u) {
		// TODO Auto-generated method stub
		
	}

	public void address_update(Address u) {
		// TODO Auto-generated method stub
		
	}

}
