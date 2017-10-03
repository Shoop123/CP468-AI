public class RiverSide {

	private int numMissionaries;
	private int numCannibals;
	private Boolean isHome;

	// 1 is left side, 0 is right side.

	RiverSide(int missionaries, int cannibals, Boolean isHome) {
		this.numMissionaries = missionaries;
		this.numCannibals = cannibals;
		this.isHome = isHome;
	}

	public int getMissionaries() {
		return numMissionaries;
	}

	public int getCannibals() {
		return numCannibals;
	}

	public Boolean getBoatState() {
		return isHome;
	}

	public void setMissionaries(int numMissionaries) {
		this.numMissionaries = numMissionaries;
	}

	public void setCannibals(int numCannibals) {
		this.numCannibals = numCannibals;
	}

	public void setState(Boolean boatState) {
		this.isHome = boatState;
	}

}
