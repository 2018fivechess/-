package bean;

import java.util.ArrayList;

public class UserDAO {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		System.out.println(userDAO.isLoginOK("123456", "abc123456"));
	}
	public ArrayList<User> users;
			
	public UserDAO() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		users.add(new User("123456","abc123456","codingma"));
		users.add(new User("654321","abcdf123","codemayq"));
	}
	
	public boolean isLoginOK(String phoneNumber,String password) {
		for (User user : users) {
			if (user.getPhoneNumber().equals(phoneNumber)) {
				if (user.getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
}
