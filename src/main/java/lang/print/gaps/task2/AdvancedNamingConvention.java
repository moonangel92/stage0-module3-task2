package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    public static void main(String[] args) {
        int adult_age = 18;

        int age = 25;
        int phoneNumber = 12351;



        System.out.println(adult_age);
        System.out.println(age);
        System.out.println(phoneNumber);

        callToFriend();
        callByNumber();
    }

    //        {
    public static void callToFriend() {
         System.out.println("Jack");
    }

    public static void callByNumber() {
        System.out.println(874156);
    }

}
