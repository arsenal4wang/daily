package org.exception;

public class exceptiondemo01 {

	public static void main(String[] args) {
          int i=10;
          int j=0;
       try{
    		   int temp=i/j;
    		   System.out.println("两数相除的结果为"+ temp);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("出现异常"+e);
       
	}
       finally {
    	 System.out.println("不管执行哪部分，此部分都执行");
       }
	
	}
}
