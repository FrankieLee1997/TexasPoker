import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    @Test
    public void testJudgeMethod() {
        List<String> white = new ArrayList<>();
        List<String> black = new ArrayList<>();
        white.add("2H");
        white.add("3D");
        white.add("5S");
        white.add("9C");
        white.add("KD");
        black.add("2C");
        black.add("3H");
        black.add("4S");
        black.add("8C");
        black.add("KH");
        System.out.println(TexasRules.judgeCards(white, black));
        Assert.assertEquals("Tie", TexasRules.judgeCards(white, black));
    }
}
