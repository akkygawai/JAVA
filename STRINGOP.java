public class STRINGOP {
    public static void main(String args[]) {
        String S2 = new String("anjuman bca college bhatkal");
        String S1 = new String("ANJUMAN BCA COLLEGE BHATKAL");
        System.out.println("THE STRING S1 IS : " + S1);
        System.out.println("THE STRING S2 IS : " + S2);
        System.out.println("LENGTH OF THE STRING S1 :" + S1.length());
        System.out.println("THE FIRST OCCURENCE OF b IS AT THE POSITION :" + S1.indexOf("m"));
        System.out.println("THE STRING IN UPPER CASE :" + S1.toUpperCase());
        System.out.println("THE STRING IN  CASE :" + S1.toLowerCase());
        System.out.println("S1 EQUAL TO S2" + S1.equals(S2));
        System.out.println("S1 Equals Ignore Case to S2" + S1.equalsIgnoreCase(S2));
        int Result = S1.compareTo(S2);
        if (Result == 0) { System.out.println(S1 + " IS EQUAL TO " + S2);
        } else if (Result > 0) { System.out.println(S1 + " IS GREATER THAN " + S2);
        } else { System.out.println(S1 + " IS SMALLER THAN " + S2); }
        System.out.println("CHARACTER AT INDEX OF 6 IS: " + S1.charAt(6));
        String S3 = S1.substring(4, 12);
        System.out.println("EXTRACTED SUBSTRING IS: " + S3);
        System.out.println("AFTER REPLACING b WITH m IS S1:" + S1.replace('m', 'b'));
        String S4 = "This is a book";
        System.out.println("THE STRING S4 IS:" + S4);
        System.out.println("aftertrim" + S4.trim());
        String S5 = "Akyes "; String S6 = "Ahmed";
        String S7 = S5.concat(S6);
        System.out.println("CONCATENATING " + S5 + " AND " + S6 + ":" + S7);
    }}