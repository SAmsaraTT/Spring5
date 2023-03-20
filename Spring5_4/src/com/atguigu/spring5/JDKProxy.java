package com.atguigu.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Description
 * @Author hliu
 * @Date 2023/3/19 21:03
 * @Version 1.0
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类对象
        UserDao userDao = new UserDaoImpl();
        Object o = Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), new Class[]{UserDao.class}, new UserDaoProxy(userDao));

        UserDao uD = (UserDao) o;

        System.out.println("result: " + uD.add(1, 2));
    }
}

//创建代理对象代码

class UserDaoProxy implements InvocationHandler {
    //1.把被代理类对象传过来
    private Object object;
    public UserDaoProxy(Object object) {
        this.object = object;
    }


    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法的之前
        System.out.println("方法之前执行.... " + method.getName() + "：传递的参数 " + Arrays.toString(args));
        //被增强的方法
        Object invoke = method.invoke(object, args);
        //方法之后
        System.out.println("方法之后输出：" + object);
        return invoke;
    }
}
