package DBAccess;

import FunctionLayer.DBException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopMapperTest {
    @Test
    public void toptest() throws DBException {
        // Just check that we have a connection.
     assertEquals(TopMapper.getAllToppings().size(),9);
    }

}