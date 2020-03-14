import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    @Test
    public void testJudgeMethod() {
        List<String> white = new ArrayList<>();
        List<String> black = new ArrayList<>();
        white.add("2D");
        white.add("3H");
        white.add("5C");
        white.add("9S");
        white.add("KH");
        black.add("2H");
        black.add("3D");
        black.add("5S");
        black.add("9C");
        black.add("KD");
        System.out.println(TexasRules.judgeCards(white, black));
        Assert.assertEquals("Tie", TexasRules.judgeCards(white, black));
    }
}
