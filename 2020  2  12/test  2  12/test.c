#include<stdio.h>
//打印100~200之间的素数
//int main()
//{
//	int n = 0;
//	for (n = 100; n < 200; n++)
//	{
//		int i = 0;
//		for (i = 2; i < n; i++)
//		{
//			if (n%i == 0)
//			{
//				break;
//			}
//		}
//		if (n == i)
//		{
//			printf("n = %d\n", n);
//		}
//	}
//	
//	return 0;
//}


//输出乘法口诀表
//int main()
//{
//	int i = 0;
//	for (i = 1; i < 10; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d = %-4d", i, j, i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//	
//}


//判断1000年-- - 2000年之间的闰年
//int main()
//{
//	int n = 0;
//	for (n = 1000; n <= 2000; n++)
//	{
//		if (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0))
//		{
//			printf("n = %d\n", n);
//		}
//	} 
//	return 0;
//}