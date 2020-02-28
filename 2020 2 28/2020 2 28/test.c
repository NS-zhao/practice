#include<stdio.h>

//int main()
//{
//	int a = 0x11223344;
//	int *pa = &a;
//	char *pc = &a;
//	printf("%p\n", pa);
//	printf("%p\n", pa+1);
//
//	printf("%p\n", pc);
//	printf("%p\n", pc+1);
//
//	return 0;
//
//}



//int main()
//{
//
//	float value[N_VALUES];
//	float *vp;
//	for (vp = &values[0]; vp < &values[N_VALUES];)
//	{
//		*vp++;
//	}
//	printf("%p\n", vp);
//	return 0;
//}



//int main()
//{
//	int a = 0x11223344;
//	char *pc = (char*)&a;
//	
//	int i = 0;
//	for (i = 0; i < 4; i++)
//	{
//		*(pc + i) = 0;
//		//*pc++ = 0;
//	}
//	return 0;
//}




//int my_strlen(char *str)
//{
//	int count = 0;
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
//	printf("%d\n", len);
//
//	return 0;
//}





//int main()
//{
//	int arr[10] = { 0 };
//	printf("%d\n", &arr[9] - &arr[0]);
//	printf("%d\n", &arr[0] - &arr[9]);
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 0 };
//	char ch[10] = { 0 };
//	printf("%d\n", &arr[9] - &ch[0]);
//	
//	return 0;
//}





//int my_strlen(char *str)
//{
//	char *start = str;
//	while (*str != '\0')
//		str++;
//	return str - start;
//}
//
//int main()
//{
//	char arr[] = "girl";
//	int len = my_strlen(arr);
//	printf("%d\n", len);
//
//	return 0;
//}




//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	printf("%p\n", arr);
//	printf("%p\n", &arr[0]);
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int *p = arr;
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", *(p+i));
//		
//	}
//	return 0;
//}



//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int *p = arr;
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%p\n", arr);
//		printf("%p\n", &arr[0]);
//		printf("%p===%p\n", &arr[i], p + i);
//	}
//	return 0;
//}


//int main()
//{
//	int a = 10;
//	int *p = &a;
//	int **pp = &p;
//	**pp = 20;
//	printf("%d\n", a);
//	return 0;
//}

