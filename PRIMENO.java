public class PRIMENO {
    public static void main(String[] args) {
        int num, i, j, rem, n;
        n = args.length;
        System.out.println("\n PRIME NUMBERS ARE AS BELOW ,");
        for (i = 0; i < n; i++) {
            num = Integer.parseInt(args[i]);
            for (j = 2; j < num; j++) {
                rem = num % j;
                if (rem == 0) {
                    break;
                }
            }
            if (num == j) {
                System.out.println(num);
            }
        }
    }
}
