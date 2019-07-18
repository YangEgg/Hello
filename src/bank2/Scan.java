package bank2;

import java.util.Scanner;

public  class Scan
{
	 int temp;
	Scan()
	{
	}
    @SuppressWarnings("resource")
	int scan()
   {
   	int temp = new Scanner(System.in).nextInt();
		return temp;
   }

}