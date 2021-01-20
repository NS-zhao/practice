/**
 * Created by Administrator on 2021/1/19.
 */



window.onload = function(){
    var game;//��Ϸ�����
    var bullet;//�ӵ������
    var enemy;//�л�

    function Bullet(){
        this.w = 18;
        this.h = 35;
        this.src = "./img/myb_1.png";
        //���������ӵ�����
        this._bullet = null;
        //��¼��ǰ�ӵ�������
        this.x;
        this.y;
        //�ӵ������ƶ����ٶ�
        this.speed = 10;
        //�����ӵ�����
        this.cretebulle = function(){
            this._bullet = document.createElement("div");
            this._bullet.className = "bullet";
            this._bullet.style.width = this.w+"px";
            this._bullet.style.height = this.h+"px";
            this._bullet.style.backgroundImage = 'url('+this.src+')';
            scene.appendChild(this._bullet);
        };
        //�ӵ��ƶ��ķ���
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

    //�����л���
    function Enemy(w,h,src,blood,score,x,speed){
        this.w = w;
        this.h = h;
        this.src = src;
        this.blood = blood;
        this.score = score;
        this._enemy = null;
        //��ǰ�ķɻ�����
        this.x = x;//x����Ļ�Ͻ������
        this.y = 0;//y�ճ�������Ļ�Ķ���λ��
        //�л����ƶ��ٶ�
        this.speed = speed;
        //����л���
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
        //�л������ƶ��ķ���
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
        //������Ϸ�Ƿ�ʼ
        this.start = false;
        //�ѵ�һ���ɻ���·����Ϊ��ǰ��Ϸ��Ĭ��ֵ
        this.userPlaneSrc = "./img/my_1.png";
        this.userplane = null;//��¼�û��ķɻ�����
        //����������
        this.uplaneX;
        this.uplaneY;
        //�ɻ��Ŀ��
        this.pw;
        this.ph;
        //�ӵ�����
        this.bulletList = [];//�洢��ǰ�ӵ�
        //�����û��ķɻ�
        this.createBulletTimer = null;//����һ���ӵ��ļ�ʱ��
        this.createBulletSpeed = 150;//�����ӵ���Ƶ��
        this.createType = ['one','two','three'];//�����ӵ����������
        this.nowBulletype = 'one';//��ǰ�ӵ���״̬
        //�����л����༯��
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
            //����û��ɻ������ڽ��д���
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
                //�ӳټ�ʱ��
                setTimeout(function(){
                    //��֪���ɻ���Ĭ������
                    that.uplaneX = that.userplane.offsetLeft;
                    that.uplaneY = that.userplane.offsetTop;
                    //��һ������Ĭ�Ͽ���
                    that.defauleFire();
                    //����֮��2�룬��ʼ���ֵл�
                    setTimeout(function(){
                        that.startEnemyShow();
                    },2000)
                    //��ӷɻ����ƶ��¼�
                    //�ƶ��˴����¼�
                    //�ƶ��˴����ƶ�
                    that.userplane.addEventListener("touchmove",function(e){
                        var touch = e.touches[0];//�����ĵ�һ����ָͷ
                        //����������
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
            //���÷ɻ���left��topֵ
            that.uplaneX = that.uplaneX-that.pw/2<=0?0:that.uplaneX-that.pw/2>=screen.availWidth-that.pw?screen.availWidth-that.pw:that.uplaneX-that.pw/2;
            that.uplaneY = that.uplaneY-that.ph/2<=0?0:that.uplaneY-that.ph/2>=screen.availHeight-that.ph?screen.availHeight-that.ph:that.uplaneY-that.ph/2;
            that.userplane.style.left = that.uplaneX+"px";
            that.userplane.style.top = that.uplaneY+"px"
        };
        //�Զ���ǹ�ķ���
        this.defauleFire = function(){
            var that = this;
            that.createBulletTimer = setInterval(function(){
                switch (that.nowBulletype){
                    //0�ڣ�1�ڣ�2��
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
        //ʵ�����ӵ��ķ���
        this.newBullet = function(){
            var that = this;
            var args = Array.prototype.slice.call(arguments,0);
            for(var i = 0;i<args.length;i++)
            {
                //�����ӵ�ʵ��
                bullet = new Bullet();
                bullet.cretebulle();
                //���õ�ǰ�ӵ���λ��
                bullet.x = (that.pw/2-bullet.w/2)*args[i]+that.uplaneX;
                bullet._bullet.style.left = bullet.x+"px";
                bullet.y = (that.uplaneY-bullet.h);
                bullet._bullet.style.top = bullet.y+"px";
                bullet.move();
            }
        };
        //��ʼ���ֵл��ķ���
        this.startEnemyShow = function(){
            var that = this;
            //���һ���л�
            var index = Math.floor(Math.random()*that.enemylist.length);
            var newEnemy = that.enemylist[index];
            //���x����
            var x = Math.random()*(document.documentElement.clientWidth-newEnemy.w);
            //�л�ʵ����
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
            //��ȡ�û�ѡ��ķɻ�
            game.userplane = this.src;
        }
    }

    //�����Ϸ��ʼ�¼�
    startbtn.onclick = function(){
        game.start = true;
        //�����ʼ���ؽ���
        userpage.style.display = "none";
        //������ʼ����
        backAnim.classList.add("bganimte");
        game.createUserPlane();
    }
    //����ʹ��
    check.onchange = function(){
        game.nowBulletype = this.value;
    }
}