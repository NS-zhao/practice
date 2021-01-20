/**
 * Created by Administrator on 2021/1/19.
 */



window.onload = function(){
    var game;//游戏类对象
    var bullet;//子弹类对象
    var enemy;//敌机

    function Bullet(){
        this.w = 18;
        this.h = 35;
        this.src = "./img/myb_1.png";
        //变量接收子弹对象
        this._bullet = null;
        //记录当前子弹的坐标
        this.x;
        this.y;
        //子弹自身移动的速度
        this.speed = 10;
        //创建子弹对象
        this.cretebulle = function(){
            this._bullet = document.createElement("div");
            this._bullet.className = "bullet";
            this._bullet.style.width = this.w+"px";
            this._bullet.style.height = this.h+"px";
            this._bullet.style.backgroundImage = 'url('+this.src+')';
            scene.appendChild(this._bullet);
        };
        //子弹移动的方法
        this.move = function(){
            var that = this;
            that._bullet.timer = setInterval(function(){
                that.y-=5;
                that._bullet.style.top = that.y+"px";
                if(that.y<=0)
                {
                    clearInterval(that._bullet.timer);
                    that._bullet.remove();
                }

            },that.speed)
        }
    }

    //创建敌机类
    function Enemy(w,h,src,blood,score,x,speed){
        this.w = w;
        this.h = h;
        this.src = src;
        this.blood = blood;
        this.score = score;
        this._enemy = null;
        //当前的飞机坐标
        this.x = x;//x在屏幕上进行随机
        this.y = 0;//y刚出来在屏幕的顶部位置
        //敌机的移动速度
        this.speed = speed;
        //创造敌机类
        this.createEnemy = function(){
            this._enemy = document.createElement("div");
            this._enemy.className = "enemy";
            this._enemy.style.width = this.w+"px";
            this._enemy.style.height = this.h+"px";
            this._enemy.style.backgroundImage = 'url('+this.src+')';
            scene.appendChild(this._enemy);
            this._enemy.style.left = this.x+"px";
            this._enemy.style.top = this.y+"px";
        }
        //敌机自身移动的方法
        this.move = function(){
            var that = this;
            that._enemy.timer = setInterval(function(){
                that.y+=that.speed;
                that._enemy.style.top = that.y+"px";
                if(that.y>=document.documentElement.clientHeight)
                {
                    clearInterval(that._enemy.timer);
                    that._enemy.remove();
                }
            },20);
        }
    }

    function Game(){
        //定义游戏是否开始
        this.start = false;
        //把第一个飞机的路径作为当前游戏的默认值
        this.userPlaneSrc = "./img/my_1.png";
        this.userplane = null;//记录用户的飞机对象
        //触屏的坐标
        this.uplaneX;
        this.uplaneY;
        //飞机的宽高
        this.pw;
        this.ph;
        //子弹集合
        this.bulletList = [];//存储当前子弹
        //创建用户的飞机
        this.createBulletTimer = null;//创建一个子弹的计时器
        this.createBulletSpeed = 150;//创建子弹的频率
        this.createType = ['one','two','three'];//创建子弹发射的类型
        this.nowBulletype = 'one';//当前子弹的状态
        //创建敌机种类集合
        this.enemylist = [
            {'name':'ep_1',
                'src':'./img/ep_1.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_2',
                'src':'./img/ep_2.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_3',
                'src':'./img/ep_3.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_4',
                'src':'./img/ep_4.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_5',
                'src':'./img/ep_5.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_6',
                'src':'./img/ep_6.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_7',
                'src':'./img/ep_7.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_8',
                'src':'./img/ep_8.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_9',
                'src':'./img/ep_9.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_10',
                'src':'./img/ep_10.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_11',
                'src':'./img/ep_11.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_12',
                'src':'./img/ep_12.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_13',
                'src':'./img/ep_13.png',
                'w':40,
                'h':40,
                'blood':5,
                'score':10,
                'direct':'todown',
                'speed':3
            },
            {'name':'ep_14',
                'src':'./img/ep_14.png',
                'w':60,
                'h':60,
                'blood':10,
                'score':2,
                'direct':'toup',
                'speed':1
            },
            {'name':'ep_15',
                'src':'./img/ep_15.png',
                'w':60,
                'h':60,
                'blood':10,
                'score':20,
                'direct':'toup',
                'speed':1
            },
        ];
        this.createUserPlane = function(){
            //如果用户飞机不存在进行创建
            if(!this.userPlane)
            {
                var that = this;
                that.userplane = document.createElement("img");
                that.userplane.src = that.userPlaneSrc;
                that.userplane.className = "user";
                scene.appendChild(that.userplane);
                setTimeout(function(){
                    that.userplane.classList.add("usertrans");
                    that.pw = that.userplane.offsetWidth;
                    that.ph = that.userplane.offsetHeight;
                },10)
                //延迟计时器
                setTimeout(function(){
                    //得知道飞机的默认坐标
                    that.uplaneX = that.userplane.offsetLeft;
                    that.uplaneY = that.userplane.offsetTop;
                    //刚一出来，默认开火
                    that.defauleFire();
                    //开火之后2秒，开始出现敌机
                    setTimeout(function(){
                        that.startEnemyShow();
                    },2000)
                    //添加飞机的移动事件
                    //移动端触屏事件
                    //移动端触屏移动
                    that.userplane.addEventListener("touchmove",function(e){
                        var touch = e.touches[0];//触屏的第一个手指头
                        //触屏的坐标
                        var x = touch.pageX;
                        var y = touch.pageY;
                        that.uplaneX = x;
                        that.uplaneY = y;
                        that.setuplanePos();
                    })
                },1010)
            }
        };

        this.setuplanePos = function(){
            var that = this;
            //设置飞机的left，top值
            that.uplaneX = that.uplaneX-that.pw/2<=0?0:that.uplaneX-that.pw/2>=screen.availWidth-that.pw?screen.availWidth-that.pw:that.uplaneX-that.pw/2;
            that.uplaneY = that.uplaneY-that.ph/2<=0?0:that.uplaneY-that.ph/2>=screen.availHeight-that.ph?screen.availHeight-that.ph:that.uplaneY-that.ph/2;
            that.userplane.style.left = that.uplaneX+"px";
            that.userplane.style.top = that.uplaneY+"px"
        };
        //自动开枪的方法
        this.defauleFire = function(){
            var that = this;
            that.createBulletTimer = setInterval(function(){
                switch (that.nowBulletype){
                    //0口，1口，2口
                    case 'one':
                        that.newBullet(1);
                        break;
                    case 'two':
                        that.newBullet(0,2);
                        break;
                    case 'three':
                        that.newBullet(0,1,2);
                        break;
                }

            },that.createBulletSpeed)

        };
        //实例化子弹的方法
        this.newBullet = function(){
            var that = this;
            var args = Array.prototype.slice.call(arguments,0);
            for(var i = 0;i<args.length;i++)
            {
                //创建子弹实例
                bullet = new Bullet();
                bullet.cretebulle();
                //设置当前子弹的位置
                bullet.x = (that.pw/2-bullet.w/2)*args[i]+that.uplaneX;
                bullet._bullet.style.left = bullet.x+"px";
                bullet.y = (that.uplaneY-bullet.h);
                bullet._bullet.style.top = bullet.y+"px";
                bullet.move();
            }
        };
        //开始出现敌机的方法
        this.startEnemyShow = function(){
            var that = this;
            //随机一个敌机
            var index = Math.floor(Math.random()*that.enemylist.length);
            var newEnemy = that.enemylist[index];
            //随机x坐标
            var x = Math.random()*(document.documentElement.clientWidth-newEnemy.w);
            //敌机实例化
            enemy = new Enemy(newEnemy.w,newEnemy.h,newEnemy.src,newEnemy.blood,newEnemy.score,x,newEnemy.speed);
            enemy.createEnemy();
            enemy.move();
        }

    }
    game = new Game();

    uplane = document.querySelectorAll(".uplane");
    for(var i = 0;i<uplane.length;i++)
    {
        uplane[i].index = i;
        uplane[i].onclick = function(){
            uplane[this.index?0:1].classList.remove('ck');
            this.classList.add("ck");
            //获取用户选择的飞机
            game.userplane = this.src;
        }
    }

    //点击游戏开始事件
    startbtn.onclick = function(){
        game.start = true;
        //点击开始隐藏界面
        userpage.style.display = "none";
        //背景开始动画
        backAnim.classList.add("bganimte");
        game.createUserPlane();
    }
    //测试使用
    check.onchange = function(){
        game.nowBulletype = this.value;
    }
}