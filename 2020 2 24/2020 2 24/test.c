#include<stdio.h>
//int main()
//{
//	char arr1[] = "abc";
//	char arr2[] = { 'a', 'b', 'c' };
//	printf("%s\n", arr1);
//	printf("%s\n", arr2);
//	return 0;
//}


//int main()
//{
//	int arr[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	return 0;
//}


//int main()
//{
//	int arr[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int *p = &arr[0];
//
//	for (i = 0; i < sz; i++)
//	{
//		printf("&arr[%d] = %p<=>%p\n", i, &arr[i], p + i);
//		printf("%d ", *(p+i));
//	}
//	return 0;
//}


//int main()
//{
//
//    int arr[3][4] = { { 1, 2 }, { 3, 4 } };
//	printf("%d ", arr[1][1]);
//	return 0;
//
//}


//int main()
//{
//	int arr[3][4] = { 1, 2, 3, 4, 5 };
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			printf("%d ", arr[i][j]);
//		}
//		printf("\n");
//
//	}
//	return 0;
//}


//int main()
//{
//	int arr[3][4] = { 1, 2, 3, 4, 5 };
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < 4; i++)
//	{
//		for (j = 0; j < 3; j++)
//		{
//			printf("%d ", arr[j][i]);
//		}
//		printf("\n");
//
//	}
//	return 0;
//}



//int main()
//{
//	int arr[3][4];
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			printf("&arr[%d][%d] = %p\n", i,j,&arr[i][j]);
//		}
//
//	}
//	return 0;
//}




//void bubble_sort(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz - 1; i++)
//	{
//		int j = 0;
//		for (j = 0; j < sz - 1 - i; j++)
//		{
//			if (arr[j]>arr[j + 1])
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//			}
//		}
//	}
//}
//
//int main()
//{
//	int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	bubble_sort(arr, sz);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//
//	}
//	return 0;
//}


//void bubble_sort(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz - 1; i++)
//	{
//		int j = 0;
//		int flag = 1;
//		for (j = 0; j < sz - 1 - i; j++)
//		{
//			if (arr[j]>arr[j + 1])
//			{
//				flag = 0;
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//			}
//		}
//		if (flag == 1)
//			break;
//	}
//}
//
//int main()
//{
//	int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	bubble_sort(arr, sz);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//
//	}
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5 };
//	printf("%p\n", arr);
//	printf("%p\n", &arr[0]);
//	printf("%d\n", *arr);
//	return 0;
//}