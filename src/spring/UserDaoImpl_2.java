package spring;

import org.springframework.stereotype.Repository;

@Repository("userDao2") //相当于 IUserDao userDao2 = new UserDaoImpl();
public class UserDaoImpl_2 implements IUserDao{

	public UserDaoImpl_2() {
		System.out.println("new UserDaoImpl_2() 实例化");
	}

	
}
