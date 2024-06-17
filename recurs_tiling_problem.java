public class recurs_tiling_problem {

    public static int tiling_prob(int n) { // (2 * n) where n is board size

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int fnm1 = tiling_prob(n - 1);

        // horizontal choice
        int fnm2 = tiling_prob(n - 2);

        int total_ways = fnm1 + fnm2;

        return total_ways;

    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(tiling_prob(n) + " ways");
    }
}
