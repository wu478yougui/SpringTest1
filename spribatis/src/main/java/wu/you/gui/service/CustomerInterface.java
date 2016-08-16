package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Customer;

public interface CustomerInterface {
public Customer customer_queryById(int id);  
    
    public void customer_save(Customer u);  
      
    public void customer_update(Customer u);  
      
    public void customer_delete(int id);  
      
    public List<Customer> customer_queryAll();  
}
