//#include "add.h";
//#include "sub.h"
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



//#include<stdio.h>
//
//int main()
//{
//	printf("hehe\n");
//	main();
//	return 0;
//}




//void Print(unsigned int num)
//{
//	if (num > 9)
//	{
//		Print(num / 10);
//	}
//	printf("%d ", num % 10);
//}
//
//int main()
//{
//	unsigned int num = 1234;
//	Print(num);
//	return 0;
//}



//int my_strlen(char *str)
//{
//	if (*str == '\0')
//		return 0;
//	else
//		return 1 + my_strlen(str + 1);
//}
//
//int main()
//{
//	int len = my_strlen("girl");
//	printf('%d\n', len);
//	return 0;
//}



//int strlen(char *str)
//{
//	if (*str == '\0')
//		return 0;
//	else
//		return 1 + strlen(str + 1);
//}
//
//int main()
//{
//	char *p = "abcdef";
//	int len = strlen(p);
//	printf("%d\n", len);
//	return 0;
//}



//int my_strlen(char *str)
//{
//	if (*str == '\0')
//		return 0;
//	else
//		return 1 + my_strlen(str + 1);
//}
//
//int main()
//{
//	char *p = "girl";
//	int len = my_strlen(p);
//	printf("%d\n", len);
//	return 0;
//}




//int my_strlen(char *str)
//{
//	if (*str == '\0')
//		return 0;
//	else
//		return 1 + my_strlen(str + 1);
//}
//
//int main()
//{
//	int len = my_strlen("girl");
//	printf("%d\n", len);
//	return 0;
//}



//void test(int n)
//{
//	if (n <= 10000)
//	{
//		test(n + 1);
//	}
//}
//
//int main()
//{
//	test(1);
//	return 0;
//}



//#include<string.h>
//
//int my_strlen(char *str)
//{
//	int count = 0;
//	while (*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//
//int main()
//{
//	int len = my_strlen("girl");
//	printf("len = %d\n", len);
//	return 0;
//}