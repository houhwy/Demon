package yuqian.wang10;

public class StringEqual {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));       //不推荐写法   如果引用类型为null 会报错出现空指针异常
        System.out.println("Hello".equals(str1));       //推荐写法                     这种会返回 false

    }
}
