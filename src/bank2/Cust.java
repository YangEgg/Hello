package bank2;

import java.util.Scanner;

import bank2.Cust;
import bank2.Emp;

public class Cust 
{
  String name;
  double money;
  int id;
  int Idcard;
  int password;

  public Cust(){}
  public Cust(	String name,int id,double money,int password,int Idcard)
  {
	  this.name=name;
	  this.money=money;
	  this.id=id;
	  this.Idcard=Idcard;
	  this.password=password;
  }
  
  
  
  public  void run() 
	{
	    int j =1;
	    int count = 0 ;
	    int flag2=0;
	    CustDB cdb=new CustDB();
	    int  f[] =new int[cdb.list.size()];
		boolean flag = true;
		System.out.println("请输入您的账号");
		int id = new Scanner(System.in).nextInt();
		if(id==f[j-1]) {
			System.out.println("此账号已被冻结");
		}
		for (int i = 0 ; i < cdb.list.size(); i++ )
		{  	
			Cust c = (Cust)cdb.list.get(i);
			if(c.money>3000)
			if(id==f[j-1])
			{
			break;
			}			   
			if (id== c.id)
			{   
				flag2 = 1;
				int flag1=0;
				System.out.println("请输入您的密码");
			    int Password = new Scanner(System.in).nextInt();

				if (Password ==c.password)
				{				
				while (flag)
				{   
					System.out.println("您好"+c.name);
					System.out.println("取款请按\t1");
					System.out.println("存款请按\t2");
					System.out.println("查询请按\t3");
					System.out.println("转账请按\t4");
					System.out.println("退出请按\t0");
					int tempKey = new Scanner(System.in).nextInt();
					switch (tempKey)
					{
					case 1:VIPCust c2=new VIPCust();
					case 2:c.deposit();break;
					case 3:c.balancePrint();break;
					
					case 4:
						  System.out.println("请输入您想要转入的银行账户");
						  int id1 =new Scanner(System.in).nextInt();
						  System.out.println("请输入您的转账金额");
						  double outmoney = new Scanner(System.in).nextInt();
					      c.transferOut(outmoney);
					      for (i = 0 ; i < cdb.list.size(); i++ )
					      {   
					    	  Cust c1 = (Cust)cdb.list.get(i);
					    	  if (id1 == c1.id) 
					    	  {
					    		  c1.transferIn(outmoney);
					    		  flag1=1;
					    	  }
					    	  
						  }
					      if (flag1==1) 
					      {
					      System.out.println("转账成功");
					      }
					      else if(flag1==0)
					      {
					    	  System.out.println("转入账户不存在，转账失败");
					      }
					      break;

					case 0:flag=false;break;
					default:System.out.println("没有该操作");break;
					}
				}
				}
				else {
					System.out.println("密码错误，请重新登录");
					count++;
					 if(count==3) {
							f[j]=c.id;
							j++;
							
						}

				}
			    
			}
		      else if(flag2==0 && i==cdb.list.size()-1)
		      {
		    	  System.out.println("此账户不存在");
		      }
		}
	}
	void deposit()
	{ 
	    System.out.println("请输入您要存入的金额");
	    @SuppressWarnings("resource")
		int temp = new Scanner(System.in).nextInt();
	    this.money+=temp;
	}
	
	void draw()
	{
	    System.out.println("请输入您要取出的金额");
	    @SuppressWarnings("resource")
		int temp = new Scanner(System.in).nextInt();
	    if(temp<=money) {
	    this.money-=temp;
	    }
	    else {
	    	System.out.println("存款不足"+"您目前的余额为"+money);
	    }
	}      
	void balancePrint()
	{ 
		System.out.println("您的余额为"+money);
	}
	

	void transferOut(double outmoney) 
	{ 
		this.money-=outmoney;
		
	}
	void transferIn(double outmoney) 
	{ 
		this.money+=outmoney;
		
	}
}











































