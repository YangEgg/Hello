package bank2;

import java.util.Scanner;

public class VIPCust extends Cust
{
	public VIPCust(){}
	public  VIPCust(	String name,int id,double money,int password,int Idcard)
	  {
		  this.name=name;
		  this.money=money;
		  this.id=id;
		  this.Idcard=Idcard;
		  this.password=password;
	  }
		void draw()
		{
		    System.out.println("请输入您要取出的金额");
		    @SuppressWarnings("resource")
			int temp = new Scanner(System.in).nextInt();
		    if(temp>=money) 
		    {
		    	System.out.println("您是VIP会员，可以透支");
		    }
		    this.money-=temp;
		}  
}
