#include<stdio.h>

//int main()
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", i);
//	}
//	getchar();
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	for (i = 0; i < 12; i++)
//	{
//		arr[i] = 0;
//		printf("hehe\n");
//	}
//	getchar();
//	return 0;
//}




//void test2()
//{
//	printf("hehe\n");
//}
//
//void test1()
//{
//	test2();
//}
//
//void test()
//{
//	test1();
//}
//int main()
//{
//	test();
//	return 0;
//}




//int main()
//{
//	int n = 0;
//	int ret = 1;
//	int i = 0;
//	int j = 0;
//	int sum = 0;
//	scanf("%d", &n);
//	for (j = 1; j <= n; j++)
//	{
//		for (i = 1; i <= j; i++)
//		{
//			ret *= i;
//		}
//		sum += ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//
//}//error





//int main()
//{
//	int n = 0;
//	int ret = 1;
//	int i = 0;
//	int j = 0;
//	int sum = 0;
//	scanf("%d", &n);
//	for (j = 1; j <= n; j++)
//	{
//		ret = 1;
//		for (i = 1; i <= j; i++)
//		{
//			ret *= i;
//		}
//		sum += ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//
//}


//int main()
//{
//	int n = 0;
//	int i = 0;
//	int j = 0;
//	int sum = 0;
//	scanf("%d", &n);
//	for (j = 1; j <= n; j++)
//	{
//		int ret = 1;
//		for (i = 1; i <= j; i++)
//		{
//			ret *= i;
//		}
//		sum += ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//
//}




//int main()
//{
//	char arr[] = { 'b', 'i', 't' };
//	char buf[10] = { 0 };
//	strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}


//int main()
//{
//	char arr[] = { 'b', 'i', 't' ,'\0'};
//	char buf[10] = { 0 };
//	strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}


//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}




//void my_strcpy(char *dest, char *src)
//
//{
//	while (*src != '\0')
//	{
//		*dest = *src;
//		src++;
//		dest++;
//	}
//	*dest = '\0';
//}
//
//int main()
//{
//	char arr[] ="bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}




//void my_strcpy(char *dest, char *src)
//
//{
//	while (*src != '\0')
//	{
//		*dest++ = *src++;
//		
//	}
//	*dest = '\0';
//}
//
//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}




//void my_strcpy(char *dest, char *src)
//
//{
//	while (*dest++ = *src++)
//	{
//		;
//	}
//	
//}
//
//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}