public class UniversityFee {
    public static void main(String[] args) {
        double fee = 125000;
        double discountpercent = 10;
        double discount = (fee*discountpercent)/100;
        double FeeAfterDiscount = fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+FeeAfterDiscount);
    }
}