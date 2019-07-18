package bank2;

import java.util.*;
import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		VIPCust c = new VIPCust();
		Emp e =new Emp();
		
		while(true) 
		{
			Scan Scan = new Scan();
			System.out.println("--------------------------------------------------");
			System.out.println("用户(使用用户功能前需先在管理界面添加用户)       /t1");
			System.out.println("管理                                                                              /t2");
			System.out.println("退出                                                                              /t0");
			System.out.println("--------------------------------------------------");
			int temp = Scan.scan();
			switch(temp) 
			{
			
			case 1:
			{
            c.run();
			System.out.println("是否继续登录:1继续；2退出");
			int temp1 = new Scanner(System.in).nextInt();
			if (temp1!=1)
			 {
				System.exit(1);
			 }
		    }
			break;
			
			case 2:e.run();
			System.out.println(999);
			System.out.println("是否继续登录:1继续；2退出");
			int temp1 = new Scanner(System.in).nextInt();
			if (temp1!=1)
			{
				System.exit(1);
			}
			break;
			
			
			case 0:
			{
				return;
			}
			default:System.out.println("指令不存在,请重新输入");break;
			}
			
		}

	}

}

