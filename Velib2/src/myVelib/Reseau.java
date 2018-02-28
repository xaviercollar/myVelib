package myVelib;

import java.util.ArrayList;

public class Reseau {
	protected ArrayList<Station> stationList;
	protected ArrayList<User> userList;
	protected ArrayList<Location> locationList;
	
	public Reseau(ArrayList<Station> stationList, ArrayList<User> userList, ArrayList<Location> locationList) {
		super();
		this.stationList = stationList;
		this.userList = userList;
		this.locationList = locationList;
	}
	public ArrayList<Station> getStationList() {
		return stationList;
	}
	public ArrayList<User> getUserList() {
		return userList;
	}
	public ArrayList<Location> getLocationList() {
		return locationList;
	}
	
	
}
