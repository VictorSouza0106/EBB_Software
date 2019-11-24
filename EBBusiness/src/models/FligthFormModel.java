package models;

public class FligthFormModel {
	
	private static String flightOrigin = null;

	private static String flightDestiny = null;
	
	private static String flightStartDate = null;
	
	private static String flightEndDate = null;
	
	private static String flightCompanyAirline = null;
	
	private static String flightSeatPosition = null;
	
	private static boolean flightDespache = false;

	public static String getFlightOrigin() {
		return flightOrigin;
	}

	public static void setFlightOrigin(String flightOrigin) {
		FligthFormModel.flightOrigin = flightOrigin;
	}

	public static String getFlightDestiny() {
		return flightDestiny;
	}

	public static void setFlightDestiny(String flightDestiny) {
		FligthFormModel.flightDestiny = flightDestiny;
	}

	public static String getFlightStartDate() {
		return flightStartDate;
	}

	public static void setFlightStartDate(String flightStartDate) {
		FligthFormModel.flightStartDate = flightStartDate;
	}

	public static String getFlightEndDate() {
		return flightEndDate;
	}

	public static void setFlightEndDate(String flightEndDate) {
		FligthFormModel.flightEndDate = flightEndDate;
	}

	public static String getFlightCompanyAirline() {
		return flightCompanyAirline;
	}

	public static void setFlightCompanyAirline(String flightCompanyAirline) {
		FligthFormModel.flightCompanyAirline = flightCompanyAirline;
	}

	public static String getFlightSeatPosition() {
		return flightSeatPosition;
	}

	public static void setFlightSeatPosition(String flightSeatPosition) {
		FligthFormModel.flightSeatPosition = flightSeatPosition;
	}

	public static boolean isFlightDespache() {
		return flightDespache;
	}

	public static void setFlightDespache(boolean flightDespache) {
		FligthFormModel.flightDespache = flightDespache;
	}
	
	
	
	

}
