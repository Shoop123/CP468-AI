public class River{
	private RiverSide leftSide;
	private RiverSide rightSide;
	Boolean isValid;
	private int LEFT_HAS_BOAT = 1;
	private int RIGHT_HAS_BOAT = 0;
	private int boatSide;
	
	River(RiverSide left, RiverSide right){
		this.leftSide = left;
		this.rightSide = right;
		this.isValid = validateSides();
		this.boatSide = findBoat();
	}
	
	private Boolean validateSides(){
		//River is invalid if One side has more cannibals then missionaries, or both sides don't have the boat.
		Boolean isValid = true;
		if(leftSide.getMissionaries < leftSide.getCannibals){
			isValid = false;
		}
		if(rightSide.getMissionaries < rightSide.getCannibals){
			isValid = false;
		}
		if(leftSide.getBoatState == 0 && rightSide.getBoatState == 0){
			isValid = false;
		}
		return isValid;
	}
	
	private int findBoat(){
		if(leftSide.getBoatState == true){
			return LEFT_HAS_BOAT;
		}
		else{
			return RIGHT_HAS_BOAT;
		}
	}
	
	public Boolean isValid(){
		return isValid;
	}
	
	//What other actions need to be programmed?
	
	public int getBoatSide(){
		return boatState;
	}
	
	public River Cross(int numMissionaries, int numCannibals){
		if(getBoatSide == LEFT_HAS_BOAT){
			//moving to the right.
			leftSide.setMissionaries(leftSide.getMissionaries-numMissionaries);
			rightSide.setMissionaries(rightSide.getMissionaries+numMissionaries);
			leftSide.setCannibals(leftSide.getCannibals-numCannibals);
			rightSide.setCannibals(rightSide.getCannibals+numCannibals);
			leftSide.setState = RIGHT_HAS_BOAT;
			rightSide.setState = RIGHT_HAS_BOAT;
		}
		else{
			//moving to the left.
			leftSide.setMissionaries(leftSide.getMissionaries+numMissionaries);
			rightSide.setMissionaries(rightSide.getMissionaries-numMissionaries);
			leftSide.setCannibals(leftSide.getCannibals+numCannibals);
			rightSide.setCannibals(rightSide.getCannibals-numCannibals);
			leftSide.setState = LEFT_HAS_BOAT;
			rightSide.setState = LEFT_HAS_BOAT;
		}
		River newRiver = new River(leftSide,rightSide);
		return newRiver;
	}
}

