package cn.javaee.ch2.d;

import java.util.Observable;
import java.util.Observer;

/**
 * JD，观察者
 * @author lwk
 * @date 2017/11/6 12:34
 */
public class JDObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String) arg;
        System.out.printf("发送新产品【%s】同步到JD\n",newProduct);
    }
}
