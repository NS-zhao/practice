////��ӡ100~200֮������� 

#include<stdio.h>
//��һ�ַ���
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		//printf("%d ", i);��ӡ100~200֮�����
//		//�ж�i�Ƿ�Ϊ����
//		int j = 0;
//		for (j = 2; j < i; j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//		//�������
//		//1.break����ѭ����i��������
//		//2.j>=i(i%j == 0�����������û�������
//		if (j >= i)
//		{
//			count++;
//			printf("%d ", i);
//		}
//		
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}


//�Ż�����1

//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		int j = 0;
//		for (j = 2; j <= i / 2; j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//		if (j > i / 2)
//		{
//			count++;
//			printf("%d ", i);
//		}
//
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}



//�Ż�����2��
//#include<math.h>
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		int j = 0;
//		for (j = 2; j <= sqrt(i); j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//
//		if (j > sqrt (i))
//		{
//			count++;
//			printf("%d ", i);
//		}
//
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}
//


//�Ż�����3��
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 101; i <= 200; i += 2)
//	{
//		int j = 0;
//		for (j = 2; j < i; j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//		if (j >= i)
//		{
//			count++;
//			printf("%d ", i);
//		}
//
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}
