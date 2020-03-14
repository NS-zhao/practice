#include<stdio.h>

//int main()
//{
//	int n = 0x11223344;
//	char *pc = (char *) &n;
//	int *pi = &n;
//	*pc = 0;
//	*pi = 0;
//	return 0;
//}




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
//	char arr[] = "girl";
//	int len = my_strlen(arr);
//	printf("%d\n", len);
//	return 0;
//}



//int my_strlen(char *str)
//{
//	char *start = str;
//	while (*str != '\0')
//	{
//		
//		str++;
//	}
//	return str-start;
//}
//
//int main()
//{
//	char arr[] = "girl";
//	int len = my_strlen(arr);
//	printf("%d\n", len);
//	return 0;
//}




//int main()
//{
//	int arr[10] = { 0 };
//	printf("%d\n", &arr[9] - &arr[0]);
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 0 };
//	printf("%d\n", &arr[0] - &arr[9]);
//	return 0;
//}



//int main()
//{
//	
//	int arr[10] = { 0 };
//	char ch[10] = { 0 };
//	printf("%d\n", &arr[9] - &ch[0]);
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	printf("%p\n", arr);
//	printf("%p\n", &arr[0]);
//	return 0;
//}



//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int *p = arr;
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		printf("&arr[%d] = %p <==> p+%d = %p\n", i, &arr[i], i, p + i);
//		printf("%p <==> %p\n", &arr[i], p + i);
//	}
//	return 0;
//}



//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int *p = arr;
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", *(p+i));
//		
//	}
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int *p = &a;
//	int **pp = &p;
//	**pp = 20;
//	printf("%d\n", a);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int *arr[4] = { &a, &b, &c };
//	printf("%d\n", *(arr[0]));
//	printf("%d\n", *(arr[1]));
//	printf("%d\n", *(arr[2]));
//	return 0;
//}