#include<stdio.h>

//����Ļ���������

//int main()
//{
//
//	int i = 0;
//	int line = 0;
//	scanf("%d", &line);//13  7
//	for (i = 0; i < line; i++)
//	{
//		int j = 0;
//		for (j = 0; j < line -i- 1; j++)
//		{
//			printf(" ");
//		}
//		for (j = 0; j < 2 * i + 1;j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	for (i = 0; i < line - 1; i++)
//	{
//		int j = 0;
//		for (j = 0; j <= i; j++)
//		{
//			printf(" ");
//		}
//		for (j = 0; j < 2 * (line - 1 - i) - 1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	return 0;
//}





//���0��999֮������С�ˮ�ɻ������������ 
//��ˮ�ɻ�������ָһ����λ�������λ���ֵ�������ȷ�õ��ڸ��������磻153��1��5��3 ? ����153��һ����ˮ�ɻ�������

//#include<math.h>
//int main()
//{
//	int i = 0;
//	for (i = 1; i <10000; i++)
//	{
//		int count = 1;
//		double sum = 0;
//		int tmp = i;
//		while (tmp / 10)
//		{
//			count++;
//			tmp /= 10;
//		}
//		tmp = i;
//		while (tmp)
//		{
//			sum += pow(tmp % 10, count);
//			tmp /= 10;
//		}
//		if (sum == i)
//		{
//			printf("%d ", i);
//		}
//	}
//	return 0;
//}
//



//#include <math.h>
//#include <stdio.h>
//
//void main()
//{
//	int x = 2;
//	int y = 3;
//
//	int z = pow(x, y);
//	printf("%d\n", z);
//}
//



//��Sn=a+aa+aaa+aaaa+aaaaa��ǰ5��֮�ͣ�����a��һ�����֣� 
//���磺2 + 22 + 222 + 2222 + 22222

//int main()
//{
//	int a = 0;
//	int n = 0;
//	int sum = 0;
//	scanf("%d %d", &a, &n);
//	int i = 0;
//	int k = 0;
//	for (i = 0; i <= n; i++)
//	{
//		k= k * 10 + a;
//		sum += k;
//
//	}
//	printf("%d\n", sum);
//	return 0;
//}



//��дһ�����򣬿���һֱ���ռ����ַ��� 
//�����Сд�ַ��������Ӧ�Ĵ�д�ַ���
//������յ��Ǵ�д�ַ����������Ӧ��Сд�ַ���
//��������ֲ������

//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (ch >= 'a'&&ch <= 'z')
//		{
//			putchar(ch - 32);
//			
//		}
//		else if (ch >= 'A'&&ch <= 'Z')
//		{
//			putchar(ch + 32);
//			
//		}
//		else if (ch >= '0'&&ch <= '9')
//		{
//			continue;
//		}
//		else
//		{
//			putchar(ch);
//		}
//	}
//	return 0;
//
//}


