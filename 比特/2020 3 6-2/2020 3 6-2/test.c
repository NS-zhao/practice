#include<stdio.h>

//int main()
//{
//
//	int i = 0;
//	char password[20] = { 0 };
//	for (i = 0; i < 3; i++)
//	{
//		printf("���������룺");
//			scanf("%ss", &password);
//			if (strcmp(password, "123456") == 0)
//			{
//				printf("��½�ɹ�\n");
//			}
//			else
//			{
//				printf("�����������������\n");
//			}
//			if (i == 3)
//			{
//				printf("������������˳�����\n");
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
//		printf("������µ����֣�");
//			scanf("%d", &guess);
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
//			printf("��ϲ�㣬�¶���\n");
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
//			printf("ѡ��������������룡\n");
//			break;
//
//		}
//
//		} while (input);
//	return 0;
//}