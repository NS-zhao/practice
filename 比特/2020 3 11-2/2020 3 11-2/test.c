#include<stdio.h>

//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5 };
//	printf("%p\n", arr);
//	printf("%p\n", &arr[0]);
//	printf("%d\n", *arr);
//	return 0;
//}




//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5 };
//	printf("%d\n", sizeof(arr));
//	return;
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
//
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
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	return 0;
//}




//int main()
//{
//	int a = -1;
//	int b = a >> 1;
//	//  00000000000000000000000000000000
//	//a 10000000000000000000000000000001---Ô­Âë
//	//  11111111111111111111111111111110---·´Âë
//	//  11111111111111111111111111111111---²¹Âë
//
//	printf("%d\n", b);
//	return 0;
//}


//int main()
//{
//	int a = 10;
//	int b = 5;
//	int c = a&b;
//	int d = a | b;
//	int e = a^b;
//	printf("%d %d %d\n", c, d, e);
//	return 0;
//}



//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = a&b;
//	int d = a | b;
//	int e = a^b;
//	printf("%d %d %d\n", c, d, e);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int b = 5;
//	printf("a = %d b = %d\n", a, b);
//	a = a^b;
//	b = a^b;
//	a = a^b;
//	printf("a = %d b = %d\n", a,b);
//	return 0;
//}