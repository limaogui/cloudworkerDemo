package cn.cloudworker.synchronize;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-05
 * Time: 11:30
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj; //obj为委托类对象;
    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("before");
        Object result = method.invoke(obj, args);
        System.out.println("after");
        return result;
    }
}
