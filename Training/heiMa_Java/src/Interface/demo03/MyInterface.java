package Interface.demo03;

/*
* 该接口中有几个方法：4个
* methodA       来源于接口A
* methodB       来源于接口B
* methodCommon  同时来源于接口AB
* method        来源于自己
* */

public interface MyInterface extends MyInterfaceA, MyInterfaceB{

    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
