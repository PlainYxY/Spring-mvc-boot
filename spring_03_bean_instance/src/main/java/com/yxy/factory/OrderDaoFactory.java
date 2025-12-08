package com.yxy.factory;

import com.yxy.dao.OrderDao;
import com.yxy.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("OrderDaoFactory");
        return new OrderDaoImpl();
    }
}
