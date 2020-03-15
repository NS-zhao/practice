
#include<stdio.h>
//void my_strcpy(char *dest, char *src)

//{
//	while (*src != '\0')
//	{
//		*dest++ = *src++;
//	}
//	*dest = *src;
//}
//
//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}


//void my_strcpy(char *dest, char *src)
//{
//	while (*dest++ = *src++)
//	{
//		;
//	}
//	*dest = *src;
//}
//
//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}
//


//int main()
//{
//	int *p;
//	*p = 10;
//	return 0;
//}


//int main()
//{
//	int a = 10;
//	int *pa = &a;
//	*pa = 20;
//	return 0;
//}


//#include<assert.h>
//void my_strcpy(char *dest, char *src)
//{
//	assert(dest != NULL);
//	assert(*src != NULL);
//	while (*dest++ = *src++)
//	{
//		;
//	}
//	*dest = *src;
//}
//
//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}


//#include<assert.h>
//void my_strcpy(char *dest, char *src)
//{
//	assert(dest != NULL);
//	assert(*src != NULL);
//	while (*src++ = *dest++)
//	{
//		;
//	}
//	*dest = *src;
//}
//
//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}
//



//#include<assert.h>
//char my_strcpy(char *dest, char *src)
//{
//	char *ret = dest;
//	assert(dest != NULL);
//	assert(*src != NULL);
//	while (*dest++ = *src++)
//	{
//		;
//	}
//	return ret;
//}
//
//int main()
//{
//	char arr[] = "bit";
//	char buf[10] = { 0 };
//	my_strcpy(buf, arr);
//	printf("%s\n", buf);
//	return 0;
//}
//
//



//#include<string.h>
//int main()
//{
//	if (strlen("abc") - strlen("abcdef") > 0)
//	{
//		printf("hehe\n");
//
//	}
//	else
//	{
//		printf("haha\n");
//	}
//	return 0;
//}



//int main()
//{
//	int *p = NULL;
//	*p = 10;
//	return 0;
//}


//int main()
//{
//	int *p = NULL;
//	if (p!=NULL)
//	   *p = 10;
//	return 0;
//}


//int main()
//{
//	const int num = 10;
//	num = 20;
//	printf("num = %d\n", num);
//	return 0;
//}


//int main()
//{
//	const int num = 10;
//	int *p = &num;
//	*p = 20;
//	printf("num = %d\n", num);
//	return 0;
//}


//int main()
//{
//	const int num = 10;
//	const int *p = &num;
//	*p = 20;
//	printf("num = %d\n", num);
//	return 0;
//}


int main()
{
	const int num = 10;
	int *const p = &num;
	*p = 20;
	printf("num = %d\n", num);
	return 0;
}