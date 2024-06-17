public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");    // () StringBuilder ko chahe to initialize krr skte hai nhi to null bhi rkh sakte hai

        for(char ch='a';ch<='z';ch++){
            sb.append(ch);    // append function hum string of stringBuilder ke peche value add karne ke liye use karte hai... helloa,helloab,helloabc...etc lekin output mai sub print nhi honge jo final output ho vhi print hoga...
        }
        System.out.println(sb);
    }
}
