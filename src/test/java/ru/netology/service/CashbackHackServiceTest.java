package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
    @Test
    public void testRemainEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void testRemainUpperBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_001;
        int expected = 999;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

}