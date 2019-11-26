package models;

public class HotelFormModel {
	
	private static boolean bookingHotel = false;
	
	private static String hotelCity = null;
	
	private static String ChekInDate = null;
	
	private static String CheckOutDate = null;
	
	private static boolean hasInternet = false;

	public static boolean isBookingHotel() {
		return bookingHotel;
	}

	public static void setBookingHotel(boolean bookingHotel) {
		HotelFormModel.bookingHotel = bookingHotel;
	}

	public static String getHotelCity() {
		return hotelCity;
	}

	public static void setHotelCity(String hotelCity) {
		HotelFormModel.hotelCity = hotelCity;
	}

	public static String getChekInDate() {
		return ChekInDate;
	}

	public static void setChekInDate(String chekInDate) {
		ChekInDate = chekInDate;
	}

	public static String getCheckOutDate() {
		return CheckOutDate;
	}

	public static void setCheckOutDate(String checkOutDate) {
		CheckOutDate = checkOutDate;
	}

	public static boolean isHasInternet() {
		return hasInternet;
	}

	public static void setHasInternet(boolean hasInternet) {
		HotelFormModel.hasInternet = hasInternet;
	}
	

}
