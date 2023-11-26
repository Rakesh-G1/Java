package group.mydiary1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import group.mydiary1.dao.UserDaoInterface;
import group.mydiary1.entities.User;

@Component
public class UserBusinessInterfaceImpl implements UserBusinessInterface {

	@Autowired
	private UserDaoInterface userDaoInterface;
	
	public UserDaoInterface getUserInterface() {
		return getUserInterface();
	}


	public void setUserInterface(UserDaoInterface userInterface) {
		this.userDaoInterface = userInterface;
	}


	public void save(User user)
	{
		
		userDaoInterface.save(user);
	}

	
	public void update(User user)
	{
		userDaoInterface.update(user);

	}

	public void delete(User user)
	{
		userDaoInterface.delete(user);
	}

	public User findById(int id) 
	{
		return userDaoInterface.findById(id);
	}

	public List<User> findAll()
	{
		return userDaoInterface.findAll();
	}
	public User findByUsername(String username)
	{
		return userDaoInterface.findByUsername(username);
	}

}
