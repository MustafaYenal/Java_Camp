package kodlamaio.Northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.Northwind.business.abstracts.UserService;
import kodlamaio.Northwind.core.dataAccess.UserDao;
import kodlamaio.Northwind.core.entities.User;
import kodlamaio.Northwind.core.utilities.results.DataResult;
import kodlamaio.Northwind.core.utilities.results.Result;
import kodlamaio.Northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.Northwind.core.utilities.results.SuccessResult;

@Service
public class UserMananger implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserMananger(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add (User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}


	@Override
	public DataResult<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
	}



}
