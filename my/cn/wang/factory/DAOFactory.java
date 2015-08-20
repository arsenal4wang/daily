package cn.wang.factory;

import cn.wang.dao.IUserDao;
import cn.wang.proxy.UserDaoProxy;


public class DAOFactory {
   public static IUserDao getIUserDaoInstanceDao()throws Exception{
	   return new UserDaoProxy();
   }
}
