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
//		printf("������µ�����\n");
//		scanf("%d", &guess);
//		if (guess > ret)
//		{
//			printf("�´���\n");
//		}
//		else if (guess < ret)
//		{
//			printf("��С��\n");
//		}
//		else
//		{
//			printf(",��ϲ�㣬�¶���\n");
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
//		printf("��ѡ��");
//		scanf("%d", &input);
//		switch (input)
//		{
//		case 1:
//			game();
//			break;
//		case 0:
//			break;
//		default:
//			printf("����������������룺");
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
//	printf("���Խ���һ�����ڹػ���������룺��������ȡ���ػ���\n�����룺");
//	scanf("%s", &input);
//
//	if (0 == strcmp(input, "������"))
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
		printf("���Խ���һ�����ڹػ���������룺��������ȡ���ػ���\n�����룺");
		scanf("%s", &input);

		if (0 == strcmp(input, "������"))
		{
			system("shutdown -a");
			break;
		}
		
	}
	return 0;
}