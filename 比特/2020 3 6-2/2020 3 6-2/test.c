#include<stdio.h>

//int main()
//{
//
//	int i = 0;
//	char password[20] = { 0 };
//	for (i = 0; i < 3; i++)
//	{
//		printf("请输入密码：");
//			scanf("%ss", &password);
//			if (strcmp(password, "123456") == 0)
//			{
//				printf("登陆成功\n");
//			}
//			else
//			{
//				printf("密码错误，请重新输入\n");
//			}
//			if (i == 3)
//			{
//				printf("三次密码错误，退出程序\n");
//			}
//	}
//	
//	
//	return 0;
//}





//#include<stdlib.h>
//#include<time.h>
//void menu()
//{
//	printf("**********************************\n");
//	printf("***********  1.play  *************\n");
//	printf("***********  0.exit  *************\n");
//	printf("**********************************\n");
//}
//
//void game()
//{
//	int ret = rand() % 100 + 1;
//	int guess = 0;
//	while (1)
//	{
//		printf("请输入猜的数字：");
//			scanf("%d", &guess);
//		if (guess > ret)
//		{
//			printf("猜大了\n");
//		}
//		else if (guess < ret)
//		{
//			printf("猜小了\n");
//		}
//		else
//		{
//			printf("恭喜你，猜对了\n");
//			break;
//		}
//	}
//}
//
//
//int main()
//{
//	int input = 0;
//	srand((unsigned)time(NULL));
//
//		do
//		{
//		menu();
//		printf("请选择：");
//		scanf("%d", &input);
//		switch (input)
//		{
//		case 1:
//			game();
//			break;
//		case 0:
//			break;
//		default:
//			printf("选择错误，请重新输入！\n");
//			break;
//
//		}
//
//		} while (input);
//	return 0;
//}