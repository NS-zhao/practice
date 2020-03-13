#include<stdio.h>

//int main()
//{
//	int a = 10;
//	int x = a++;
//	printf("x = %d a = %d\n", x, a);
//	int y = a--;
//	printf("y = %d a = %d\n", y, a);
//	return 0;
//}




//int main()
//{
//	int i = 0, a = 0, b = 2, c = 3, d = 4;
//	//i = a++ && ++b && d++;
//	i = a++ || ++b || d++;
//	printf("a = %d\n b = %d\n c = %d\n d = %d\n i = %d\n", a, b, c, d,i);
//	return 0;
//}



//int main()
//{
//	int a = 20;
//	int b = 10;
//	int max = a > b ? a : b;
//	printf("%d\n", max);
//	return 0;
//}




//void test1()
//{
//	printf("hehe\n");
//}
//
//void test2(const char *str)
//{
//	printf("%s\n", str);
//}
//
//int main()
//{
//	test1();
//	test2("hello girls");
//	return 0;
//}



//struct Stu
//{
//	char name[10];
//	short age;
//	char id[20];
//};
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20200101" };
//	printf("%s %d %s\n", s.name, s.age, s.id);
//	return 0;
//}



//struct Stu
//{
//	char name[10];
//	short age;
//	char id[20];
//};
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20200101" };
//	struct Stu *ps = NULL;
//	ps = &s;
//	printf("%s %d %s\n", (*ps).name,(*ps).age,(*ps).id);
//	return 0;
//}




//struct Stu
//{
//	char name[10];
//	short age;
//	char id[20];
//};
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20200101" };
//	struct Stu *ps = NULL;
//	ps = &s;
//	printf("%s %d %s\n", ps->name,ps->age,ps->id);
//	return 0;
//}



//void set_age1(struct Stu s)
//{
//	s.age = 18;
//}
//
//void set_age2(struct Stu *ps)
//{
//	ps->age = 18;
//}
//
//int main()
//{
//	struct Stu s;
//	struct Stu *pStu = &s;
//
//	s.age = 20;
//	set_age1(stu);
//
//	ps->age = 20;
//	set_age2(pStu);
//	return 0;
//}




//int main()
//{
//	char a = 3;
//	char b = 127;
//	char c = a + b;
//	printf("%d\n", c);
//	//整型提升：char是有符号的char，所以整形提升的时候，高位补充符号位
//	//a 00000011->整型提升00000000000000000000000000000011
//	//b 01111111->整型提升00000000000000000000000001111111
//	//c 10000010->整型提升11111111111111111111111110000010---补码
//	//                    11111111111111111111111110000001---反码
//	//                    10000000000000000000000001111110---原码
//	printf("%u\n", c);
//	//变为无符号数字，1为有效数字
//	return 0;
//}




//int main()
//{
//	char a = 0xb6;
//	short b = 0xb600;
//	int c = 0xb6000000;
//	if (a == 0xb6)
//		printf("a");
//	if (b == 0xb600)
//		printf("b");
//	if (c == 0xb6000000)
//		printf("c");
//	return 0;
//}



int main()
{
	int a = 0;
	a--;
	if (a < sizeof(a))
	{
		printf("hehe\n");
		
	}
	else
	{
		printf("haha\n");
	}
	printf("%u\n", a);
	return 0;
}