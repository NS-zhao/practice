#include<stdio.h>

//int main()
//{
//	char arr1[20] = { 0 };
//	char arr2[] = "girl";
//	strcpy(arr1, arr2);
//	printf("%s\n", arr1);
//	return 0;
//}


//int main()
//{
//	char arr[] = "hello girls";=
//	memset(arr, '*', 5);
//	printf("%s\n", arr);
//	return 0;
//
//}




//void Swap(int x, int y)
//{
//	int z = x;
//	x = y;
//	y = z;
//}
//
//int main()
//{
//	int a = 10;
//	int b = 20;
//	printf("a = %d b = %d\n", a, b);
//	Swap(a, b);
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}



//void Swap(int *pa, int *pb)
//{
//	int z = 0;
//	z = *pa;
//	*pa = *pb;
//	*pb = z;
//}
//
//int main()
//{
//	int a = 10;
//	int b = 20;
//	printf("a = %d b = %d\n", a, b);
//	Swap(&a, &b);
//	printf("a = %d b = %d\n", a, b);
//	return 0;
//}




//int is_prime(int n)
//{
//	int j = 0;
//	for (j = 2; j < n; j++)
//	{
//		if (n%j == 0)
//			return 0;
//	}
//	return 1;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	if ((is_prime(n) == 1)&&n>1)
//	{
//		printf("是素数\n", n);
//	}
//	else{
//		printf("不是素数\n", n);
//	}
//	
//	return 0;
//}



//int is_prime(int n)
//{
//	int j = 0;
//	for (j = 2; j < n; j++)
//	{
//		if (n%j == 0)
//			return 0;
//	}
//	return 1;
//}
//int main()
//{
//	int n = 0;
//	int count = 0;
//	for (n = 100; n < 200; n++)
//	{
//		if (is_prime(n) == 1)
//		{
//			printf("%d ", n);
//			count++;
//		}
//	}
//	printf("\ncount = %d\n", count);
//
//	return 0;
//}




//void Add(int *p)
//{
//	(*p)++;
//}
//
//int main()
//{
//	int num = 0;
//	Add(&num);
//	printf("%d\n", num);
//	Add(&num);
//	printf("%d\n", num);
//	return 0;
//}





//int binary_search(int arr[], int k, int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	
//	while (left <= right)
//	{
//		int mid = (left + right) / 2;
//		if (arr[mid] > k)
//		{
//			right = mid - 1;
//		}
//		else if (arr[mid] < k)
//		{
//			left = mid + 1;
//		}
//		else
//		{
//			return mid;
//		}
//	}
//	if (left > right)
//		return -1;
//}
//
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int k = 7;
//	int ret = binary_search(arr, k, sz);
//	if (ret == -1)
//	{
//		printf("没有\n");
//	}
//	else
//	{
//		printf("找到了，下标是：%d\n", ret);
//	}
//	return 0;
//}




//int is_leap_year(int n)
//{
//	return(((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0));
//}
//
//
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	if (is_leap_year(n) == 1)
//	{
//		printf("是闰年\n");
//
//	}
//	else
//	{
//		printf("不是闰年\n");
//	}
//	return 0;
//}
//


//int is_leap_year(int n)
//{
//	return(((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0));
//}
//
//
//int main()
//{
//	int n = 0;
//	for (n = 1000; n <= 2000; n++)
//	{
//		if (is_leap_year(n) == 1)
//		{
//			printf("%d ",n);
//
//		}
//	}
//	
//	return 0;
//}