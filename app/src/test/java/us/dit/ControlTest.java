package us.dit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ControlTest {
    @Test void testOperacion() {
       
        assertNotNull(Control.operacion(1, 2), "existe el metodo operacion");
    }
}
