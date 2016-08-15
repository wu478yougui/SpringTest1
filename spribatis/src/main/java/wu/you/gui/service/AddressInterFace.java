package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Address;
import wu.you.gui.dto.User;

public interface AddressInterFace {
public Address queryById(int id);  
    
    public void save(Address u);  
      
    public void update(Address u);  
      
    public void delete(int id);  
      
    public List<Address> queryAll();  
}
