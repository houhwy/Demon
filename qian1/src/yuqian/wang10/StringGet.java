package yuqian.wang10;

public class StringGet {
    public static void main(String[] args) {
       //获取字符串长度
        int lenth="febhdhfkwaiefnraisnvfonvsoiev".length();
        System.out.println(lenth);
        //拼接字符串
        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);   //Hello
        System.out.println(str2);   //World
        System.out.println(str3);   //HelloWorld
        //获取指定索引位置的单个字符
        char a="Hello".charAt(1);
        System.out.println(a);  //e
        //查找小字符串在大字符串中第一次出现的索引位置
        //如果根本没有就返回-1
        String original="HelloWorldHelloWorldHelloWorld";
        int num=original.indexOf("llo");
        System.out.println(num);    //2
        System.out.println(original.indexOf("abc"));    //-1
    }
}
