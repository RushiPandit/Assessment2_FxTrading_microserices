public class FXTradingEntity {
    private double usdAmount;
    @NonNull
    private int customerId;
    private String customerName;
    private String currencyPair;
    private String indianAmount;

    public double getUsdAmount() {
        return usdAmount;
    }

    public void setUsdAmount(double usdAmount) {
        this.usdAmount = usdAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(@NonNull int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public String getIndianAmount() {
        return indianAmount;
    }

    public void setIndianAmount(String indianAmount) {
        this.indianAmount = indianAmount;
    }
}
