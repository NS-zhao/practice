#include<stdio.h>

//int main()
//{
//	int i = 0;
//	int n = 0;
//	int ret = 1;
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
//	int i = 0;
//	int n = 0;
//	int ret = 1;
//	int sum = 0;
//	for (n = 1; n <= 10; n++)
//	{
//		
//		for (i = 1; i <= n; i++)
//		{
//
//			ret = ret*i;
//			
//		}
//		sum = sum + ret;
//
//	}
//
//	
//	printf("%d\n", sum);
//	return 0;
//}




//int main()
//{
//	int i = 0;
//	int n = 0;
//	int ret = 1;
//	int sum = 0;
//	for (n = 1; n <= 3; n++)
//	{
//
//		for (i = 1; i <= n; i++)
//		{
//
//			ret = ret*i;
//
//		}
//		sum = sum + ret;
//
//	}
//
//
//	printf("%d\n", sum);
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	int n = 0;
//	int ret = 1;
//	int sum = 0;
//	for (n = 1; n <= 3; n++)
//	{
//		ret = 1;
//		for (i = 1; i <= n; i++)
//		{
//
//			ret = ret*i;
//
//		}
//		sum = sum + ret;
//
//	}
//
//
//	printf("%d\n", sum);
//	return 0;
//}
//



//int main()
//{
//	int i = 0;
//	int n = 0;
//	int ret = 1;
//	int sum = 0;
//	for (n = 1; n <= 10; n++)
//	{
//		ret = 1;
//		for (i = 1; i <= n; i++)
//		{
//
//			ret = ret*i;
//
//		}
//		sum = sum + ret;
//
//	}
//
//
//	printf("%d\n", sum);
//	return 0;
//}



//int main()
//{
//
//	
//	int n = 0;
//	int ret = 1;
//	int sum = 0;
//	for (n = 1; n <= 10; n++)
//	{
//		ret = ret*n;
//		sum = sum + ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//}



#include<string.h>
#include<Windows.h>

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
//		Sleep(100);
//		system("cls");
//		left++;
//		right--;
//	}
//	return 0;
//}



#include<stdio.h>
#include<string.h>
int main()
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int k = 7;
	int left = 0;
	int sz = sizeof(arr) / sizeof(arr[0]);
	int right = sz-1;
	while (left <= right)
	{
		int mid = (left + right) / 2;
		if (arr[mid] > k)
		{
			right = mid - 1;
		}
		else if (arr[mid] < k)
		{
			left = mid + 1;
		}
		else
		{
			printf("找到了，下标是：%d\n", mid);
			break;
		}
		

	}
	if (left > right)
	{
		printf("找不到\n");
	}
	return 0;
}