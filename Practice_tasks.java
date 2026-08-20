public class Practice_tasks {
    public static void main(String[] args) {
        final String EXPENSE_DESCRIPTION = "Lunch";//declaring expense name
        final int NUMBER_OF_PEOPLE = 6;
        final double APP_VERSION =0.1;
        boolean isActive = true;
        double INDIVIDUAL_SHARE=250.0;
        final double TOTAL_AMOUNT =  INDIVIDUAL_SHARE*NUMBER_OF_PEOPLE;
        double a=2.0;
        double b=1.1;
        System.out.println("APP VERSION : "+APP_VERSION);
        if(isActive){
            System.out.println("App active: true");
        }
        System.out.println("Expense name : "+EXPENSE_DESCRIPTION);
        System.out.println("No of people : "+NUMBER_OF_PEOPLE);
        System.out.println("Individual share : "+INDIVIDUAL_SHARE);
        System.out.println("Total amount : "+TOTAL_AMOUNT);
        System.out.println();
        System.out.println(a-b);

    }
}
