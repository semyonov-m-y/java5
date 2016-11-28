package javacore5.homework5;

public class Controller {

	API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

	Room[] requstRooms(int price, int persons, String city, String hotel){
		int count = 0;
		for (API a : apis) {
			count+=a.findRooms(price,persons,city,hotel).length;
		}
		Room[] res = new Room[count];
		int i = 0;
		for (API a : apis) {
			for(Room r : a.findRooms(price,persons,city,hotel))
				res[i] = r;
			i++;
		}
		return res;
	}

	Room[] check(API api1, API api2){
		int count = 0;
		for (int i = 0; i < api1.getAll().length ; i++) {
			for (int j = 0; j < api1.getAll().length; j++) {
				if(api1.getAll()[i].equals(api2.getAll()[j])){
					count++;
				}
			}
		}
		Room[] res = new Room[count];
		for (int i = 0; i < api1.getAll().length; i++) {
			if (api1.getAll()[i].equals(api2.getAll()[i])){
				res[i] = api1.getAll()[i];
			}
		}
		return res;
	}
}
