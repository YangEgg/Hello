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
		list.add(new Cust("С��",111,1000,111,111));
		list.add(new Cust("С��",222,2000,222,222));
		list.add(new Cust("С��",333,3000,333,333));
		list.add(new Cust("Сè",444,4000,444,444));
    }
	public static void add()
	{
		    
			System.out.println("������Ҫ��ӿͻ�������");
			String name = new Scanner(System.in).next();
			System.out.println("������Ҫ��ӿͻ����û���");
			int id = new Scanner(System.in).nextInt();
			System.out.println("������Ҫ��ӿͻ��Ŀ������");
			int money = new Scanner(System.in).nextInt();
			System.out.println("������Ҫ��ӿͻ�������");
			int password = new Scanner(System.in).nextInt();
			System.out.println("�����뿪�����֤��");
			int Idcard =new Scanner(System.in).nextInt();
			Cust c1 =new Cust(name,id,money,password,Idcard);
			list.add(c1);
			System.out.println(list.size());
			if(money>20000) 
			  {
			  System.out.println("Ҫ��Ҫ���ǹ���һЩ��Ʋ�Ʒ");
			  }	
	}
	public static void delete()
	{
		System.out.println("������Ҫɾ���ͻ�������");
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
		System.out.println("�����ܴ���Ϊ:"+count);
		
	}
	public void change() 
	  {
    	  System.out.println("��������Ҫ�޸�����������˻�");
    	  CustDB cdb=new CustDB();
		  int id2 =new Scanner(System.in).nextInt();
		  System.out.println("�������������֤��");
		  int Idcard = new Scanner(System.in).nextInt();
		  int flag =0;
	      for (int i = 0 ; i < cdb.list.size(); i++ )
	      {   
	    	  
	    	  Cust c = (Cust)cdb.list.get(i);
	    	  if (id2 ==c.id && Idcard ==c.Idcard) 
	    	  {
				  System.out.println("������������");
				  int newpassword =new Scanner(System.in).nextInt();
				  c.password = newpassword;
				  flag=1;
	    	  }
	    	  
	    	  
		  }
	      if (flag==1) 
	      {
	      System.out.println("���ܳɹ�");
	      }
	      else if(flag==0)
	      {
	    	  System.out.println("����ʧ��");
	    	  }
    }
	public void custnum() 
	{
		System.out.println("�����ܿͻ�����Ϊ��"+list.size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}













