#include<stdio.h>

//�����������α�����ֵ��������ֵ�����ݽ��н�����

//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 0;
//	printf("a = %d b = %d\n", a, b);
//	c = a;
//	a = b;
//	b = c;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}




//����������ʱ���������������������ݣ������⣩ 
//int main()
//{
//	int a = 10;
//	int b = 20;
//	
//	printf("a = %d b = %d\n", a, b);
//	a = a^b;
//	b = a^b;
//	a = a^b;
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}



//��10 �����������ֵ��

//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int max = arr[0];
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	for (i = 1; i < sz; i++)
//	{
//		if (arr[i]>max)
//		{
//			max = arr[i];
//		}
//	}
//	printf("max = %d\n", max);
//	return 0;
//}


//�����������Ӵ�С����� 

//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = 3;
//	if (a < b)
//	{
//		int tmp = a;
//		a = b;
//		b = tmp;
//	}
//
//	if (a < c)
//	{
//		int tmp = a;
//		a = c;
//		c = tmp;
//	}
//
//	if (b < c)
//	{
//		int tmp = b;
//		b = c;
//		c = tmp;
//	}
//
//	printf("%d %d %d\n", a, b, c);
//	return 0;
//}



//void Swap(int *px, int *py)
//{
//	int tmp = 0;
//	tmp = *px;
//	*px = *py;
//	*py = tmp;
//}
//
//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = 3;
//	if (a < b)
//	{
//		Swap(&a, &b);
//	}
//
//	if (a < c)
//	{
//		Swap(&a, &c);
//	}
//
//	if (b < c)
//	{
//		Swap(&b, &c);
//	}
//
//	printf("%d %d %d\n", a, b, c);
//	return 0;
//}




//�������������Լ����

//int main()
//{
//	int a = 50;
//	int b = 70;
//	int c = 0;
//	while (c = a%b)
//	{
//		a = b;
//		b = c;
//
//	}
//	printf("%d\n", b);
//	return 0;
//}