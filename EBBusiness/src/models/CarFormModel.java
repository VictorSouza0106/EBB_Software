package models;

public class CarFormModel {

	private static boolean rentCar = false;
	
	private static String carStartDate = null;
	
	private static String carEndDate = null;
	
	private static String classification = null;
	
	private static String typeCar = null;
	
	private static String BrandCar = null;

	public static boolean isRentCar() {
		return rentCar;
	}

	public static void setRentCar(boolean rentCar) {
		CarFormModel.rentCar = rentCar;
	}

	public static String getCarStartDate() {
		return carStartDate;
	}

	public static void setCarStartDate(String carStartDate) {
		CarFormModel.carStartDate = carStartDate;
	}

	public static String getCarEndDate() {
		return carEndDate;
	}

	public static void setCarEndDate(String carEndDate) {
		CarFormModel.carEndDate = carEndDate;
	}

	public static String getClassification() {
		return classification;
	}

	public static void setClassification(String classification) {
		CarFormModel.classification = classification;
	}

	public static String getTypeCar() {
		return typeCar;
	}

	public static void setTypeCar(String typeCar) {
		CarFormModel.typeCar = typeCar;
	}

	public static String getBrandCar() {
		return BrandCar;
	}

	public static void setBrandCar(String brandCar) {
		BrandCar = brandCar;
	}
	
}
