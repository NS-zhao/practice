#include<stdio.h>

//int main()
//{
//	int num = 10;
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
//	int num = -1;
//	int i = 0;
//	int count = 0;
//	while (num)
//	{
//		count++;
//		num = num&(num - 1);
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
//	//printf("%d\n", sizeof int);
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 0 };
//	printf("%d\n", sizeof(arr));
//	printf("%d\n", sizeof(int[10]));
//	printf("%d\n", sizeof(int[5]));
//	return 0;
//
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
//	int a = 0;
//	printf("%d\n", ~a);
//	//a  00000000000000000000000000000000
//	//~a 11111111111111111111111111111111---补码
//	//   11111111111111111111111111111110---反码
//	//   10000000000000000000000000000001---原码
//	return 0;
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