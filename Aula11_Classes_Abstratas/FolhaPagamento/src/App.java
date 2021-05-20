public class App {
    public static void main(String[] args) throws Exception {
        Payable payableObjects[] = new Payable[4];

        payableObjects[0] = new Invoice("01234", "água", 2, 55.0);
        payableObjects[1] = new Invoice("123456", "Luz", 4, 79.45);
        payableObjects[2] = new SalariedEmployee("Lincoln", "Figueredo", "1231354--55", 10000);
        payableObjects[3] = new SalariedEmployee("Magdiel", "Silva", "124465-56", 10000);

        System.out.println("Invoices and Employess"+ "processed polymorphically: \n");

        for(Payable currentPayable: payableObjects){
            System.out.printf("%s \n %s: $%,.2f\n\n", currentPayable.toString(), 
            "Payment due", currentPayable.getPaymentAmount());
        }

    }
}
