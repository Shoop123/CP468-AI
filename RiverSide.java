public class RiverSide{

int numMissionaries;
int numCannibals;
Boolean isHome;

//1 is left side, 0 is right side.

RiverSide(int missionaries, int cannibals, Boolean boatState){
	this.numMissionaries = missionaries;
	this.numCannibals = cannibals;
	this.isHome = boatState;
}

public int getMissionaries(){
	return numMissionaries;
}

public int getCannibals(){
	return numCannibals;
}

public Boolean getBoatState(){
	return isHome;
}

public void setMissionaries(int numMissionaries){
		this.numMissionaries=numMissionaries;
}

public void setCannibals(int numCannibals){
	this.numCannibals=numCannibals;
}

public void setState(Boolean boatState){
	this.isHome = boatState;
}


}
