package spring;

import org.springframework.stereotype.Repository;

@Repository("userDao") //相当于IUserDao userDao = new UserDaoImpl()
public class UserDaoImpl implements IUserDao{

	public UserDaoImpl() {
		System.out.println("new UserDaoImpl()实例化");
	}
}
