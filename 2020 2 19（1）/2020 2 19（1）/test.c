
#include<stdio.h>
//int main()
//{
//	int n = 0;
//	int i = 0;
//	int ret = 0;
//	scanf("%d", &n);
//	for (i = 1; i <= n; i++)
//	{
//		ret = ret*i;
//	}
//	printf("%d\n", ret);
//	return 0;
//}


//int main()
//{
//	int n = 0;
//	int i = 0;
//	int ret = 1;
//	int sum = 0;
//	for (n = 1; n <= 3; n++)
//	{
//		ret = 1;
//		for (i = 1; i <= n; i++)
//		{
//			ret = ret*i;
//		}
//		sum = sum + ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//}



//int main()
//{
//	int n = 0;
//	int i = 0;
//	int ret = 1;
//	int sum = 0;
//	for (n = 1; n <= 10; n++)
//	{
//		
//			ret = ret*n;
//		sum = sum + ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//}


//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 7;
//	int left = 0;
//	int right = 9;
//	while (left <= right)
//	{
//		int mid = (left + right) / 2;
//		if (arr[mid] > k)
//		{
//			right = mid - 1;
//		}
//		else if (arr[mid] < k)
//		{
//			left = mid - 1;
//		}
//		else
//		{
//			printf("找到了，下标是：%d\n", mid);
//			break;
//		}
//		if (left>right)
//		{
//			printf("找不到\n");
//		}
//	}
//	return 0;
//}






//#include<string.h>
//#include<windows.h>
//int main()
//{
//	char arr1[] = "welcome to school!!!";
//	char arr2[] = "####################";
//	int left = 0;
//	int right = strlen(arr1) - 1;
//	while (left <= right)
//	{
//		arr2[left] = arr1[left];
//		arr2[right] = arr1[right];
//		printf("%s\n", arr2);
//		Sleep(1000);
//		system("cls");
//		left++;
//		right--;
//	}
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	char password[20] = { 0 };
//	for (i = 0; i < 3; i++)
//	{
//		printf("请输入密码：");
//			scanf("%s", password);
//			if (strcmp(password, "123456") == 0)
//			{
//				printf("登陆成功\n");
//				break;
//			}
//			else
//			{
//				printf("密码错误，请重新输入！\n");
//			}
//			if (i == 3)
//			{
//				printf("三次密码错误，退出程序\n");
//			}
//	}
//	return 0;
//}





//#include<stdlib.h>
//#include<time.h>
//
//void menu()
//{
//	printf("*********************************\n");
//	printf("**********    1.play   **********\n");
//	printf("**********    0.exit   **********\n");
//	printf("*********************************\n");
//}
//void game()
//{
//	int ret = rand()%100 + 1;
//	int guess = 0;
//	while (1)
//	{
//		printf("请输入猜的数字：");
//			scanf("%d", &guess);
//		if (ret < guess)
//		{
//			printf("猜大了\n");
//		}
//		else if (ret>guess)
//		{
//			printf("猜小了\n");
//		}
//		else
//		{
//			printf("恭喜您，猜对了\n");
//			break;
//		}
//	}
//}
//int main()
//{
//	int input = 0;
//	srand((unsigned int)time(NULL));
//		do
//		{
//		menu();
//		printf("请选择\n");
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
//		}
//	}while (input);
//	return 0;
//}

//int main()
//{
//	char input[20] = { 0 };
//	system("shutdow -s -t 60");
//	again:
//	printf("请注意，您的电脑将在一分钟内关机，如果输入：我是猪，就取消关机\n");
//	scanf("%s", input);
//	if (strcmp(input, "我是猪") == 0)
//	{system("shutdown -a");
//	}
//	else
//	{
//		goto again;
//	}
//	return 0;
//}



//int main()
//{
//	char input[20] = { 0 };
//	system("shutdow -s -t 60");
//	while (1)
//	{
//
//		printf("请注意，您的电脑将在一分钟内关机，如果输入：我是猪，就取消关机\n");
//		scanf("%s", input);
//		if (strcmp(input, "我是猪") == 0)
//		{
//			system("shutdown -a");
//			break;
//		}
//	}
//	return 0;
//}