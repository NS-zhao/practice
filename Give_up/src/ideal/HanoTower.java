package ideal;

public class HanoTower {
    static int count = 0;
    public static void main(String[] args) {
        int n = 3;
        char[] towers = {'A','B','C'};
        hanoTower(n,towers[0],towers[1],towers[2]);
    }

    public static void move(int diskNumber,char sourceTower,char destTower) {
        count++;
        System.out.println("移动次数为"+count+" ,编号为"+diskNumber+"的盘子从"+sourceTower+"移动到"+destTower);
    }

    public static void hanoTower(int nDisks,char towerA,char towerB,char towerC) {
        if(nDisks == 1){
            //将唯一的一个盘子从A->C
            move(1,towerA,towerC);
        }
        else{
            //n>=2,先将n-1个盘子从A->B,C作为辅助
            hanoTower(nDisks-1,towerA,towerC,towerB);
            //将编号为n的盘子从A->C
            move(nDisks,towerA,towerC);
            //将n-1个盘子从B->C，A作为辅助
            hanoTower(nDisks-1,towerB,towerA,towerC);
        }
    }
}
