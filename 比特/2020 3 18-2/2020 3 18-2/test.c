//#include<stdio.h>
//#include<ctype.h>
//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (islower(ch))
//		{
//			putchar(toupper(ch));
//		}
//		else if (isupper(ch))
//		{
//			putchar(tolower(ch));
//		}
//		else if (isdigit(ch))
//		{
//			continue;
//		}
//		else
//		{
//			putchar(ch);
//		}
//	}
//	return 0;
//}



//ʵ��һ����������ӡ�˷��ھ����ھ���������������Լ�ָ����
//����9�����99�ھ�������12�����1212�ĳ˷��ھ���

//int main()
//{
//	int i = 0;
//	int n = 0;
//	scanf("%d", &n);
//	for (i = 1; i <= n; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d = %-4d", j, i, i*j);
//		}
//		printf("\n");
//	}
//	
//	return 0;
//}




//void PrintTable(int n)
//{
//	int i = 0;
//	for (i = 1; i <= n; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d = %-4d", j, i, i*j);
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	
//	int n = 0;
//	scanf("%d", &n);
//	
//	PrintTable(n);
//	return 0;
//}



//����һ�����飬 
//ʵ�ֺ���init������ʼ�����顢
//ʵ��empty����������顢
//ʵ��reverse���������������Ԫ�ص����á�
//Ҫ���Լ���ƺ����Ĳ���������ֵ��

//void Init(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = 0;
//	}
//}
//
//void print(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//
//void reverse(int arr[], int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	while (left < right)
//	{
//		int tmp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = tmp;
//		left++;
//		right--;
//
//	}
//}
//
//
//int main()
//{
//
//	int arr[5] = { 1, 2, 3, 4, 5 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	print(arr,sz);
//	//Init(arr, sz);
//	//print(arr, sz);
//	
//	reverse(arr, sz);
//	print(arr, sz);
//	return 0;
//}


