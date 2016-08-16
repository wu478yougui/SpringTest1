package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.City;

public interface CityInterface {
	public City city_queryById(int id);  
    
    public void city_save(City u);  
      
    public void city_update(City u);  
      
    public void city_delete(int id);  
      
    public List<City> city_queryAll();  
}
