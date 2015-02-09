package cn.wang.dao;

import java.util.List;

import cn.wang.vo.User;

public interface IUserDao {
   public boolean doCreate(User user) throws Exception;
   public List<User> findAll(String KeyWord) throws Exception;
   public User findEmp(String id) throws Exception;
}
