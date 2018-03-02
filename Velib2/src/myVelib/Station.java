package myVelib;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * La classe station cr�era les objets de m�me nom
 * @author xavier
 *
 */
public class Station extends Observable {
	protected ArrayList<ParkingSlot> parkingSlotList;
	protected String typeStation;
	protected String state;
	protected GPScoord position;
	protected static Long compteur=(long) 0;
	protected Long stationID;
	protected String name;
	protected ArrayList<Ride> rideList;
	/**
	 * Ce contructeur peux �tre amen� � renvoyer une erreur dans le cas o� le type de station ou le type d'�tat n'a pas �t� �crit correctement ou n'existe pas
	 * @param parkingSlotList
	 * @param typeStation doit �tre une chaine de caract�re du type Standard ou Plus
	 * @param state doit �tre une chaine de caract�re du type on service ou offline
	 * @param position
	 * @param name
	 * @throws BadStateStationCreationException,BadTypeStationCreationException
	 */
	public Station(ArrayList<ParkingSlot> parkingSlotList, String typeStation, String state, GPScoord position,
			String name) throws BadStateStationCreationException,BadTypeStationCreationException {
		super();
		if (typeStation=="Standard" || typeStation=="Plus"){
			if ( state=="on service" || state=="offline"){
				compteur=compteur+1;
				stationID=compteur;
				this.parkingSlotList = parkingSlotList;
				this.typeStation = typeStation;
				this.state = state;
				this.position = position;
				this.name = name;
				this.rideList=new ArrayList<Ride>();
			}
			else {
				throw new BadStateStationCreationException(state);
			}
		}
		else {
			throw new BadTypeStationCreationException(typeStation);
		}
		
		
	}
	public String getTypeStation() {
		return typeStation;
	}
	/**
	 * Le changement d'�tat est aussi contr�l� afin que aucun �tat autre que Plus ou Standard ne soit mis
	 * @param typeStation
	 * @throws BadTypeStationCreationException
	 */
	public void setTypeStation(String typeStation) throws BadTypeStationCreationException {
		if (typeStation=="Standard" || typeStation=="Plus"){
			this.typeStation = typeStation;}
		else{
			throw new BadTypeStationCreationException(typeStation);
		}
	}
	public ArrayList<ParkingSlot> getParkingSlotList() {
		return parkingSlotList;
	}
	public String getState() {
		return state;
	}
	/**
	 * Le changement d'�tat est aussi contr�l� afin que aucun �tat autre que on service ou offline ne soit mis
	 * @param state
	 * @throws BadStateStationCreationException
	 */
	public void setState(String state) throws BadStateStationCreationException {
		if ( state=="on service" || state=="offline"){
			this.state = state;}
		else{
			throw new BadStateStationCreationException(state);
		}
	}
	public GPScoord getPosition() {
		return position;
	}
	public Long getStationID() {
		return stationID;
	}
	public String getName() {
		return name;
	}
	@ Override 
	public void addObserver(Observer o){
		rideList.add(o);
	}
	@ Override
	public void deleteObserver(Observer o){
		rideList.remove(o);
	}
}
