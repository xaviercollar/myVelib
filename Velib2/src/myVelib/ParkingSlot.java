package myVelib;

import java.util.ArrayList;
/**
 * Une classe permettant de cr�er les objets de m�me nom
 * @author xavier
 *
 */
public class ParkingSlot {
	protected static Long compteur=(long) 0;
	protected Long slotID;
	protected String state;
	protected Bicycle bicycle;
	protected ArrayList<TimeState> history;
	/**
	 * Ce contructeur peux �tre amener � renvoyer une erreur dans le cas o� le type d'�tat n'a pas �t� �crit correctement ou n'existe pas
	 * @param bicycle
	 * @param State
	 * @throws BadParkingSlotCreationException
	 */
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
	/**
	 * Le changement d'�tat est aussi contr�l� afin seul les �tats possibles soit mis
	 * @param state
	 * @throws BadParkingSlotCreationException 
	 */
	public void setState(String state) throws BadParkingSlotCreationException {
		if (state=="Occupied" || state=="Free" ||state=="Broken"){
			this.state = state;}
		else{
			throw new BadParkingSlotCreationException(state);}
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
