package javacore5.homework5;

import java.util.Date;

public class Room {
	
	long id;
	int price;
	int persons;
	Date dateAvailableFrom;
	String hotelName;
	String cityName;
	
	public Room(long id, int price, int person, Date dateAvailableFrom,
			String hotelName, String cityName) {
		super();
		this.id = id;
		this.price = price;
		this.persons = person;
		this.dateAvailableFrom = dateAvailableFrom;
		this.hotelName = hotelName;
		this.cityName = cityName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (price != other.price)
			return false;
		if (persons != other.persons)
			return false;
		if (cityName != other.cityName)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = price;
		result = 31 * result + persons;
		result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
		return result;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPersons() {
		return persons;
	}

	public void setPerson(int person) {
		this.persons = person;
	}

	public Date getDateAvailableFrom() {
		return dateAvailableFrom;
	}

	public void setDateAvailableFrom(Date dateAvailableFrom) {
		this.dateAvailableFrom = dateAvailableFrom;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
}
