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
		    System.out.println("��������Ҫȡ���Ľ��");
		    @SuppressWarnings("resource")
			int temp = new Scanner(System.in).nextInt();
		    if(temp>=money) 
		    {
		    	System.out.println("����VIP��Ա������͸֧");
		    }
		    this.money-=temp;
		}  
}
