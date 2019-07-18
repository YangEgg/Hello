package bank2;
import java.util.*;

import bank2.Cust;

public class CustDB 
{
	static List list = new ArrayList();

    public CustDB(){} 
    {

    }
    public void start() 
    {
		list.add(new Cust("小轩",111,1000,111,111));
		list.add(new Cust("小杨",222,2000,222,222));
		list.add(new Cust("小豆",333,3000,333,333));
		list.add(new Cust("小猫",444,4000,444,444));
    }
	public static void add()
	{
		    
			System.out.println("请输入要添加客户的姓名");
			String name = new Scanner(System.in).next();
			System.out.println("请输入要添加客户的用户名");
			int id = new Scanner(System.in).nextInt();
			System.out.println("请输入要添加客户的开户金额");
			int money = new Scanner(System.in).nextInt();
			System.out.println("请输入要添加客户的密码");
			int password = new Scanner(System.in).nextInt();
			System.out.println("请输入开户身份证号");
			int Idcard =new Scanner(System.in).nextInt();
			Cust c1 =new Cust(name,id,money,password,Idcard);
			list.add(c1);
			System.out.println(list.size());
			if(money>20000) 
			  {
			  System.out.println("要不要考虑购买一些理财产品");
			  }	
	}
	public static void delete()
	{
		System.out.println("请输入要删除客户的姓名");
		String name = new Scanner(System.in).next();
		for(int i = 0;i<list.size();i++)
		{
			Cust c = (Cust)list.get(i);
			if (c.name.equals(name)) 
			{
				int num = list.indexOf(c);
				list.remove(num);
			}
		}
	}
	public void count() 
	{
		double count =0;
		for(int i =0;i<list.size();i++) 
		{
			Cust c =(Cust) list.get(i);
		    count+=c.money;
		}
		System.out.println("银行总储蓄为:"+count);
		
	}
	public void change() 
	  {
    	  System.out.println("请输入需要修改密码的银行账户");
    	  CustDB cdb=new CustDB();
		  int id2 =new Scanner(System.in).nextInt();
		  System.out.println("请输入您的身份证号");
		  int Idcard = new Scanner(System.in).nextInt();
		  int flag =0;
	      for (int i = 0 ; i < cdb.list.size(); i++ )
	      {   
	    	  
	    	  Cust c = (Cust)cdb.list.get(i);
	    	  if (id2 ==c.id && Idcard ==c.Idcard) 
	    	  {
				  System.out.println("请输入新密码");
				  int newpassword =new Scanner(System.in).nextInt();
				  c.password = newpassword;
				  flag=1;
	    	  }
	    	  
	    	  
		  }
	      if (flag==1) 
	      {
	      System.out.println("改密成功");
	      }
	      else if(flag==0)
	      {
	    	  System.out.println("改密失败");
	    	  }
    }
	public void custnum() 
	{
		System.out.println("银行总客户人数为："+list.size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}













