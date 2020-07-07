package orz.joey.service.test;

import org.junit.Test;
import orz.joey.service.HomeService;

public class JoeyTest {
    @Test
    public void indexTest() {
        System.out.println(HomeService.showLove("Jelly"));
    }
}
