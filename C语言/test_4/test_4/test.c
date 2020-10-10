#include<stdio.h>
//#include<stdlib.h>
//#include<time.h>
//
//void menu()
//{
//	printf("********************************\n");
//	printf("***********  1.play  ***********\n");
//	printf("***********  0.exit  ***********\n");
//	printf("********************************\n");
//}
//
//void game()
//{
//	int ret = rand() % 100 + 1;
//	int guess = 0;
//	while (1)
//	{
//		printf("请输入猜的数字>:");
//		scanf("%d", &guess);
//		if (guess > ret)
//		{
//			printf("猜大了\n");
//		}
//		else if (guess<ret)
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
//int main()
//{
//	int input = 0;
//	srand((unsigned int)time(NULL));
//	do
//	{
//		menu();
//		printf("请选择>:");
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
//	} while (input);
//	return 0;
//}



//int main()
//{
//	char input[10] = { 0 };
//	system("shutdown -s -t 60");
//again:
//	printf("电脑将在1分钟内关机，如果输入：我是猪，就取消关机！\n请输入：>");
//	scanf("%s", input);
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




#include<stdlib.h>

//int main()
//{
//	char input[10] = { 0 };
//	system("shutdown -s -t 60");
//	while (1)
//	{
//		printf("电脑将在1分钟内关机，如果输入：我是猪，就取消关机！\n请输入：>");
//		scanf("%s", input);
//		if (0 == strcmp(input, "我是猪"))
//		{
//			system("shutdown -a");
//			break;
//		}
//	}
//	return 0;
//}




//int main()
//{
//flag:
//	printf("hehe\n");
//	goto flag;
//	return 0;
//}




//int main()
//{
//	char arr1[20] = { 0 };
//	char arr2[] = "girl";
//	strcpy(arr1, arr2);
//	printf("%s\n", arr1);
//	return 0;
//}




//int main()
//{
//	char arr[] = "hello girls";
//	memset(arr, '*', 5);
//	printf("%s\n", arr);
//	return 0;
//}




//int get_max(int x, int y)
//{
//	int max = 0;
//	if (x > y)
//		max = x;
//	else
//		max = y;
//	return max;
//}
//
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = get_max(a, b);
//	printf("max = %d\n", max);
//	max = get_max(3, 5);
//	printf("max = %d\n", max);
//	return 0;
//}



//void Swap1(int x, int y)
//{
//	int tmp = 0;
//	tmp = x;
//	x = y;
//	y = tmp;
//}
//
//void Swap2(int *px, int *py)
//{
//	int tmp = 0;
//	tmp = *px;
//	*px = *py;
//	*py = tmp;
//}
//
//int main()
//{
//	int num1 = 1;
//	int num2 = 2;
//	Swap1(num1, num2);
//	printf("Swap1::num1 = %d num2 = %d\n", num1, num2);
//	Swap2(&num1, &num2);
//	printf("Swap1::num1 = %d num2 = %d\n", num1, num2);
//	return 0;
//}




//int add(int num){
//	num++;
//	return num;
//}
//
//int main()
//{
//	int num = 0;
//	add(num);
//	return 0;
//}




//void new_line()
//{
//	printf("hehe\n");
//
//}
//
//void three_line()
//{
//	int i = 0;
//	for (i = 0; i < 3; i++);
//	{
//		new_line();
//	}
//}
//
//int main()
//{
//	three_line();
//	return 0;
//}




//#include<string.h>
//
//int main()
//{
//	char string[80];
//	strcpy(string, "Hello world from");
//	strcat(string, " strcpy");
//	strcat(string, " and");
//	strcat(string, " stract!");
//	printf("String = %s\n", string);
//	return 0;
//}



//#include<string.h>
//
//int main()
//{
//	printf("%d\n", strlen("girl"));
//	return 0;
//}



//#include<string.h>
//
//int main()
//{
//	int len = strlen("girl");
//	printf("%d\n", len);
//	return 0;
//}



//int main()
//{
//	printf("%d", printf("%d", printf("%d", 43)));
//	return 0;
//}


