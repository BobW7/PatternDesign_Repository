import com.bob.combination3.S0123_Player;
import com.bob.combination3.builder.S0123_Director;
import com.bob.combination3.builder.S0123_PlayerABuilder;
import com.bob.combination3.builder.S0123_PlayerBBuilder;
import org.junit.Test;

public class Combination3_test {
    @Test
    public void test() {
        S0123_PlayerABuilder aBuilder = new S0123_PlayerABuilder();
        S0123_Director director = new S0123_Director(aBuilder);
        S0123_Player playerA = director.construct();
        playerA.show();
        playerA.action();
        playerA.gotHit();
        playerA.action();
        playerA.restart();
        playerA.action();
        playerA.pauseGame();
        playerA.action();

        System.out.println("====================================");
        System.out.println();
        director.setBuilder(new S0123_PlayerBBuilder());
        S0123_Player playerB = director.construct();
        playerB.show();
    }

}
