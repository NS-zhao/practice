#include<stdio.h>

//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int *arr[4] = { &a, &b, &c };
//	printf("%d\n", *(arr[0]));
//	printf("%d\n", *(arr[1]));
//	printf("%d\n", *(arr[2]));
//	return 0;
//}





//typedef struct Stu
//{
//	char name[20];
//	short age;
//	char id[20];
//}Stu;
//
//int main()
//{
//	struct Stu s = { 0 };
//	Stu s2 = { 0 };
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
//}Stu;
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101", { 100, 'w' } };
//	printf("%s %d %s--%d %c\n", s.name, s.age, s.id, s.sa.num, s.sa.ch);
//
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
//}Stu;
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101", { 100, 'w' } };
//	
//	struct Stu *ps = &s;
//	printf("%s %d %s--%d %c\n", ps->name,ps->age,ps->id,ps->sa.num,ps->sa.ch);
//
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
//}Stu;
//
//
//void Print1(struct Stu tmp)
//{
//	printf("%s %d %s--%d %c\n",tmp.name, tmp.age, tmp.id, tmp.sa.num, tmp.sa.ch);
//
//}
//
//
//void Print2(struct Stu *ps)
//{
//	printf("%s %d %s--%d %c\n", ps->name, ps->age, ps->id, ps->sa.num, ps->sa.ch);
//
//}
//
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101", { 100, 'w' } };
//
//	Print1(s);
//	Print2(&s);
//
//	return 0;
//}