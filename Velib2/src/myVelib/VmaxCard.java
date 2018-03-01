package myVelib;

import java.util.concurrent.TimeUnit;

public class VmaxCard extends Card{
	@Override
	public int getCharge(Location loc, User user) {
		if (loc.getArrival().getTypeStation().equals("Plus")) {
			this.setTimeCredit(this.getTimeCredit()+5);
		}
		long duration = Card.getDuration(loc.getTimeStart(), loc.getTimeStart(), TimeUnit.MINUTES);
		long hours = duration%60;
		if (loc.getBike().getTypeBike().equals("Mechanic")) {
			if (hours<=1) {
				return 0;
			}
			else 
				return (int)hours;
		}
		else
			if(loc.getBike().getTypeBike().equals("Electric")) {
				if (hours<=1) {
					return 1;
				}
				else 
					return 2*(int)hours+1;
			}
		return 0;
	}

}
