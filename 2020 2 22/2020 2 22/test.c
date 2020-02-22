#include<stdio.h>

//int is_leap_year(int n)
//{
//	if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0))
//		return 1;
//	else
//		return 0;
//}

//int is_leap_year(int n)
//{
//	return((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0));
//	
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




//int binary_search(char arr[], int k, int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	while (left <= right)
//	{
//		int mid = (left + right) / 2;
//		if (arr[mid] < k)
//		{
//			left = mid + 1;
//		}
//		else if (arr[mid] > k)
//		{
//			right = mid - 1;
//		}
//		else
//		{
//			return mid;
//		}
//	}
//	return -1;
//}
//
//int main()
//{
//	char arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 7;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int ret = binary_search(arr, k, sz);
//	if (ret == -1)
//	{
//		printf("没有\n");
//	}
//	else
//	{
//		printf("找到了，下标是：%d\n", ret);
//	}
//	return 0;
//}



//int Add(int *p)
//{
//	(*p)++;
//}
//
//int main()
//{
//	int num = 0;
//	Add(&num);
//		printf("%d\n", num);
//	Add(&num);
//		printf("%d\n", num);
//		return 0;
//}




//void new_line()
//{
//	printf("hehe\n");
//}
//
//void three_line()
//{
//	int i = 0;
//	for (i = 0; i < 3; i++)
//	{
//		new_line();
//	}
//}
//
//int main()
//{
//	three_line();
//	return 0;
//}


//#include<string.h>
//int main()
//{
//	printf("%d\n", strlen("bit"));
//	return 0;
//}


//#include<string.h>
//int main()
//{
//	int len = strlen("bit");
//	printf("%d\n", len);
//	return 0;
//}



//int main()
//{
//	printf("%d", printf("%d", printf("%d", 43)));
//	return 0;
//}



//#include"add.h"
//#include"sub.h"
//
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int ret = Add(a, b);
//	printf("ret = %d\n", ret);
//	ret = Sub(4, 5);
//	printf("ret = %d\n", ret);
//	return 0;
//}



//void print(unsigned int num)
//{
//	if (num > 9)
//	{
//		print(num / 10);
//
//	}
//	printf("%d ", num%10);
//}
//
//int main()
//{
//	unsigned int num = 1234;
//	print(num);
//	return 0;
//}



//#include<string.h>
//int my_strlen(char*str)
//{
//	if (*str == '\0')
//		return 0;
//	else
//		return 1 + my_strlen(str + 1);
//}
//
//int main()
//{
//	int len = my_strlen("abcdef");
//	printf("len = %d\n", len);
//	return 0;
//}



//int fac(int n)
//{
//	if (n <= 1)
//		return 1;
//	else
//		return n*fac(n - 1);
//}
//
//int main()
//{
//	int n = 0;
//	int ret = 0;
//	scanf("%d", &n);
//	ret = fac(n);
//	printf("%d\n", ret);
//	return 0;
//}
//



//int fib(n)
//{
//	if (n <= 2)
//		return 1;
//	else
//		return fib(n - 1) + fib(n - 2);
//}
//
//int main()
//{
//	int n = 0;
//	int ret = 0;
//	scanf("%d", &n);
//	ret = fib(n);
//	printf("%d\n", ret);
//	return 0;
//}




//int fib(int n)
//{
//	int a = 1;
//	int b = 1;
//	int c = 1;
//	while (n > 2)
//	{
//		c = a + b;
//		a = b;
//		b = c;
//		n--;
//
//	}
//	return c;
//}
//
//int main()
//{
//	int n = 0;
//	int ret = 0;
//	scanf("%d", &n);
//	ret = fib(n);
//	printf("%d\n", ret);
//	return 0;
//}