#include<stdio.h>
//
//#include<stdlib.h>
//#include<time.h>
//
//void menu()
//{
//	printf("***********************************\n");
//	printf("**********    1.play    ***********\n");
//	printf("**********    0.exit    ***********\n");
//	printf("***********************************\n");
//	
//}
//
//void game()
//{
//	int ret = rand() % 100 + 1;
//	int guess = 0;
//	while (1)
//	{
//		printf("请输入猜的数字\n");
//		scanf("%d", &guess);
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
//			printf(",恭喜你，猜对了\n");
//			break;
//		}
//	}
//}
//
//int main()
//{
//	int input = 0;
//	srand((unsigned int)time(NULL));
//	do
//	{
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
//			printf("输入错误，请重新输入：");
//			break;
//		}
//	} while (input);
//	return 0;
//
//}




//int main()
//{
//
//	char input[10] = { 0 };
//	system("shutdown -s -t 60");
//again:
//	printf("电脑将在一分钟内关机，如果输入：我是猪，就取消关机！\n请输入：");
//	scanf("%s", &input);
//
//	if (0 == strcmp(input, "我是猪"))
//	{
//		system("shutdown -a");
//	}
//	else
//	{
//		goto again;
//	}
//	return 0;
//}



int main()
{

	char input[10] = { 0 };
	system("shutdown -s -t 60");

	while (1)
	{
		printf("电脑将在一分钟内关机，如果输入：我是猪，就取消关机！\n请输入：");
		scanf("%s", &input);

		if (0 == strcmp(input, "我是猪"))
		{
			system("shutdown -a");
			break;
		}
		
	}
	return 0;
}