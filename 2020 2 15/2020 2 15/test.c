////打印100~200之间的素数 

#include<stdio.h>
//第一种方法
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		//printf("%d ", i);打印100~200之间的数
//		//判断i是否为素数
//		int j = 0;
//		for (j = 2; j < i; j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//		//两种情况
//		//1.break跳出循环，i不是素数
//		//2.j>=i(i%j == 0这个条件从来没满足过）
//		if (j >= i)
//		{
//			count++;
//			printf("%d ", i);
//		}
//		
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}


//优化方法1

//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		int j = 0;
//		for (j = 2; j <= i / 2; j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//		if (j > i / 2)
//		{
//			count++;
//			printf("%d ", i);
//		}
//
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}



//优化方法2：
//#include<math.h>
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		int j = 0;
//		for (j = 2; j <= sqrt(i); j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//
//		if (j > sqrt (i))
//		{
//			count++;
//			printf("%d ", i);
//		}
//
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}
//


//优化方法3：
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 101; i <= 200; i += 2)
//	{
//		int j = 0;
//		for (j = 2; j < i; j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//		if (j >= i)
//		{
//			count++;
//			printf("%d ", i);
//		}
//
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}
