#include<stdio.h>

//int main()
//{
//	int codding = 0;
//	printf("���ȥ�ô����𣿣�ѡ��1 or 0����>");
//	scanf("%d", &codding);
//	if (codding == 1)
//	{
//		printf("��֣�����к�offer\n");
//
//	}
//	else
//	{
//		printf("�������ؼ�������\n");
//	}
//	return 0;
//}



//int main()
//{
//	printf("�������\n");
//	int line = 0;
//	while (line <= 20000)
//	{
//		line++;
//		printf("��Ҫ����Ŭ���ô���\n");
//
//	}
//	if (line > 20000)
//		printf("ӭȢ�׸���\n");
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ",arr[i]);
//
//	}
//	printf("\n");
//	return 0;
//}




//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int i = 0;
//	while (i < 10)
//	{
//		printf("%d ", arr[i]);
//		i++;
//	}
//	return 0;
//}




//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int i = 0;
//	while (i < 10)
//	{
//		arr[i] = 0;
//		i++;
//	}
//	i = 0;
//	while (i < 10)
//	{
//		printf("%d ", arr[i]);
//		i++;
//	}
//	return 0;
//}



//int main()
//{
//	int a = 12;
//	int b = a >> 1;
//	//a-----00000000000000000000000000000001100
//	//a>>1--00000000000000000000000000000000110
//	printf("%d\n", b);
//	return 0;
//}



//int main()
//{
//	int a = 1;
//	//a    00000000000000000000000000000000001
//	//b    00000000000000000000000000000000010
//	//a&b  00000000000000000000000000000000000
//	//a|b  00000000000000000000000000000000011
//	//a^b  00000000000000000000000000000000011
//	int b = 2;
//	int c = a&b;
//	int d = a | b;
//	int e = a^b;
//	printf("%d %d %d", c, d, e);
//	printf('\n');
//	return 0;
//}



//int main()
//{
//	int a = (int)3.14;
//	printf("%d\n", a);
//	return 0;
//}



//int main()
//{
//	int a = 0;
//	printf("%d\n", ~a);
//	return 0;
//}



//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//	if (a > b)
//		max = a;
//	else
//		max = b;
//	printf("%d\n", max);
//}//	return 0;




//int main()
//{
//	int a = 10;
//	int *p = &a;
//	*p = 20;
//	printf("a = %d\n", a);
//	printf("%p\n", &a);
//	return 0;
//}



//int main()
//{
//	char ch = 'w';
//	char *pc = &ch;
//	*pc = 'q';
//	printf("%c\n", ch);
//	return 0;
//}



//struct Stu
//{
//	char name[20];
//	short age;
//	char sex[5];
//	char id[15];
//};
//
//int main()
//{
//	struct Stu zhangsan = { "����", 20, "��", "20200217" };
//	printf("%s %d %s %s\n", zhangsan.name, zhangsan.age, zhangsan.sex, zhangsan.id);
//	return 0;
//}




//struct Stu
//{
//	char name[20];
//	short age;
//	char sex[5];
//	char id[15];
//};
//
//int main()
//{
//	struct Stu *pzs = NULL;
//	struct Stu zhangsan = { "����", 20, "��", "20200217" };
//	pzs = &zhangsan;
//	printf("%s %d %s %s\n", (*pzs).name, (*pzs).age, (*pzs).sex, (*pzs).id);
//	printf("%s %d %s %s\n", pzs->name, pzs->age, pzs->sex, pzs->id);
//	return 0;
//}



