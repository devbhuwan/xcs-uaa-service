package xcs.uaa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XcsUaaServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class XcsUaaServiceApplicationTests {

    @LocalServerPort
    protected int port;
    protected String authServer;

    @Before
    public void setUp() {
        this.authServer = "http://localhost:" + port + "/auth";
    }

    @Test
    public void contextLoads() {
    }

}
