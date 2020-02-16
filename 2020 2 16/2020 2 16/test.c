#include<stdio.h>
//输出乘法口诀表 
//int main()
//{
//	int i = 0;
//	for (i = 1; i < 10; i++)
//	{
//		//打印一行
//		int j = 0;
//		for (j = 1; j <=i; j++)
//		{
//			printf("%d*%d = %-4d", j,i , i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//}



// 判断1000年---2000年之间的闰年 
//第一种方法
//int main()
//{
//	int year = 0;
//	for (year = 1000; year <= 2000; year++)
//	{
//		if (year % 4 == 0)
//		{
//			if (year % 100 != 0)
//			{
//				printf("%d ",year);
//			}
//		}
//		if (year % 400 == 0)//不能用else if,因为year%4要是成立，程序就不会跑到else if这里
//		{
//			printf("%d ", year);
//		}
//			
//	}
//	return 0;
//}



//第二种方法
//int main()
//{
//	int year = 0;
//	for (year = 1000; year <= 2000; year++)
//	{
//		if ((year%4 == 0)&&(year%100!=0) || (year%400 == 0))
//
//			printf("%d ", year);
//	}
//	return 0;
//}





//void test()
//{
//	int i = 0;
//	i++;
//	printf("%d ", i);//1 1 1 1 1 1 1 1 1 1 
//}
//int main()
//{
//	int i = 0;//i为局部变量：局部变量的生命周期：进了范围创建，出了范围不存在
//	for (i = 0; i < 10; i++)
//	{
//		test();
//	}
//	return 0;
//}

//static修饰局部变量：
//改变了变量的生命周期，让静态局部变量出了作用域依然存在，到程序结束，生命周期才结束



//void test()
//{
//	static int i = 0;
//	i++;
//	printf("%d ", i);//1 2 3 4 5 6 7 8 9 10
//}
//int main()
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		test();
//	}
//	return 0;
//}



//extern int g_val;
//int main()
//{
//	printf("%d\n", g_val);
//	return 0;
//}


//static修饰全局变量
//改变了全局变量的作用域


//extern int Add(int x, int y);
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = Add(a, b);
//	printf("%d\n", c);
//	return 0;
//}


//static修饰函数
//改变了函数的作用域


//#define NUM 1000
//int main()
//{
//	printf("%d\n", NUM);
//	return 0;
//}


//#define ADD(X,Y) (X+Y)
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = ADD(a, b);
//	//int c = (a+b);
//	printf("c = %d\n", c);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	printf("%p\n", &a);
//	return 0;
//}


//int main()
//{
//	int a = 10;
//	int *p = &a;
//	*p = 20;
//	printf("a = %d\n", a);
//	printf("%p\n", &a);
//	char ch = 'w';
//	char * pc = &ch;
//
//	return 0;
//}



//int main()
//{
//	printf("%d\n", sizeof(char *));
//	printf("%d\n", sizeof(short *));
//	printf("%d\n", sizeof(int *));
//	printf("%d\n", sizeof(float *));
//	printf("%d\n", sizeof(double *));
//	return 0;
//}


