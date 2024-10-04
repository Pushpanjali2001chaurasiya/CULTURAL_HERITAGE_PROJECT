package org.culture.heritage.service;

import java.util.List;

import org.culture.heritage.model.UserDtls;

public interface UserService {

	public UserDtls saveUser(UserDtls user);
	public UserDtls getUserByEmail(String email);
	public void updateUserResetToken(String email, String resetToken);
	
	public UserDtls getUserByToken(String token);
	
	public UserDtls updateUser(UserDtls user);
	
	  public Boolean existsEmail(String email);
		public List<UserDtls> getUsers(String role);


}
