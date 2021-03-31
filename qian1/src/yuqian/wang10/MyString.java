package yuqian.wang10;

public class MyString {
    public static void main(String[] args) {
        String str1=new String();       //小括号留空说明字符串啥也没有
        System.out.println(str1);
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println(str2);        //ABC
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println(str3);        //abc




    }
}
