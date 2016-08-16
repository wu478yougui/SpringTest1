package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Address;

public interface AddressInterFace {
public Address address_queryById(int id);  
    
    public void address_save(Address u);  
      
    public void address_update(Address u);  
      
    public void address_delete(int id);  
      
    public List<Address> address_queryAll();  
}
