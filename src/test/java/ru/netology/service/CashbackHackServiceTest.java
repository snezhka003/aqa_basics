package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBeRemainIs10() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(990);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBeRemainIs1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBeRemainIs900() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }
}