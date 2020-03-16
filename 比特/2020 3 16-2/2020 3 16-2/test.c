#include<stdio.h>

//给定两个整形变量的值，将两个值的内容进行交换。

//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 0;
//	printf("a = %d b = %d\n", a, b);
//	c = a;
//	a = b;
//	b = c;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}




//不允许创建临时变量，交换两个数的内容（附加题） 
//int main()
//{
//	int a = 10;
//	int b = 20;
//	
//	printf("a = %d b = %d\n", a, b);
//	a = a^b;
//	b = a^b;
//	a = a^b;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}



//求10 个整数中最大值。

//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int max = arr[0];
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	for (i = 1; i < sz; i++)
//	{
//		if (arr[i]>max)
//		{
//			max = arr[i];
//		}
//	}
//	printf("max = %d\n", max);
//	return 0;
//}


//将三个数按从大到小输出。 

//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = 3;
//	if (a < b)
//	{
//		int tmp = a;
//		a = b;
//		b = tmp;
//	}
//
//	if (a < c)
//	{
//		int tmp = a;
//		a = c;
//		c = tmp;
//	}
//
//	if (b < c)
//	{
//		int tmp = b;
//		b = c;
//		c = tmp;
//	}
//
//	printf("%d %d %d\n", a, b, c);
//	return 0;
//}



//void Swap(int *px, int *py)
//{
//	int tmp = 0;
//	tmp = *px;
//	*px = *py;
//	*py = tmp;
//}
//
//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = 3;
//	if (a < b)
//	{
//		Swap(&a, &b);
//	}
//
//	if (a < c)
//	{
//		Swap(&a, &c);
//	}
//
//	if (b < c)
//	{
//		Swap(&b, &c);
//	}
//
//	printf("%d %d %d\n", a, b, c);
//	return 0;
//}




//求两个数的最大公约数。

//int main()
//{
//	int a = 50;
//	int b = 70;
//	int c = 0;
//	while (c = a%b)
//	{
//		a = b;
//		b = c;
//
//	}
//	printf("%d\n", b);
//	return 0;
//}