package myVelib;

import java.util.ArrayList;
/**
 * Classe Reseau permettant de rassembler la liste des stations, la liste des utilisateurs, la liste des locations
 * afin de permettre de faire les statistiques et d'acceder � diverses informations
 * @author xavier
 *
 */
public class Reseau {
	/**
	 * La classe reseau est constitu�e de 3 attributs, une ArrayList de Station nomm�e stationList, une ArrayList de User nomm�e userList
	 * et une ArrayList de Location nomm�e locationList
	 */
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
