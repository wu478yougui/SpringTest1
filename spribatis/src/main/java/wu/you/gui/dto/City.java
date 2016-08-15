package wu.you.gui.dto;

import java.util.Date;

public class City {
private int city;
private String city_id;
private int country_id;
private Date last_update;
@Override
public String toString() {
	return "City [city=" + city + ", city_id=" + city_id + ", country_id=" + country_id + ", last_update=" + last_update
			+ "]";
}
public int getCity() {
	return city;
}
public void setCity(int city) {
	this.city = city;
}
public String getCity_id() {
	return city_id;
}
public void setCity_id(String city_id) {
	this.city_id = city_id;
}
public int getCountry_id() {
	return country_id;
}
public void setCountry_id(int country_id) {
	this.country_id = country_id;
}
public Date getLast_update() {
	return last_update;
}
public void setLast_update(Date last_update) {
	this.last_update = last_update;
}
}
