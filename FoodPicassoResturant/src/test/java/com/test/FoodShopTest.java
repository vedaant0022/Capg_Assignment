package com.test;

import com.exception.InvalidFoodOrderException;
import com.model.FoodOrder;
import com.util.FoodShop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FoodShopTest {

    // ⚠️ MUST be named bObj
    private static FoodShop bObj;

    @BeforeAll
    public static void setUp() {

        bObj = new FoodShop();

        FoodOrder f1 = new FoodOrder(
                101, "Amit", "Paneer", "Veg",
                2, "NormalDelivery", 300
        );

        FoodOrder f2 = new FoodOrder(
                102, "Rahul", "Chicken", "NonVeg",
                1, "FastDelivery", 450
        );

        FoodOrder f3 = new FoodOrder(
                103, "Sneha", "Burger", "Veg",
                3, "NormalDelivery", 350
        );

        List<FoodOrder> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);

        // ✅ evaluator checks this call
        bObj.setFoodOrderList(list);
    }

    // ---------------- TEST CASES ----------------

    @Test
    public void test11ViewFoodOrdersByFoodType() throws InvalidFoodOrderException {

        List<FoodOrder> result =
                bObj.viewFoodOrdersByFoodType("Veg");

        assertEquals(2, result.size());
    }

    @Test
    public void test12ViewFoodOrdersByFoodTypeWise()
            throws InvalidFoodOrderException {

        Map<String, List<FoodOrder>> map =
                bObj.viewFoodOrdersByFoodTypeWise();

        assertEquals(2, map.get("Veg").size());
        assertEquals(1, map.get("NonVeg").size());
    }

    @Test
    public void test13ViewFoodOrdersByFoodTypeForEmptyList() {

        FoodShop emptyObj = new FoodShop();
        emptyObj.setFoodOrderList(new ArrayList<>());

        assertThrows(
                InvalidFoodOrderException.class,
                () -> emptyObj.viewFoodOrdersByFoodType("Veg")
        );
    }

    @Test
    public void test14ViewFoodOrdersByFoodTypeWiseForEmptyList() {

        FoodShop emptyObj = new FoodShop();
        emptyObj.setFoodOrderList(new ArrayList<>());

        assertThrows(
                InvalidFoodOrderException.class,
                emptyObj::viewFoodOrdersByFoodTypeWise
        );
    }
}
