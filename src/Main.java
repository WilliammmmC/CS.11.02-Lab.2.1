// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    public static void main(String[] args) {
        int result1 = add(1, 3);
        System.out.println(result1);

        int result2 = add(2, 4, 6, 9);
        System.out.println(result2);

        String name1 = morningGreeting("William Chen");
        System.out.println(name1);

        String name2 = afternoonGreeting("William Chen");
        System.out.println(name2);

        String triple1 = triple("Computer");
        System.out.println(triple1);

        double half1 = half(7);
        System.out.println(half1);

        int Positive1 = roundPositiveValueToNearestInteger(6.2);
        System.out.println(Positive1);

        int Negative1 = roundNegativeValueToNearestInteger(-7.2);
        System.out.println(Negative1);


    }


    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(a,b) + add(c,d);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好，" + name;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好，" + name;
    }

    // 5. triple
    public static String triple(String entry){
        return entry + entry + entry;
    }

    // 6. half
    public static double half(int a){
        return (double) a /2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) Math.round(a);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) Math.round(a);
    }
}
