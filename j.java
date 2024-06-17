
    public class j {
        public static boolean isPalindrome(String str) {
            int n = str.length();
            for (int i = 0; i < n / 2; i++) {
                if (str.charAt(i) != str.charAt(n - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    
        public static void printPalindromeIndices(String str) {
            for (int i = 0; i < str.length(); i++) {
                if (isPalindrome(str.substring(i))) {
                    System.out.println("Palindrome found starting at index " + i);
                }
            }
        }
    
        public static void main(String[] args) {
            String str = "racecar";
            System.out.println(isPalindrome(str));
            printPalindromeIndices(str);
        }
    }
    

