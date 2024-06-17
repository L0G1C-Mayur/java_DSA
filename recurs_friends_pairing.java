public class recurs_friends_pairing {

    public static int friendspairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        // choices
        // single
        int fnm1 = friendspairing(n - 1);

        // pair
        int fnm2 = friendspairing(n - 2);
        int pairways = (n - 1) * fnm2;

        int total_ways = fnm1 + pairways;
        return total_ways;

        // also we can directly write as,
        // return friendspairing(n-1) + (n-1) * friendspairing(n-2);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(friendspairing(n));
    }
}
