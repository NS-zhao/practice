#include<stdio.h>
//int main()
//{
//	int ch = getchar();
//		//printf("%c\n", ch);
//	putchar(ch);
//
//	return 0;
//}


//int main()
//{
//	int ch = getchar();
//	printf("%c\n", ch);
//	ch = getchar();
//	printf("%c\n", ch);
//	return 0;
//}


//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//		putchar(ch);
//	return 0;
//}



//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) !=EOF)
//	{
//		if (ch < '0' || ch > '9')
//			continue;
//		putchar(ch);//只打印数字字符
//	}
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	for (i = 1; i <= 10; i++)
//	{
//		printf("%d ", i);
//	}
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	for (i = 1; i <= 10; i++)
//	{
//		if (i == 5)
//			break;
//		printf("%d ", i);
//	}
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	for (i = 1; i <= 10; i++)
//	{
//		if (i == 5)
//			continue;
//		printf("%d ", i);//1 2 3 4 6 7 8 9 10
//	}
//	return 0;
//}




//一些for循环的变种
//int main()
//{
//	int i = 0;
//	for (;;)
//	{
//		printf("%d\n", i);
//	}
//	return 0;
//}


//int main()
//{
//	int i = 0;
//	int j = 0;
//	for (; i < 10; i++)
//	{
//		for (; j < 10; j++)
//		{
//			printf("hehe\n");
//		}
//	}
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < 10; i++)
//	{
//		for (j = 0; j < 10; j++)
//		{
//			printf("hehe\n");
//		}
//	}
//	return 0;
//}



//int main()
//{
//	int x = 0;
//	int y = 0;
//	for (x = 0, y = 0; x < 2 && y < 5; ++x, y++)
//	{
//		printf("hehe\n");
//	}
//	return 0;
//}



//int main()
//{
//	int i = 1;
//	do
//	{
//		printf("%d ", i);
//		i++;
//	} while (i <= 10);
//		return 0;
//}


//int main()
//{
//	int i = 1;
//	do
//	{
//		if (i == 5)
//			break;
//		printf("%d ", i);
//		i++;
//	} while (i <= 10);
//	return 0;
//}



//int main()
//{
//	int i = 1;
//	do
//	{
//		if (i == 5)
//			continue;
//		printf("%d ", i);
//		i++;
//	} while (i <= 10);
//	return 0;
//}



//int main()
//{
//	int i = 10;
//	do
//	{
//		printf("%d ", i);
//		i++;
//	} while (i < 10);
//	return 0;
//}



//int main()
//{
//	int i = 10;
//	do
//	{
//		if (5 == i)
//			break;
//		printf("%d ", i);
//		i++;
//	} while (i < 10);
//	return 0;
//}


//int main()
//{
//	int i = 10;
//	do
//	{
//		if (5 == i)
//			continue;
//		printf("%d ", i);
//		i++;
//	} while (i < 10);
//	return 0;
//}



//int main()
//{
// flag:
//	printf("hehe\n");
//	goto flag;
//	return 0;
//}