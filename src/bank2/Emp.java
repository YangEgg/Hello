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
			System.out.println("���һ����ʼ�û�       /t1");
			System.out.println("����û�                    /t2");
			System.out.println("ɾ���û�                    /t3");
			System.out.println("����                           /t4");
			System.out.println("�������ܴ���             /t5");
			System.out.println("�����пͻ�����          /t6");
			System.out.println("�����пͻ�����          /t7");
			System.out.println("�˳�                           /t0");
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
