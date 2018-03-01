package myVelib;

import java.time.LocalDateTime;
/**
 * Cette classe permet de cr�er un historique des �tats du ParkingSlot, elle se compose de deux attributs un �tat sous la forme d'un booleen
 * et une date de d�part.
 * @author xavier
 *
 */
public class TimeState {
	protected boolean occupied;
	protected LocalDateTime start;
	public TimeState(boolean occupied, LocalDateTime start) {
		super();
		this.occupied = occupied;
		this.start = start;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public LocalDateTime getStart() {
		return start;
	}
}
