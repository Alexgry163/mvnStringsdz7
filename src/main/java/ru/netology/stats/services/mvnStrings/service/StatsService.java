package ru.netology.stats.services.mvnStrings.service;

public class StatsService {
    public int TotalSalesAmountMonth(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public int AverageSalesAmount(long[] sales) {
        int sumMonth = TotalSalesAmountMonth(sales);
        int quantityMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            quantityMonth = i; // запомним его как минимальный
        }

        return sumMonth / (quantityMonth + 1);
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int index = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minAverageSales(long[] sales) {
        double average = AverageSalesAmount(sales);
        int minMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                minMonth++;
            }
        }
        return minMonth;
    }

    public int maxAverageSales(long[] sales) {
        double average = AverageSalesAmount(sales);
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                maxMonth++;
            }
        }
        return maxMonth;
    }
}
