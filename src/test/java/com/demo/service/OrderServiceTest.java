package com.demo.service;

public class OrderServiceTest
{
    Order o1=new Order(5,"Vk",178.7);
    OrderService os=new OrderService();

    @Test
    public void place_order_test(){
        orderService.placeOrder(o1);
        if(o.setCustomerNotified(true)){
            assertTrue("Customer not set notified but order placed",orderService.placeOrder(o,"order 1 object"));
        }

    }

    @Test
    public void place_order_test_boolean_true(){
        if(o.setCustomerNotified(true)){
            assertFalse("Customer not set notified but order placed",orderService.placeOrder(o,"order 2 object"));
        }
    }

    @Test
    public void place_order_test_boolean_false(){
        if(o.setCustomerNotified(false)){
            assertFalse("Customer not set notified",orderService.placeOrder(o,"Order 3 object"));
        }
    }
}