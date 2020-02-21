#include<stdio.h>
//int main()
//{
//	char arr1[20] = { 0 };
//	char arr2[] = "bit";
//	strcpy(arr1, arr2);
//	printf("%s\n", arr1);
//	return 0;
//}


//int main()
//{
//	char arr[] = "hello girls";
//	memset(arr, '*', 5);
//	printf("%s\n", arr);
//	return 0;
//}



//int get_max(int x, int y)
//{
//	int max = 0;
//	if (x > y)
//		max = x;
//	else
//		max = y;
//	return max;
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = get_max(a, b);
//	printf("max = %d\n", max);
//	max = get_max(5, 6);
//	printf("max = %d\n", max);
//	return 0;
//}


//void Swap1(int x, int y)//形参
//{
//	int z = x;
//	x = y;
//	y = z;
//}
//
//
//void Swap2(int *pa, int *pb)
//{
//	int z = 0;
//	z = *pa;
//	*pa = *pb;
//	*pb = z;
//}
//
//
//int main()
//{
//	int a = 10;
//	int b = 20;
//	printf("a = %d b = %d\n", a, b);
//	Swap1(a, b);//实参
//	//当实参传给形参的时候，形参是实参的一份临时拷贝
//	//当形参的值修改的时候，不会影响实参
//	printf("a = %d b = %d\n", a, b);
//	Swap2(&a, &b);
//	printf("a = %d b = %d\n", a, b);
//}




//int is_prime(int i)
//{
//	int j = 0;
//	for (j = 2; j <i; j++)
//	{
//		if (i%j == 0)
//			return 0;
//	}
//	return 1;
//}
//
//int main()
//{
//	int i = 0;
//	//int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		if (is_prime(i) == 1)
//		{
//			//count++;
//			printf("%d ", i);
//		}
//	}
//	//printf("\ncount = %d\n", count);
//	return 0;
//}