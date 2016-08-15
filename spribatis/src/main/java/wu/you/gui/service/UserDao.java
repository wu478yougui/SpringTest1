package wu.you.gui.service;

import java.util.List;

import wu.you.gui.dto.User;

public interface UserDao {
	public User queryById(int id);  
    
    public void save(User u);  
      
    public void update(User u);  
      
    public void delete(int id);  
      
    public List<User> queryAll();  
}
