//�����������α�����ֵ��������ֵ�����ݽ��н�����
#include<stdio.h>
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 0;
//	c = a; a = b; b = c;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}


//����������ʱ���������������������ݣ������⣩
//һ������a�������һ������b�����Ժ����õ�ֵ��������a
//int main()
//{
//	int a = 10;
//	int b = 20;
//	a = a^b;
//	b = a^b;
//	a = a^b;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}



//��10 �����������ֵ�� 
//int main()
//{
//	char arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int max = 0;
//	max = arr[0];
//	int i = 0;
//	for (i = 0; i < 10; i++)
//		if (max < arr[i])
//			max = arr[i];
//	printf("max = %d\n", max);
//	return 0;
//}



//�����������Ӵ�С���
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int i = 0;
//	if (a < b)
//	{
//		i = a; a = b; b = i;
//	}
//	if (a < c)
//	{
//		i = a; a = c; c = i;
//	}
//	if (b < c)
//	{
//		i = c; c = b; b = i;
//	}
//	printf("%-8d%-8d%-8d\n", a,b,c);
//	return 0;
//}




//�������������Լ����
//int main()
//{
//	int a = 40;
//	int b = 60;
//	int i = 2;
//	int n = 0;
//	for (i = 2; i <= 40; i++)
//		if ((a % i == 0) && (b%i == 0))
//			if (n < i)
//				n = i;
//	printf("%d\n", n);
//	return 0;
//}