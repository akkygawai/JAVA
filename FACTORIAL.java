public class FACTORIAL {
    public static void main(String[] args) {
        int N = args.length, i, num;
        long fact;
        for (i = 0; i < N; i++) {
            num = Integer.parseInt(args[i]);
            fact = 1;
            while (num > 1) {
                fact = fact * num;
                num--;
            }
            System.out.println("FACTORIAL OF " + args[i] + "=" + fact);
        }
    }
}


