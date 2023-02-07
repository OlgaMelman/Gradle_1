package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {

    @Test
    public void testRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemainEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemainUpperBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_001;
        int expected = 999;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }

}