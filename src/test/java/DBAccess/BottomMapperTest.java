package DBAccess;

import FunctionLayer.DBException;
import org.junit.Test;

import static org.junit.Assert.*;

public class BottomMapperTest {
    @Test
    public void bottomtest() throws DBException {
        // Just check that we have a connection.
        assertEquals(BottomMapper.getAllBottoms().size(),5);
    }
}