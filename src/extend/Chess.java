package extend;

/**
 * 带参构造器类的继承
 * Created by ghost on 2017/8/24.
 */
class Game{
        Game(int i){
            System.out.println("Game "+ i);
        }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(1);//调用基类构造器
        System.out.println("BoardGame "+ i);
    }
}
public class Chess extends BoardGame{
    Chess(int i){
        super(11);
        System.out.println("Chess "+ i);
    }

    public static void main(String[] args) {
        Chess c = new Chess(111);
    }
}
