package KFC;

public class client {
    static float jituibao=7.9f;
    static float xueyubao=7.5f;
    static float aoerliangbao=8.9f;
    static float niuroubao=8.5f;
    static float jichi=6.3f;
    static float danta=5;
    static float shutiao=5.9f;
    static float kele=8;
    static float qixi=8;
    static float baixiangguo=10;
    int jituibaon;
    int xueyubaon;
    int aoerliangbaon;
    int niuroubaon;
    int jichin;
    int dantan;
    int shutiaon;
    int kelen;
    int qixin;
    int baixiangguon;
    float num;
    public client() {
        jituibaon = 0;
        xueyubaon = 0;
        aoerliangbaon = 0;
        niuroubaon = 0;
        jichin = 0;
        dantan = 0;
        shutiaon = 0;
        kelen = 0;
        qixin = 0;
        baixiangguon = 0;
        num=0;
    }
    public float jisuan() {
        num=jituibao*jituibaon+xueyubao*xueyubaon+aoerliangbao*aoerliangbaon+niuroubao*niuroubaon+
                jichi*jichin+danta*dantan+shutiao*shutiaon+kele*kelen+qixi*qixin+baixiangguo*baixiangguon;
        return num;
    }
}
