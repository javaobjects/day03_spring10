package spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("userService") //相当于UserService userService = new UserService();
public class UserService {

//	@Autowired @Qualifier//默认根据属性的类型进行匹配，如果对应的类型出现多个子类，再根据属性的名称进行匹配
	
	@Resource(name="userDao")//默认根据名称进行匹配
	private IUserDao userdao;
	
//	@Autowired //默认根据属性的类型进行匹配
	private String username;
	
	public void findUsers() {
		System.out.println("username" + username);
	}
}
