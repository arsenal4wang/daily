package cn.wang.proxy;

import java.util.List;

import cn.wang.dao.IUserDao;
import cn.wang.dao.impl.UserDaoImpl;
import cn.wang.dbc.DatabaseConnection;
import cn.wang.vo.User;



public class UserDaoProxy implements IUserDao {
	public static void main(String[] args){}
	private DatabaseConnection dbcConnection = null;
	private IUserDao dao = null;

	public UserDaoProxy() throws Exception {
		this.dbcConnection = new DatabaseConnection();
		this.dao = new UserDaoImpl(this.dbcConnection.getConnection());
	}

	public boolean doCreate(User user) throws Exception {
		boolean flag = false;
		try {
			if (this.dao.findEmp(user.getId())==null) {
				flag = this.dao.doCreate(user);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbcConnection.Close();
		}
		return flag;
	}

	public List<User> findAll(String KeyWord) throws Exception {
		List<User> all = null;
		try {
			all = this.dao.findAll(KeyWord);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbcConnection.Close();
		}
		return all;
	}

	public User findEmp(String id) throws Exception {
		User user = null;
		try {
			user = this.dao.findEmp(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbcConnection.Close();
		}
		return user;
	}
}
