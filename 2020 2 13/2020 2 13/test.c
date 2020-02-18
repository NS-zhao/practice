#include<stdio.h>
//int main()
//{
//	char arr1[] = "bit";
//	char arr2[] = { 'b', 'i', 't' };
//	char arr3[] = {'b','i','t','\0'};
//	printf("%s\n", arr1);
//	printf("%s\n", arr2);
//	printf("%s\n", arr3);
//	return 0;
//}


//#include<string.h>
//int main()
//{
//	int len = strlen("bit");
//	printf("%d\n", len);
//	return 0;
//}


//#include<string.h>
//int main()
//{
//	char arr[] = { 'b', 'i', 't' };
//	printf("%d\n", strlen(arr));
//	return 0;
//}


//int main()
//{
//	printf("%d\n", strlen("c:\test\code"));
//	printf("%s\n","c:\test\code");
//	printf("\a\a\a\a\a\a\a");
//	printf("%c\n",'\'');
//	printf("%s\n", "\"");
//	printf("%d\n", strlen("c:\test\0\test.c"));
//	printf("%d\n", strlen("c:\test\057\test.c"));
//	printf("%c\n", '\057');
//	printf("%c\n", '\x40');
//	printf("%d\n", strlen("c:\test\328\test.c"));
//	printf("%s\n", "c:\test\328\test.c");
//	return 0;
//}



//int main()
//{
//	int input = 0;
//	printf("你要学习吗？(1/0)");
//	scanf("%d", &input);
//	if (input == 1)
//	{
//		printf("好offer\n");
//	}
//	else if (input == 0)
//	{
//		printf("卖红薯\n");
//	}
//	else{
//		printf("hehe\n");
//	}
//	return 0;
//}


//int main()
//{
//	int line = 0;
//	while (line < 20000)
//	{
//		line++;
//		printf("敲代码\n");
//	}
//	if (line == 20000)
//	{
//		printf("好offer\n");
//	}
//	return 0;
//}


//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	int sum = 0;
//	scanf("%d%d", &num1, &num2);
//	sum = num1 + num2;
//	printf("%d\n", sum);
//	return 0;
//}


//int Add(int x, int y)
//{
//	int z = x + y;
//	return z;
//}
//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	int sum = 0;
//	scanf("%d%d", &num1, &num2);
//	sum = Add(num1, num2);
//	printf("%d\n", sum);
//	return 0;
//}

//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,0};
//	int i = 0;
//	while (i < 10)
//	{
//		arr[i] = 0;
//		i++;
//	}
//	i = 0;
//	while (i < 10)
//	{
//		printf("%d ", arr[i]);
//		i++;
//	}
//	return 0;
//}


//int main()
//{
//	int a = 12;
//	int b = a >> 1;
//	//12--00000000000000000000000000001100(a有四个字节，32个比特位）
//	//右移一个单位   00000000000000000000000000000110（正数补0，负数补1）  110--6
//	int c = a << 1;
//	//12--00000000000000000000000000001100(a有四个字节，32个比特位）
//	//右移一个单位   00000000000000000000000000011000  11000--24
//	printf("%d\n", b);
//	printf("%d\n", c);
//	return 0;
//}



//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = a&b;//按(二进制）位与:相同为1，相异为0
//	//a:00000000000000000000000000000001
//	//b:00000000000000000000000000000010
//	//c:00000000000000000000000000000000
//	int d = a|b;//按位或：有1则1
//	//a:00000000000000000000000000000001
//	//b:00000000000000000000000000000010
//	//c:00000000000000000000000000000011
//	int e = a^b;//异或：相同为0，相异为1
//	//a:00000000000000000000000000000001
//	//b:00000000000000000000000000000010
//	//c:00000000000000000000000000000011
//	printf("%d\n", c);
//	printf("%d\n", d);
//	printf("%d\n", e);
//	return 0;
//}


//int main()
//{
//	int a = 5;
//	printf("%d\n", !a);
//	int flag = 0;
//	if (!flag)
//	{
//		printf("hehe\n");
//	}
//	return 0;
//}


//int main()
//{
//	int a = 10;
//	int arr[10] = { 0 };
//	printf("%d\n", sizeof(arr));
//	printf("%d\n", sizeof(int));
//	printf("%d\n", sizeof(a));
//	printf("%d\n", sizeof a);
//}

//int main()
//{
//	int a = 0;
//	//0:00000000000000000000000000000000
//	//  11111111111111111111111111111111
//	//-1:10000000000000000000000000000001---原码
//	//   11111111111111111111111111111110---反码（原码的符号位不变，其他位按位取反）
//	//   11111111111111111111111111111111---补码（反码的二进制位+1）
//	//一个数在内存中储存的是补码
//	printf("%d\n", ~a);//~:对一个数的二进制位取反
//	return 0;
//}


//int main()
//{
//	int a = 10;
//	//int b = a++;
//	//int b = a--;
//	//int b = ++a;
//	int b = --a;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}


//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//	if (a > b)
//		max = a;
//	else
//		max = b;
//	printf("%d\n", max);
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//	max = a > b ? a : b;
//	printf("%d\n", max);
//	return 0;
//}


//typedef unsigned int uint;
//int main()
//{
//	unsigned int num1 = 0;
//	uint num2 = 0;
//	return 0;
//}


