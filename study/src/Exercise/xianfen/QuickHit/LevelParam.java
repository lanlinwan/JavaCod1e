package Exercise.xianfen.QuickHit;

public class LevelParam {
    static Level[] levels=new Level[6];


    static {
        levels[0]=new Level(1, 4, 2, 30,1);
        levels[1]=new Level(2, 8, 2, 25,2);
        levels[2]=new Level(3, 10, 2, 25,5);
        levels[3]=new Level(4, 15, 2, 30,8);
        levels[4]=new Level(5, 20, 1, 20,10);
        levels[5]=new Level(6, 30, 1, 20,15);

    }
}
