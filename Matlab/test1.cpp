// C语言的Floyd算法
#include <stdio.h>
#define M 99999999
#pragma warning(disable:4996) 
#define max 49
#define n 49

void printPath(int u, int v, int path[][max])
{
	if (path[u][v] == -1)
	{
		printf("<%d, %d>", u, v);
	}// 直接输出
	else
	{
		int mid = path[u][v];
		printPath(u, mid, path);
		printPath(mid, v, path);
	}
}


void Floyd(int m, int MGraph[][n], int path[][n])
{
	int i, j, v;
	int A[n][n];
	for (i = 0; i < m; i++)
	{
		for (j = 0; j < m; j++)
		{
			A[i][j] = MGraph[i][j];
			path[i][j] = -1;
		}
	}

	for (v = 0; v < n; ++v)
	{
		for (i = 0; i < n; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				if (A[i][j] > A[i][v] + A[v][j])
				{
					A[i][j] = A[i][v] + A[v][j];
					path[i][j] = v;
				}
			}
		}
	}
}

int m = 49;

int path[49][49] = { 0 };



int MGraph[][49] = {
	{ 0, 120, 270, M, 540, 799, M, M, M, M, M, M, M, M, 420, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 844, M, M, M, M, M, M, M, M, M },
	{ 120, 0, 370, M, M, M, M, M, M, M, M, M, M, M, 360, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ 270, 370, 0, 210, M, M, M, M, M, M, M, M, M, M, 311, 440, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, 210, 0, 530, M, M, M, M, M, M, M, M, M, M, 430, M, M, M, M, M, M, M, M, M, M, 630, M, M, 760, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ 540, M, M, 530, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 720, M, M, M, M, M, M, M, M, M, 1521, M, M, M, M, M, M, 186, M, M },
	{799, M, M, M, M, 0, 330, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 387, 727, M, M, M, M, M, M, M, M, M},
	{ M, M, M, M, M, 330, 0, 230, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 429, 347, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, 230, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 819, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, 0, 280, 190, M, M, M, 840, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, 280, 0, 279, 160, M, 660, 680, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 598, M, M, M, M, 325, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, 190, 279, 0, M, 880, 640, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 153, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, 160, M, 0, M, 610, M, 650, 540, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 435, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, 880, M, 0, 680, M, M, M, M, 1020, M, M, M, M, M, M, M, M, M, M, M, M, 490, M, M, M, 266, 592, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, 660, 640, 610, 680, 0, M, M, 270, 640, 860, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ 420, 360, 311, M, M, M, M, M, 840, 680, M, M, M, M, 0, 430, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 361, M, M, M, M, 349, M, M, M, M, M, M },
	{ M, M, 440, 430, M, M, M, M, M, M, M, 650, M, M, 430, 0, 540, M, M, M, M, M, M, M, M, M, 550, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 473, 285, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, 540, M, 270, M, 540, 0, 380, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 406, 362, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, 640, M, M, 380, 0, 780, M, M, M, M, 1010, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 508, M, M, 664, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, 1020, 860, M, M, M, 780, 0, 710, 580, M, M, M, M, M, M, M, M, M, M, M, M, 130, 127, 688, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 710, 0, 560, M, M, 650, 820, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 305, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 580, 560, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 270 },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, 340, 490, 1090, M, 910, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 795, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 340, 0, M, 990, 2170, 920, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 1010, M, 650, M, 490, M, 0, 650, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 560, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 820, M, 1090, 990, 650, 0, 2320, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 2170, M, 2320, 0, M, M, 1940, M, 2672, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, 630, M, M, M, M, M, M, M, M, M, M, M, 550, M, M, M, M, M, 910, 920, M, M, M, 0, 700, M, 640, M, M, M, M, M, M, M, M, M, M, M, M, M, 637, M, 304, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 700, 0, 230, 500, 1980, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 1940, M, 230, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, 760, 720, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 640, 500, M, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 554, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 2672, M, 1980, M, M, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, 490, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, M, 36, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 130, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 127, M, M, M, M, M, M, M, M, M, M, M, M, M, 36, M, 0, 591, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 688, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 591, 0, M, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, 153, M, 592, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, M, M, M, M, M, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, 598, M, M, M, M, 361, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, M, M, M, M, 368, M, M, M, M, M, M },
	{ M, M, M, M, M, 387, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, M, M, M, M, M, M, M, M, M, M },
	{ 844, M, M, M, 1521, 727, 429, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, 304, 929, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, 347, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 304, 0, 669, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, 819, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 929, 669, 0, M, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, 325, M, 435, M, M, 349, 473, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 368, M, M, M, M, 0, M, M, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 285, 406, M, M, M, M, M, M, M, M, M, 637, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, 466, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 362, 508, M, M, M, 795, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 466, 0, M, M, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 304, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, 541, M, M },
	{ M, M, M, M, 186, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 554, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 541, 0, M, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 664, M, 305, M, M, M, 560, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0, M },
	{ M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 270, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, M, 0 },
};

int main()
{
	int u, v;

	scanf("%d %d", &u, &v);
	Floyd(49, MGraph, path);
	printPath(u, v, path);
	return 0;
}