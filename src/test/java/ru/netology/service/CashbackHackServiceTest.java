package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1900);
        int expected = 100;
        assertEquals(expected,actual);
    }
    @Test
    public void CashBack0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);

    }
}