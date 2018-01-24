import eu.antidote.jupyter.antidote.crdt.RegisterService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for RegisterService
 *
 */
public class RegisterServiceTest extends AbstractAntidoteTest{

    RegisterService service;
    public RegisterServiceTest(){
        super();
        service = new RegisterService(antidoteService);
    }

    @Test
    public void testUpdateRegister(){
        service.assignRegister("key1", "testValue");

        String readValue = service.readRegister("key1");
        assertEquals(readValue, "testValue");
    }

}