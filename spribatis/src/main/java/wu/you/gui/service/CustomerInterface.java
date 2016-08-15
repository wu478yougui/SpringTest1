package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Customer;

public interface CustomerInterface {
public Customer queryById(int id);  
    
    public void save(Customer u);  
      
    public void update(Customer u);  
      
    public void delete(int id);  
      
    public List<Customer> queryAll();  
}
