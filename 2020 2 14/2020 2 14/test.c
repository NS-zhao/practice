//给定两个整形变量的值，将两个值的内容进行交换。
#include<stdio.h>
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 0;
//	c = a; a = b; b = c;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}


//不允许创建临时变量，交换两个数的内容（附加题）
//一个整数a在异或另一个整数b两次以后所得的值还是整数a
//int main()
//{
//	int a = 10;
//	int b = 20;
//	a = a^b;
//	b = a^b;
//	a = a^b;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}



//求10 个整数中最大值。 
//int main()
//{
//	char arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int max = 0;
//	max = arr[0];
//	int i = 0;
//	for (i = 0; i < 10; i++)
//		if (max < arr[i])
//			max = arr[i];
//	printf("max = %d\n", max);
//	return 0;
//}



//将三个数按从大到小输出
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int i = 0;
//	if (a < b)
//	{
//		i = a; a = b; b = i;
//	}
//	if (a < c)
//	{
//		i = a; a = c; c = i;
//	}
//	if (b < c)
//	{
//		i = c; c = b; b = i;
//	}
//	printf("%-8d%-8d%-8d\n", a,b,c);
//	return 0;
//}




//求两个数的最大公约数。
//int main()
//{
//	int a = 40;
//	int b = 60;
//	int i = 2;
//	int n = 0;
//	for (i = 2; i <= 40; i++)
//		if ((a % i == 0) && (b%i == 0))
//			if (n < i)
//				n = i;
//	printf("%d\n", n);
//	return 0;
//}