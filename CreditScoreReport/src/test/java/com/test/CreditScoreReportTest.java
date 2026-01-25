package com.test;

import com.exception.InvalidConsumerException;
import com.model.Consumer;
import com.util.CreditScoreReport;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CreditScoreReportTest {

    private static CreditScoreReport reportObj;

    @BeforeAll
    public static void setUp() {

        reportObj = new CreditScoreReport();

        // Create Consumer objects
        Consumer c1 = new Consumer(
                "C101", "Amit", "12-01-1995",
                "123456789", 50000, 820
        );

        Consumer c2 = new Consumer(
                "C102", "Rahul", "10-03-1994",
                "223456789", 40000, 720
        );

        Consumer c3 = new Consumer(
                "C103", "Sneha", "05-06-1996",
                "323456789", 30000, 550
        );

        Consumer c4 = new Consumer(
                "C104", "Priya", "20-09-1997",
                "423456789", 25000, 420
        );

        // Add consumers to list
        List<Consumer> consumerList = new ArrayList<>();
        consumerList.add(c1);
        consumerList.add(c2);
        consumerList.add(c3);
        consumerList.add(c4);

        reportObj.setConsumerList(consumerList);
    }

    @Test
    public void test11TotalConsumerCountForEachCreditScoreRange()
            throws InvalidConsumerException {

        Map<Integer, Integer> result =
                reportObj.totalConsumerCountForEachCreditScoreRange();

        assertEquals(1, result.get(820)); // Excellent
        assertEquals(1, result.get(720)); // Good
        assertEquals(1, result.get(550)); // Fair
        assertEquals(1, result.get(420)); // Poor
    }

    @Test
    public void test12TotalConsumerCountForEachCreditScoreRangeForEmptyList() {

        CreditScoreReport emptyObj = new CreditScoreReport();
        emptyObj.setConsumerList(new ArrayList<>());

        assertThrows(
                InvalidConsumerException.class,
                emptyObj::totalConsumerCountForEachCreditScoreRange
        );
    }

    @Test
    public void test13ViewConsumerReportBasedOnCreditScoreWhenExcellent()
            throws InvalidConsumerException {

        String result = reportObj.viewConsumerReportBasedOnCreditScore(850);
        assertEquals("EXCELLENT", result);
    }

    @Test
    public void test14ViewConsumerReportBasedOnCreditScoreWhenGood()
            throws InvalidConsumerException {

        String result = reportObj.viewConsumerReportBasedOnCreditScore(700);
        assertEquals("GOOD", result);
    }

    @Test
    public void test15ViewConsumerReportBasedOnCreditScoreWhenFair()
            throws InvalidConsumerException {

        String result = reportObj.viewConsumerReportBasedOnCreditScore(550);
        assertEquals("FAIR", result);
    }

    @Test
    public void test16ViewConsumerReportBasedOnCreditScoreWhenPoor()
            throws InvalidConsumerException {

        String result = reportObj.viewConsumerReportBasedOnCreditScore(350);
        assertEquals("POOR", result);
    }
    @Test
    public void test17ViewConsumerReportBasedOnCreditScoreForEmptyList() {

        CreditScoreReport emptyObj = new CreditScoreReport();
        emptyObj.setConsumerList(new ArrayList<>());

        assertThrows(
                InvalidConsumerException.class,
                () -> emptyObj.viewConsumerReportBasedOnCreditScore(1000)
        );
    }
}
