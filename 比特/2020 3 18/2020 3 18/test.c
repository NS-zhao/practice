#include<stdio.h>

//在屏幕上输出菱形

//int main()
//{
//
//	int i = 0;
//	int line = 0;
//	scanf("%d", &line);//13  7
//	for (i = 0; i < line; i++)
//	{
//		int j = 0;
//		for (j = 0; j < line -i- 1; j++)
//		{
//			printf(" ");
//		}
//		for (j = 0; j < 2 * i + 1;j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	for (i = 0; i < line - 1; i++)
//	{
//		int j = 0;
//		for (j = 0; j <= i; j++)
//		{
//			printf(" ");
//		}
//		for (j = 0; j < 2 * (line - 1 - i) - 1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	return 0;
//}





//求出0～999之间的所有“水仙花数”并输出。 
//“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3 ? ，则153是一个“水仙花数”。

//#include<math.h>
//int main()
//{
//	int i = 0;
//	for (i = 1; i <10000; i++)
//	{
//		int count = 1;
//		double sum = 0;
//		int tmp = i;
//		while (tmp / 10)
//		{
//			count++;
//			tmp /= 10;
//		}
//		tmp = i;
//		while (tmp)
//		{
//			sum += pow(tmp % 10, count);
//			tmp /= 10;
//		}
//		if (sum == i)
//		{
//			printf("%d ", i);
//		}
//	}
//	return 0;
//}
//



//#include <math.h>
//#include <stdio.h>
//
//void main()
//{
//	int x = 2;
//	int y = 3;
//
//	int z = pow(x, y);
//	printf("%d\n", z);
//}
//



//求Sn=a+aa+aaa+aaaa+aaaaa的前5项之和，其中a是一个数字， 
//例如：2 + 22 + 222 + 2222 + 22222

//int main()
//{
//	int a = 0;
//	int n = 0;
//	int sum = 0;
//	scanf("%d %d", &a, &n);
//	int i = 0;
//	int k = 0;
//	for (i = 0; i <= n; i++)
//	{
//		k= k * 10 + a;
//		sum += k;
//
//	}
//	printf("%d\n", sum);
//	return 0;
//}



//编写一个程序，可以一直接收键盘字符， 
//如果是小写字符就输出对应的大写字符，
//如果接收的是大写字符，就输出对应的小写字符，
//如果是数字不输出。

//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (ch >= 'a'&&ch <= 'z')
//		{
//			putchar(ch - 32);
//			
//		}
//		else if (ch >= 'A'&&ch <= 'Z')
//		{
//			putchar(ch + 32);
//			
//		}
//		else if (ch >= '0'&&ch <= '9')
//		{
//			continue;
//		}
//		else
//		{
//			putchar(ch);
//		}
//	}
//	return 0;
//
//}


