package ie.provector.jpbce;

public class Tools {
	
	public final static String RESET_JSON = "{\"challengeFilename\":\"challenge_jpbce_editor_challenge.xml\",\"challengeDescriptionFilename\":\"en_challenge_jpbce_editor_challenge.xml\",\"challengeName\":\"jPBCE Editor Challenge\",\"colonyNameString\":\"JPBCE Colony\",\"challengeDescriptionString\":\"Created with jPBCE\",\"objectiveDescriptionString\":\"Open Ended\",\"objectiveDoneString\":\"Made with jPBCE\",\"difficulty\":1,\"planetClass\":\"D\",\"latitude\":0,\"longtitude\":0,\"startWorker\":0,\"startBiologist\":0,\"startEngineer\":0,\"startMedic\":0,\"startGuard\":0,\"startConstructor\":0,\"startCarrier\":0,\"startDriller\":0,\"startMetal\":0,\"startBioplastic\":0,\"startMeal\":0,\"startSpares\":0,\"startMedicalSupplies\":0,\"startCoins\":0,\"startSemiconductors\":0,\"startGun\":0,\"startAlcoholicDrink\":0,\"disableColonistsShips\":false,\"disableTraderTechs\":false,\"disableVisitorRequirements\":false,\"disableVisitorShips\":false,\"disableTradingShips\":false,\"disableShipRecycling\":false,\"disableWorkerMining\":false,\"disableNoMedicalSuppliesWarning\":false,\"infiniteTraderBots\":false,\"disasterFrequency\":0.0,\"shipFrequency\":0.0,\"tradingShipFrequency\":0.0,\"intruderMinPrestige\":0,\"extraIntruders\":0,\"dayHours\":0,\"dayHoursSet\":false,\"nightHours\":0,\"nightHoursSet\":false,\"removeSatellites\":false,\"environmentIndex\":0,\"environmentIndexSet\":false,\"sunIndex\":0,\"sunIndexSet\":false,\"backdropsIndex\":0,\"backdropsIndexSet\":false,\"fogIntensityDay\":0.0,\"fogIntensityDaySet\":false,\"fogIntensityNight\":0.0,\"fogIntensityNightSet\":false,\"fogIntensityTwilight\":0.0,\"fogIntensityTwilightSet\":false,\"heightMultiplier\":0.0,\"heightMultiplierSet\":false,\"craterDensity\":0.0,\"craterDensitySet\":false,\"distantHeightOffset\":0.0,\"distantHeightOffsetSet\":false,\"liquidAmount\":0.0,\"liquidAmountSet\":false,\"heightOffset\":0.0,\"heightOffsetSet\":false,\"reachPopulation\":0,\"reachBots\":0,\"reachPrestige\":0,\"reachWelfare\":0,\"survivalTime\":0,\"timeLimit\":0}"; 
	
	public static boolean isAlpha(String name) {
	    return name.matches("[a-zA-Z]+");
	}
	
	public static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
