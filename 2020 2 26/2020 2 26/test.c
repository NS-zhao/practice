#include<stdio.h>

//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = (a > b, a = b + 10, a, b = a + 1);
//	printf("%d\n", c);
//	return 0;
//}


//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = 4;
//	int d = 3;
//	if (a = b + 1, c = a / 2, d > 0)
//		printf("%d\n", d);
//	return 0;
//}


//int main()
//{
//	int arr[5] = { 1, 2, 3, 4 };
//	printf("%d\n", arr[3]);
//	return 0;
//}



//int Add(int x, int y)
//{
//	return x + y;
//}
//
//int main()
//{
//	int ret = Add(2, 6);
//	printf("%d\n", ret);
//	return 0;
//}




//void test1()
//{
//	printf("hehe\n");
//}
//void test2(const char*str)
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
//	char name[20];
//	short age;
//	char id[12];
//};
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101" };
//	printf("%s %d %s\n", s.name, s.age, s.id);
//	return 0;
//}


//struct Stu
//{
//	char name[20];
//	short age;
//	char id[12];
//};
//
//int main()
//{
//	struct Stu s = { "张三", 20, "20190101" };
//	struct Stu*ps = NULL;
//	ps = &s;
//	printf("%s %d %s\n", (*ps).name,(*ps).age,(*ps).id);
//	printf("%s %d %s\n", ps->name, ps->age, ps->id);
//	return 0;
//}



//int main()
//{
//	char a = 3;
//	//a:00000011
//	//a:00000000000000000000000000000011
//	char b = 127;
//	//b:01111111
//	//b:00000000000000000000000001111111
//	char c = a + b;
//	//c:10000010
//	//c:11111111111111111111111110000010--补码
//	//  11111111111111111111111110000001--反码
//	//  10000000000000000000000001111110--原码  -126
//	
//	printf("%d\n", c);
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



//int main()
//{
//	char c = 1;
//	printf("%u\n", sizeof(c));
//	printf("%u\n", sizeof(+c));
//	printf("%u\n", sizeof(!c));
//	return 0;
//}