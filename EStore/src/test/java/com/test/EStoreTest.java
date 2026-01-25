package com.test;

import com.exception.InvalidOnlineOrderException;
import com.model.OnlineOrder;
import com.util.EStore;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EStoreTest {

    private static EStore bObj;

    @BeforeAll
    public static void setUp() throws Exception {

        bObj = new EStore();

        OnlineOrder o1 = new OnlineOrder(
                101, "Vedaant", "Laptop", "Electronics",
                1, "Home Delivery", 55000
        );

        OnlineOrder o2 = new OnlineOrder(
                102, "Amit", "Mobile", "Mobiles",
                2, "Store Pickup", 40000
        );

        OnlineOrder o3 = new OnlineOrder(
                103, "Rahul", "Rice Bag", "Essentials",
                5, "Home Delivery", 2500
        );

        List<OnlineOrder> orderList = new ArrayList<>();
        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);

        bObj.setOnlineOrderList(orderList);
    }

    @Test
    public void test11ValidateItemTypeWhenElectronics() throws InvalidOnlineOrderException {
        assertTrue(bObj.validateItemType("Electronics"));
    }
    @Test
    public void test12ValidateItemTypeWhenMobiles() throws InvalidOnlineOrderException {
        assertTrue(bObj.validateItemType("Mobiles"));
    }

    @Test
    public void test13ValidateItemTypeWhenEssentials() throws InvalidOnlineOrderException {
        assertTrue(bObj.validateItemType("Essentials"));
    }

    @Test
    public void test14ValidateItemTypeWhenFashion() throws InvalidOnlineOrderException {
        assertTrue(bObj.validateItemType("Fashion"));
    }

    @Test
    public void test15ValidateItemTypeWhenInvalid() {
        assertThrows(
                InvalidOnlineOrderException.class,
                () -> bObj.validateItemType("Food")
        );
    }

    @Test
    public void test16ViewOnlineOrdersByOrderIdWhenValid() throws InvalidOnlineOrderException {

        OnlineOrder order = bObj.viewOnlineOrdersByOrderId(101);

        assertNotNull(order);
        assertEquals(101, order.getOrderId());
        assertEquals("Vedaant", order.getCustomerName());
        assertEquals("Electronics", order.getItemType());
    }

    @Test
    public void test17ViewOnlineOrdersByOrderIdWhenInvalid() {

        assertThrows(
                InvalidOnlineOrderException.class,
                () -> bObj.viewOnlineOrdersByOrderId(999)
        );
    }
}
