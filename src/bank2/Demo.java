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
			System.out.println("�û�(ʹ���û�����ǰ�����ڹ����������û�)       /t1");
			System.out.println("����                                                                              /t2");
			System.out.println("�˳�                                                                              /t0");
			System.out.println("--------------------------------------------------");
			int temp = Scan.scan();
			switch(temp) 
			{
			
			case 1:
			{
            c.run();
			System.out.println("�Ƿ������¼:1������2�˳�");
			int temp1 = new Scanner(System.in).nextInt();
			if (temp1!=1)
			 {
				System.exit(1);
			 }
		    }
			break;
			
			case 2:e.run();
			System.out.println(999);
			System.out.println("�Ƿ������¼:1������2�˳�");
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
			default:System.out.println("ָ�����,����������");break;
			}
			
		}

	}

}

