package cn.cloudworker.synchronize;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-05
 * Time: 11:26
 */
public interface InvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException;
}
