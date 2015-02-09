package cn.wang.test;

import cn.wang.factory.DAOFactory;
import cn.wang.vo.User;


public class TestDAOInsert {
	public static void main(String[] args)throws Exception {
          User user=null;
          for (int i = 1; i < 5; i++) {
			user=new User();
			user.setId("111");
			user.setName("wang");
			user.setPassword("wang");
			DAOFactory.getIUserDaoInstanceDao().doCreate(user);
			System.out.println("*****");
		}
	}
}
