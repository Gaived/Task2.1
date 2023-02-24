public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int stat() {
        int minP = sales[0];
        int maxP = sales[0];
        int sumP = 0;
        int stat = 0;
        for (int sale : sales) {
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