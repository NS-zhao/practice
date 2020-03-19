#include<stdio.h>

//编写一个函数实现n^k,使用递归实现

//int pow(int n, int k)
//{
//	if (k > 0)
//		return n*pow(n, k - 1);
//	else if (k == 0)
//		return 1;
//	else
//		return 1.0 / pow(n, -k);
//}
//
//int main()
//{
//	int n = 0;
//	int k = 0;
//	scanf("%d %d", &n, &k);
//	double ret = pow(n, k);
//	printf("%lf\n", ret);
//}




//strlen的常规写法和递归写法

//常规写法



//int my_strlen( char*str)
//{
//	int count = 0;
//	
//	while (*str!= '\0')
//	{
//		count++;
//
//		str++;
//	}
//	return count;
//}
//
//int main()
//{
//	char arr[] = "girl";
//	int len = my_strlen(arr);
//	printf("len = %d\n",  len);
//	return;
//}



//递归写法

//int my_strlen(char*str)
//{
//	int count = 0;
//
//	if (*str != '\0')
//		return 1 + my_strlen(str + 1);
//	else
//		return 0;
//}
//
//int main()
//{
//	char arr[] = "girl";
//	int len = my_strlen(arr);
//	printf("len = %d\n", len);
//	return;
//}