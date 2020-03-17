#include<stdio.h>

//int is_leap_year(int n)
//{
//	if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0))
//		return 1;
//	else
//		return 0;
//}
//
//int main()
//{
//	int n = 0;
//	for (n = 1000; n <= 2000; n++)
//	{
//		if (is_leap_year(n) == 1)
//			printf("%d ", n);
//	}
//	return 0;
//}



//将数组A中的内容和数组B中的内容进行交换。（数组一样大）
//int main()
//{
//	int arr1[] = { 1, 3, 5, 7, 9 };
//	int arr2[] = { 2, 4, 6, 8, 0 };
//	int sz = sizeof(arr1) / sizeof(arr1[0]);
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		int tmp = arr1[i];
//		arr1[i] = arr2[i];
//		arr2[i] = tmp;
//		printf("%d ", arr1[i]);
//		
//	}
//	return 0;
//}


// 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 

//int main()
//{
//	int i = 0;
//	double sum = 0;
//	int flag = 1;
//	for (i = 1; i <= 100; i++)
//	{
//		sum += flag*1.0 / i;
//		flag = -flag;
//
//	}
//	printf("%lf\n", sum);
//	return 0;
//}



//编写程序数一下 1到 100 的所有整数中出现多少次数字9。 

//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		if (i % 10 == 9)
//		{
//			count++;
//			printf("%d ", i);
//		}
//	    if (i / 10 == 9)
//		{
//			count++;
//			printf("%d ", i);
//		}
//		
//	}
//	printf("\n");
//    printf("%d\n", count);
//	return 0;
//}
//



//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		if (i % 10 == 9)
//			count++;
//		if (i / 10 == 9)
//			count++;
//	}
//	printf("%d\n", count);
//	return 0;
//}




//在屏幕上输出菱形

int main()
{
	int i = 0;
	int line = 0;
	scanf("%d", &line);//15  7
	//上
	for (i = 0; i < line; i++)
	{
		int j = 0;
		//打印一行
		//打印空格
		for (j = 0; j < line - i - 1; j++)
		{
			printf(" ");
		}
		//打印*
		for (j = 0; j < 2 * i + 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	//下
	for (i = 0; i < line - 1; i++)
	{
		int j = 0;
		//打印空格
		for (j = 0; j <= i; j++)
		{
			printf(" ");
		}
		//打印*
		for (j = 0; j < 2 * (line - 1 - i) - 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}