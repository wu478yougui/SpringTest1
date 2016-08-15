package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.City;

public interface CityInterface {
public City queryById(int id);  
    
    public void save(City u);  
      
    public void update(City u);  
      
    public void delete(int id);  
      
    public List<City> queryAll();  
}
