#include<stdio.h>

//void bubble_sort(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz - 1; i++)
//	{
//		int j = 0;
//		for (j = 0; j < sz - 1 - i; j++)
//		{
//			if (arr[j]>arr[j + 1])
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//			}
//			
//		}
//	}
//}
//
//int main()
//{
//	int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	bubble_sort(arr, sz);
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	return 0;
//}




//int main()
//{
//	int a = -1;
//	//a  10000000000000000000000000000001
//	//   11111111111111111111111111111110
//	//   11111111111111111111111111111111
//	int b = a >> 1;
//	printf("%d\n", b);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int b = 5;
//	int c = a&b;
//	int d = a | b;
//	int e = a^b;
//	//a      00000000000000000000000000001010
//	//b      00000000000000000000000000000101
//	//a&b    00000000000000000000000000000000
//	//a|b    00000000000000000000000000001111
//	//a^b    00000000000000000000000000001111
//	printf("%d %d %d\n", c, d, e);
//	return 0;
//}



//int main()
//{
//	int num1 = 1;
//	int num2 = 2;
//	int a = num1&num2;
//	int b = num1 | num2;
//	int c = num1^num2;
//	printf("%d %d %d\n", a, b, c);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int b = 20;
//	a = a^b;
//	b = a^b;
//	a = a^b;
//	printf("%d %d\n", a, b);
//	return 0;
//}




//int main()
//{
//	int num = 0;
//	int count = 0;
//	while (num)
//	{
//		if (num % 2 == 1)
//			count++;
//		num = num / 2;
//	}
//	printf("二进制中1的个数 = %d\n", count);
//	return 0;
//}



//int main()
//{
//	int num = -1;
//	int i = 0;
//	int count = 0;
//	for (i = 0; i < 32; i++)
//	{
//		if (((num >> i) & 1) == 1)
//			count++;
//	}
//	printf("二进制中1的个数 = %d\n", count);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	char c = 'w';
//	int *pa = &a;
//	*pa = 20;
//	printf("%d\n", a);
//	printf("%p\n", &a);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	printf("%d\n", sizeof(a));
//	printf("%d\n", sizeof a);
//	printf("%d\n", sizeof(int));
//	return 0;
//}



//int main()
//{
//	int a = 0;
//	a--;
//	if (a < sizeof(int))
//	{
//		printf("hehe\n");
//	}
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 0 };
//	printf("%d\n", sizeof(arr));
//	printf("%d\n", sizeof(int[10]));
//	printf("%d\n", sizeof(int[5]));
//	return 0;
//}



//int main()
//{
//	int a = -10;
//	int *p = NULL;
//	printf("%d\n", !2);
//	printf("%d\n", !0);
//	a = -a;
//	p = &a;
//	printf("%d\n", sizeof(a));
//	printf("%d\n", sizeof(int));
//}




//void test1(int arr[])
//{
//	printf("%d\n", sizeof(arr));
//}
//
//void test2(char ch[])
//{
//	printf("%d\n", sizeof(ch));
//}
//
//int main()
//{
//	int arr[10] = { 0 };
//	char ch[10] = { 0 };
//	printf("%d\n", sizeof(arr));
//	printf("%d\n", sizeof(ch));
//	test1(arr);
//	test2(ch);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int x = ++a;
//	int y = --a;
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int x = a++;
//	int y = a--;
//	printf("%d %d\n", x, y);
//	return 0;
//}



//int main()
//{
//	int a = 5;
//	int b = 10;
//	int c = a&&b;
//	int d = a || b;
//	printf("%d\n", c);
//	printf("%d\n", d);
//	return 0;
//}


//int main()
//{
//	int i = 0, a = 0, b = 2, c = 3, d = 4;
//	i = a++&& ++b && d++;
//	printf("a = %d\n b = %d\n c = %d\n d = %d\n", a, b, c, d);
//	return 0;
//}


//int main()
//{
//	int i = 0, a = 0, b = 2, c = 3, d = 4;
//	i = a++ || ++b || d++;
//	printf("a = %d\n b = %d\n c = %d\n d = %d\n", a, b, c, d);
//	return 0;
//}



//int main()
//{
//	int a = 20;
//	int b = 10;
//	int max = a > b ? a : b;
//	printf("%d\n", max);
//	return 0;
//}