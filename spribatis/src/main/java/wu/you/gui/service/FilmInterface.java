package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.Film;


public interface FilmInterface {
public Film film_queryById(int id);  
    
    public void film_save(Film u);  
      
    public void film_update(Film u);  
      
    public void film_delete(int id);  
      
    public List<Film> film_queryAll();  
}

