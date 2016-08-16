package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Country;

public interface CountryInterface {
public Country country_queryById(int id);  
    
    public void country_save(Country u);  
      
    public void country_update(Country u);  
      
    public void country_delete(int id);  
      
    public List<Country> country_queryAll();  
}
