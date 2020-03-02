#include<stdio.h>

//int main()
//{
//	int a = 0;
//	int n = 0;
//	int sum = 0;
//	int i = 0;
//	int k = 0;
//	scanf("%d%d", &a, &n);
//	for (i = 0; i < n; i++)
//	{
//		k = k * 10 + a;
//		sum += k;
//	}
//	printf("%d\n", sum);
//	return 0;
//}



//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (ch >= 'a' && ch <= 'z')
//		{
//			putchar(ch - 32);
//		}
//		else if (ch >= 'A' && ch <= 'Z')
//		{
//			putchar(ch + 32);
//		}
//		else if (ch >= '0' && ch <= '9')
//		{
//			continue;
//		}
//		else
//		{
//			putchar(ch);
//		}
//	}
//	return 0;
//}




//#include<ctype.h>

//int main()
//{
//	char c = 'W';
//	if (islower(c))
//	{
//		printf("小写\n");
//	}
//	else
//	{
//		printf("大写\n");
//	}
//	return 0;
//}



//int main()
//{
//	char c = 'W';
//	if (isupper(c))//判断大小写
//	{
//		printf("大写\n");
//	}
//	else
//	{
//		printf("小写\n");
//	}
//	return 0;
//}


//int main()
//{
//	if (isdigit('w'))//判断是否为数字
//	{
//		printf("ok\n");
//	}
//	else
//	{
//		printf("no\n");
//	}
//	return 0;
//}




//#include<ctype.h>
//
//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (islower(ch))
//		{
//			putchar(toupper(ch));
//		}
//		else if (isupper(ch))
//		{
//			putchar(tolower(ch));
//		}
//		else if (isdigit(ch))
//		{
//			continue;
//		}
//		else
//		{
//			putchar(ch);
//		}
//	}
//	return 0;
//}



//int main()
//{
//	int ch = 0;
//	char password[20] = { 0 };
//	printf("请输入密码：>");
//	scanf("%s", password);
//	printf("请确认密码(Y/N):>");
//	getchar();
//	ch = getchar();
//	if (ch == 'Y')
//	{
//		printf("确认成功\n");
//	}
//	else
//	{
//		printf("确认失败\n");
//	}
//	return 0;
//}