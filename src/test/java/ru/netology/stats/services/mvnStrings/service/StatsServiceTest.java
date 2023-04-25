package ru.netology.stats.services.mvnStrings.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void sumSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 180;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.TotalSalesAmountMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void AverageSalesAmount() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        double expected = 15;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        double actual = service.AverageSalesAmount(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 9;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void maxSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 8;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void minAverageSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 5;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.minAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void maxAverageSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 5;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.minAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
