package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Store;

public interface StoreInterface {
public Store queryById(int id);  
    
    public void save(Store u);  
      
    public void update(Store u);  
      
    public void delete(int id);  
      
    public List<Store> queryAll();  
}
