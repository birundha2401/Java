public class SplitwiseApp {
    public static void main(String[] args) {
        final String expense_description="Dinner";
        final double total_amount=1200.0;
        final int number_of_people=4;
        double individual_share=total_amount / number_of_people;
        System.out.println("===Splitwise Console Backend===");
        System.out.println();
        System.out.println("Expense Description :" + expense_description);
        System.out.println("Total Amount :" + total_amount);
        System.out.println("Number of people :"+number_of_people);
        System.out.println("Eachperson should pay :"+individual_share);
        System.out.println();
        System.out.println("Basic calculation completed");

    }
}
