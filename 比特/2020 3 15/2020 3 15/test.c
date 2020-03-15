#include<stdio.h>

//struct A
//{
//	int num;
//	char ch;
//};
//
//typedef struct Stu
//{
//	char name[20];
//	short age;
//	char id[20];
//	struct A sa;
//};
//
//void print1(struct Stu tmp)
//{
//	printf("%s %d %s-%d %c\n", tmp.name, tmp.age, tmp.id, tmp.sa.num, tmp.sa.ch);
//}
//
//void print2(struct Stu *ps)
//{
//	printf("%s %d %s-%d %c\n", ps->name,ps->age,ps->id,ps->sa.num,ps->sa.ch);
//}
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101", { 100, 'w' } };
//	print1(s);
//	print2(&s);
//	return 0;
//}



//struct A
//{
//	int num;
//	char ch;
//};
//
//typedef struct Stu
//{
//	char name[20];
//	short age;
//	char id[20];
//	struct A sa;
//};
//
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101", { 100, 'w' } };
//	printf("%s %d %s-%d %c\n", s.name, s.age, s.id, s.sa.num, s.sa.ch);
//	return 0;
//}


//struct A
//{
//	int num;
//	char ch;
//};
//
//typedef struct Stu
//{
//	char name[20];
//	short age;
//	char id[20];
//	struct A sa;
//};
//
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101", { 100, 'w' } };
//	struct Stu *ps = &s;
//	printf("%s %d %s-%d %c\n", ps->name, ps->age, ps->id, ps->sa.num, ps->sa.ch);
//	return 0;
//}



//int main()
//{
//	int i = 0; 
//	int sum = 0;
//	int n = 0;
//	int ret = 1;
//	scanf("%d", &n);
//	for (i = 1; i <= n; i++)
//	{
//		int j = 0;
//		ret = 1;
//		for (j = 1; j <= i; j++)
//		{
//			ret *= j;
//		}
//		sum += ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//
//}



//int main()
//{
//	int i = 0;
//	int arr[10] = { 0 };
//	for (i = 0; i <= 12; i++)
//	{
//		arr[i] = 0;
//		printf("hehe\n");
//
//	}
//	return 0;
//}



//void my_strcpy(char *dest, char *src)
//{
//	while (*src != '\0')
//	{
//		*dest = *src;
//		*dest++;
//		*src++;
//	}
//	*dest = '\0';
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




