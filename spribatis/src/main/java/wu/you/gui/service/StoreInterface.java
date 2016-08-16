package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Store;

public interface StoreInterface {
public Store store_queryById(int id);  
    
    public void store_save(Store u);  
      
    public void store_update(Store u);  
      
    public void store_delete(int id);  
      
    public List<Store> store_queryAll();  
}
