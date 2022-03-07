package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountValidPickupDeliveryOptionsTest {
    @Test
    public void testCountOrders() {


        assertEquals(7484400, (new CountValidPickupDeliveryOptions()).countOrders(7));
        assertEquals(7484400, (new CountValidPickupDeliveryOptions()).countOrders(6));
        assertEquals(90, (new CountValidPickupDeliveryOptions()).countOrders(3));
        assertEquals(6, (new CountValidPickupDeliveryOptions()).countOrders(2));
    }
}

