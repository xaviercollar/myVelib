package myVelib;

import java.util.ArrayList;

public class ParkingSlot {
	protected static Long compteur=(long) 0;
	protected Long slotID;
	protected String state;
	protected Bicycle bicycle;
	protected ArrayList<TimeState> history;
	public ParkingSlot(Bicycle bicycle, String State) throws BadParkingSlotCreationException {
		super();
		if (State=="Occupied" || State=="Free" ||State=="Broken"){
		compteur=compteur+1;
		slotID=compteur;
		this.bicycle = bicycle;
		this.state= State;
		this.history = new ArrayList<TimeState>();}
		else{
			throw new BadParkingSlotCreationException(State);}
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getSlotID() {
		return slotID;
	}
	public Bicycle getBicycle() {
		return bicycle;
	}
	public ArrayList<TimeState> getHistory() {
		return history;
	}
	
}
