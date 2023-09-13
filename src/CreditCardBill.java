import acm.program.ConsoleProgram;

public class CreditCardBill extends ConsoleProgram {
    public void run(){
        setFont("Courier New-20");

        double totalPay= readDouble("Enter total amt to pay : ");
        double monthlyPayment = readDouble("Enter monthly payment: ");
        double monthlyInterestRate = readDouble("Enter monthly interest rate in % : " );
        int month = 0;
        double paid = 0 ;


        while (totalPay > monthlyPayment ){
        double interest = totalPay * monthlyInterestRate/100;
        totalPay = ( totalPay - monthlyPayment) + interest ;
        paid += monthlyPayment ;
        month++;
        println("month: "+month+"\tBal: "+totalPay
                         +"\tPaid: "+paid);
        }
        paid += totalPay;
        totalPay = 0;
        month++;
        println("month: "+month+"\tBal: "+totalPay
                         +"\tPaid: "+paid);

    }
}
