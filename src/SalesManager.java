public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long stat() {
        long minP = sales[0];
        long maxP = sales[0];
        long sumP = 0;
        long stat = 0;
        for (long sale : sales) {
            if (sale < minP) {
                minP = sale;
            }
            if (sale > maxP) {
                maxP = sale;
            }
            sumP += sale;
        }

        stat = (sumP - minP - maxP) / (sales.length - 2);
        return stat;
    }
}