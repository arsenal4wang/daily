package cn.wang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wang.dao.*;
import cn.wang.vo.User;

public class UserDaoImpl implements IUserDao {

	public static void main(String[] args){}
	private Connection connection = null;
	private PreparedStatement pStatement = null;

	public UserDaoImpl(Connection con) {
		this.connection = con;
	}
	public boolean doCreate(User user) throws Exception {
		boolean flag = false;
		String sql ="insert into users(id,name,password) values(?,?,?)";
		this.pStatement = this.connection.prepareStatement(sql);
		this.pStatement.setString(1,user.getId());
		this.pStatement.setString(2,user.getName());
		this.pStatement.setString(3,user.getPassword());
		if (this.pStatement.executeUpdate()>0) {
			flag = true;
		}
		this.pStatement.close();
		return flag;
	}
	@Override
	public List<User> findAll(String KeyWord) throws Exception {

		List<User> all = new ArrayList<User>();
		String sql = "select id ,name,password from users where id LIKE ? OR name LIKE ?";
		this.pStatement = this.connection.prepareStatement(sql);
		this.pStatement.setString(1, "%" + KeyWord + "%");
		this.pStatement.setString(2, "%" + KeyWord + "%");
		ResultSet rSet = this.pStatement.executeQuery();
		User user = null;
		while (rSet.next()) {
			user = new User();
			user.setId(rSet.getString(1));
			user.setName(rSet.getString(2));
			user.setPassword(rSet.getString(3));
			all.add(user);
		}
		this.pStatement.close();
		return all;
	}

	@Override
	public User findEmp(String id) throws Exception {
		User user = null;
		String sql = "select id ,name,password from users where id=?";
		this.pStatement = this.connection.prepareStatement(sql);
		this.pStatement.setString(1,id);
		ResultSet rSet = this.pStatement.executeQuery();
		if (rSet.next()) {
			user = new User();
			user.setId(rSet.getString(1));
			user.setName(rSet.getString(2));
			user.setPassword(rSet.getString(3));
		}
		this.pStatement.close();
		return user;
	}
}
