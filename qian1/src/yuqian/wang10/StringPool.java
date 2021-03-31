package yuqian.wang10;

public class StringPool {
    public static void main(String[] args) {
        String str1=new String("abc");
        String str2="abc";
        char[] charArray={'a','b','c'};
        String str3=new String(charArray);
        String str4="abc";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str2==str4);
    }
}
