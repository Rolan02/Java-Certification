public class PracticeOne {
    public static void main(String[] args) {
     String s1 = "Yes";
        String s2 = "Yes";
        String s3 = new String(s1);
        s1.concat(s2); // No se toma este valor por que String es inmutable
        System.out.println(s1);

        //Operators and statements
        int x = 1;
        x = (x = 2) + (x = 3); //5
        boolean flag = x == 100; //false

        //Ternary operator with several levels
        x = 10;
        x = x > 10 ? x < 10 ? 1 : 2 : 3;
        //   false                  : 3
        //   true    x < 10 ? 1 : 2
    }

}
