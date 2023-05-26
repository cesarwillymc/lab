public class Subsequence {
    private static int counter = 0;
    public static int lcsBruteForce(String s1, String s2, int m, int n) {
        counter++;
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return 1 + lcsBruteForce(s1, s2, m-1, n-1);
        } else {
            return Math.max(lcsBruteForce(s1, s2, m, n-1), lcsBruteForce(s1, s2, m-1, n));
        }
    }

    public static int memoizedLcs(String s1, String s2, int m, int n, Integer[][] memo) {
        counter++;
        if (m == 0 || n == 0) {
            return 0;
        }
        if (memo[m-1][n-1] != null) {
            return memo[m-1][n-1];
        }
        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            memo[m-1][n-1] = 1 + memoizedLcs(s1, s2, m-1, n-1, memo);
        } else {
            memo[m-1][n-1] = Math.max(memoizedLcs(s1, s2, m, n-1, memo), memoizedLcs(s1, s2, m-1, n, memo));
        }
        return memo[m-1][n-1];
    }

    public static void main(String[] args) {
        String s1= "analavalaropa123a";
        String s2= "hoalacomoestas,aasaaa";
        System.out.printf("Brute force: \n s1: %s, s2: %s \t-> String more longer : %s \t counterRepetition: %s \n",s1,s2,lcsBruteForce(s1,s2,s1.length(),s2.length()),counter);

        counter=0;
        var data = new Integer[s1.length()][s2.length()];
        System.out.printf("Memo : \n s1: %s, s2: %s \t-> String more longer : %s \t counterRepetition: %s \n",s1,s2,memoizedLcs(s1,s2,s1.length(),s2.length(), data),counter);

    }

}
