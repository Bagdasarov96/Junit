package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void CashBackPlus100() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(900);
        int actual = 100;
        assertEquals(actual,expected);

    }

    @Test
    public void CashBack0() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1000);
        int actual = 0;
        assertEquals(actual,expected);

    }

}