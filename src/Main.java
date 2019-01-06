public class Main {
    public static void main(String args[]) {
        System.out.println("<----- BasicSingleton ----->");
        BasicSingleton singleton1 = BasicSingleton.getInstance();
        BasicSingleton singleton2 = BasicSingleton.getInstance();
        System.out.print("singleton1 == singleton2: ");
        System.out.println(singleton1 == singleton2);
        System.out.println();

        System.out.println("<----- BasicSingletonV2 ----->");
        BasicSingletonV2 singleton3 = BasicSingletonV2.getInstance();
        BasicSingletonV2 singleton4 = BasicSingletonV2.getInstance();
        System.out.print("singleton3 == singleton4: ");
        System.out.println(singleton3 == singleton4);
        System.out.println();

        System.out.println("<----- BasicSingletonThreadSafety ----->");
        BasicSingletonThreadSafety singleton5 = BasicSingletonThreadSafety.getInstance();
        BasicSingletonThreadSafety singleton6 = BasicSingletonThreadSafety.getInstance();
        System.out.print("singleton5 == singleton6: ");
        System.out.println(singleton5 == singleton6);
        System.out.println();

        System.out.println("<----- BasicSingletonSerializationSafety ----->");
        BasicSingletonSerializationSafety singleton7 = BasicSingletonSerializationSafety.getInstance();
        BasicSingletonSerializationSafety singleton8 = BasicSingletonSerializationSafety.getInstance();
        System.out.print("singleton7 == singleton8: ");
        System.out.println(singleton7 == singleton8);
        System.out.println();

        System.out.println("<----- BasicSingletonEnum ----->");
        BasicSingletonEnum singleton9 = BasicSingletonEnum.INSTANCE;
        BasicSingletonEnum singleton10 = BasicSingletonEnum.INSTANCE;
        System.out.print("singleton9 == singleton10: ");
        System.out.println(singleton9 == singleton10);
        System.out.println();

    }
}
