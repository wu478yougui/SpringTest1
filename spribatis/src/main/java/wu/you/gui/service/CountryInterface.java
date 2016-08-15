package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Country;

public interface CountryInterface {
public Country queryById(int id);  
    
    public void save(Country u);  
      
    public void update(Country u);  
      
    public void delete(int id);  
      
    public List<Country> queryAll();  
}
