package myVelib;

import java.time.LocalDateTime;

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
