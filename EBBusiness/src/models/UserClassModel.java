package models;


public class UserClassModel {
	
	private static String userName = null;
	
	private static String userCompanyName = null;
	
	private static int userRole = 0;

	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		UserClassModel.userName = userName;
	}

	public static String getUserCompanyName() {
		return userCompanyName;
	}

	public static void setUserCompanyName(String userCompanyName) {
		UserClassModel.userCompanyName = userCompanyName;
	}

	public static int getUserRole() {
		return userRole;
	}

	public static void setUserRole(int userRole) {
		UserClassModel.userRole = userRole;
	}
	
	


}
