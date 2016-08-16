package wu.you.gui.service.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import wu.you.gui.dto.Film;
import wu.you.gui.service.FilmInterface;

public class FilmInterfaceImpl extends SqlSessionDaoSupport implements FilmInterface {

	public Film film_queryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void film_save(Film u) {
		this.getSqlSession().insert("film_save", u);
		System.out.println("执行save方法");
	}

	public void film_update(Film u) {
		// TODO Auto-generated method stub

	}

	public void film_delete(int id) {
		// TODO Auto-generated method stub

	}

	public List<Film> film_queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
