#include<stdio.h>
//struct Stu
//{
//	char name[20];
//	short age;
//	char sex[5];
//	char id[15];
//};
//int main()
//{
//	struct Stu * pzs = NULL;
//	struct Stu zhangsan = { "����",20,"��","20200217" };
//	struct Stu lisi = { "����",30,"����","20200218" };
//	printf("%s %d %s %s\n", zhangsan.name, zhangsan.age, zhangsan.sex, zhangsan.id);
//
//	//->
//	pzs = &zhangsan;
//	printf("%s %d %s %s\n", (*pzs).name,(*pzs).age,(*pzs).sex,(*pzs).id);
//	printf("%s %d %s %s\n",pzs->name,pzs->age,pzs->sex,pzs->id);
//	return 0;
//}





//����֧
//int main()
//{
//	int age = 19;
//	if (age > 18)
//	{
//		printf("����\n");
//	}
//	return 0;
//}



//˫��֧
//int main()
//{
//	int age = 19;
//	if (age > 18)
//	{
//		printf("����\n");
//	}
//	else
//	{
//		printf("δ����\n");
//	}
//	return 0;
//}


//���֧
//int main()
//{
//	int age = 60;
//	if (age < 18)
//	{
//		printf("����\n");
//	}
//	else if (age>=18&&age<=25)
//	{
//		printf("����\n");
//	}
//	else if (age >= 25 && age <= 40)
//	{
//		printf("����\n");
//	}
//	else if (age >= 40 && age <= 70)
//	{
//		printf("������\n");
//	}
//	else if (age >= 70 && age <= 100)
//	{
//		printf("����\n");
//	}
//	else
//	{
//		printf("������\n");
//	}
//	return 0;
//}




//int main()
//{
//	int a = 0;
//	int b = 2;
//	if (a == 1)
//		if (b == 2)
//			printf("hehe\n");
//		
//	else
//		printf("haha\n");
//	return 0;
//}
//���������Ϊelse�Ǻ����������ifƥ���




//����
//int main()
//{
//	int a = 0;
//	int b = 2;
//	if (a == 1)
//	{
//		if (b == 2)
//		{
//			printf("hehe\n");
//		}
//	}
//	else
//	{
//		printf("haha\n");
//	}
//	return 0;
//}





//int main()
//{
//	int i = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		if (i % 2 == 1)
//		{
//			printf("%d ", i);
//		}
//	}
//	return 0;
//}



//int main()
//{
//	int i = 0;
//	for (i = 1; i <= 100; i+=2)
//		printf("%d ", i);
//	return 0;
//}


//int main()
//{
//	int day = 0;
//	scanf("%d", &day);
//	switch (day)
//	{
//	case 1:
//		printf("����һ\n");
//		break;
//	case 2:
//		printf("���ڶ�\n");
//		break;
//	case 3:
//		printf("������\n");
//		break;
//	case 4:
//		printf("������\n");
//		break;
//	case 5:
//		printf("������\n");
//		break;
//	case 6:
//		printf("������\n");
//		break;
//	case 7:
//		printf("������\n");
//		break;
//	}
//	return 0;
//}


//int main()
//{
//	int day = 0;
//	scanf("%d", &day);
//	switch (day)
//	{
//	case 1:
//	case 2:
//	case 3:
//	case 4:
//	case 5:
//		printf("������\n");
//		break;
//	case 6:
//	case 7:
//		printf("��Ϣ��\n");
//		break;
//	}
//	return 0;
//}



//int main()
//{
//	int day = 0;
//	scanf("%d", &day);
//	switch (day)
//	{
//	case 1:
//		printf("����һ\n");
//		break;
//	case 2:
//		printf("���ڶ�\n");
//		break;
//	case 3:
//		printf("������\n");
//		break;
//	case 4:
//		printf("������\n");
//		break;
//	case 5:
//		printf("������\n");
//		break;
//	case 6:
//		printf("������\n");
//		break;
//	case 7:
//		printf("������\n");
//		break;
//	default:
//		printf("�������\n");
//		break;
//	}
//	return 0;
//}




//int main()
//{
//	int day = 0;
//	scanf("%d", &day);
//	switch (day)
//	{
//	default:
//		printf("�������\n");
//		break;
//	case 1:
//	case 2:
//	case 3:
//	case 4:
//	case 5:
//		printf("������\n");
//		break;
//	case 6:
//	case 7:
//		printf("��Ϣ��\n");
//		break;
//	}
//	return 0;
//}




//int main()
//{
//	int n = 1;
//	int m = 2;
//	switch (n)
//	{
//	case 1:
//		m++;
//	case 2:
//		n++;
//	case 3:
//		switch (n)
//		{//switch����Ƕ��ʹ��
//		case 1:
//			n++;
//		case 2:
//			m++;
//			n++;
//			break;
//		}
//	case 4:
//		m++;
//		break;
//	default:
//		break;
//	}
//	printf("m = %d,n = %d\n", m, n);
//	return 0;
//}




//int main()
//{
//	int i = 1;
//	while (i <= 10)
//	{
//		printf("%d ", i);
//		i++;
//	}
//	return 0;
//}


//int main()
//{
//	int i = 1;
//	while (i <= 10)
//	{
//		if (i == 5)
//			break;
//		printf("%d ", i);
//		i++;
//	}
//	return 0;
//}



//int main()
//{
//	int i = 1;
//	while (i <= 10)
//	{
//		if (i == 5)
//			continue;
//		printf("%d ", i);
//		i++;
//	}
//	return 0;
//}