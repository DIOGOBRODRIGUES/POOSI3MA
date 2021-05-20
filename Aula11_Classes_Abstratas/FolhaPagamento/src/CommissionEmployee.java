public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn,
    double sales, double rate){
        super(first, last, ssn);
        setGrossSale(sales);
        setCommissionRate(rate);
    }
    
    public void setGrossSale(double sales){
        this.grossSales = sales;
    }

    public void setCommissionRate(double rate){
       this.commissionRate = rate;
    }

    public double getGrossSale(){
        return this.grossSales;
    }

    public double getCommissionRate(){
        return this.commissionRate;
    }


    public double earnings(){
        return getCommissionRate()*getGrossSale();
    }

    public String toString(){
        return String.format("%s: %s\n%s : %.2f, %s: %.2f", 
        "commission employee",super.toString(), "groos sales", this.getGrossSale(),
        "commision rate", this.getCommissionRate());
    }

    @Override
    public double getPaymentAmount() {
        // TODO Auto-generated method stub
        return 0;
    }


}
