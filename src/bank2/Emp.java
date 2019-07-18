package bank2;

public class Emp
{
	public Emp()
	{
		
	}
	public void run() 
	{
		boolean flag = true;
		while(flag) 
		{
			Scan Scan = new Scan();
			System.out.println("----------------------");
			System.out.println("添加一批初始用户       /t1");
			System.out.println("添加用户                    /t2");
			System.out.println("删除用户                    /t3");
			System.out.println("改密                           /t4");
			System.out.println("查银行总储蓄             /t5");
			System.out.println("查银行客户人数          /t6");
			System.out.println("给所有客户排序          /t7");
			System.out.println("退出                           /t0");
			System.out.println("----------------------");
			CustDB CDB = new CustDB();
			int temp = Scan.scan();
			switch(temp)
			{
			case 1:CDB.start();break;
			case 2:CDB.add();break;
			case 3:CDB.delete();break;
			case 4:CDB.change();break;
			case 5:CDB.count();break;
			case 6:CDB.custnum();break;
			case 0:flag=false;break;
			case 7:break;
		    default:System.exit(1);
			}
		}
	}
	
}
