#include<stdio.h>

//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		putchar(ch);
//
//	}
//	return 0;
//}




//int main()
//{
//	int ch = 0;
//	char password[20] = { 0 };
//	printf("请输入密码：");
//	scanf("%s", password);
//	printf("请确认密码(Y/N)：");
//	while ((ch = getchar()) != '\n')
//	{
//		;
//	}
//	//getchar();
//	ch = getchar();
//	if (ch == 'Y')
//	{
//		printf("确认成功\n");
//	}
//	else
//	{
//		printf("确认失败\n");
//	}
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
//			printf("%d*%d = %-3d ", i, j, i*j);
//		}
//		printf("\n");
//	}
//}
//
//int main()
//{
//	int line = 0;
//	scanf("%d", &line);//9
//	PrintTable(line);
//	return 0;
//}




//void Init(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = 0;
//	}
//}
//
//void Print(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//
//
//void Reverse(int arr[], int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//
//	while (left < right)
//	{
//		int tmp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = tmp;
//		left++;
//		right--;
//	
//	}
//		
//}
//
//int main()
//{
//	int arr[5] = { 1,2,3,4,5 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	//Print(arr, sz);
//	//Init(arr, sz);
//	Print(arr, sz);
//	Reverse(arr, sz);
//	Print(arr, sz);
//	return 0;
//
//}




//double Pow(int n, int k)
//{
//	if (k > 0)
//		return n*Pow(n, k - 1);
//	else if (k == 0)
//		return 1;
//	else
//		return 1.0/Pow(n, -k);
//}
//
//int main()
//{
//	int n = 0;
//	int k = 0;
//	double ret = 0.0;
//	scanf("%d%d", &n, &k);
//	ret = Pow(n,k);
//	printf("ret = %lf\n", ret);
//	return 0;
//}



//#include<assert.h>
//int my_strlen(const char *str)
//{
//	int count = 0;
//	assert(str != NULL);
//	while (*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//
//int main()
//{
//	char arr[] = "girl";
//	int len = my_strlen(arr);
//	printf("len = %d\n", len);
//	return 0;
//}



//#include<assert.h>
//int my_strlen(const char *str)
//{
//	
//	assert(str != NULL);
//	if (*str != '\0')
//		return 1 + my_strlen(str + 1);
//	else
//		return 0;
//	
//}
//
//int main()
//{
//	char arr[] = "girl";
//	int len = my_strlen(arr);
//	printf("len = %d\n", len);
//	return 0;
//}
