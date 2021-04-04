package FunctionInterface.MyFunction;

//函数式接口只包含一个抽象方法，可以包含其他方法（默认、静态、私有）
@FunctionalInterface
public interface MyFunction {
    public abstract void method();
}
