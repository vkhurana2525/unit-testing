package com.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Test(expected = RuntimeException.class)
    public void testSendEmail_withOneArguments() {
        EmailService emailServiceMock = mock(EmailService.class);
        doThrow(new RuntimeException("Exception")).
                when(emailServiceMock).sendEmail(any(OrderService.class));
        emailServiceMock.sendEmail(new OrderService());
    }



    @Test
    public void testSendEmail_withTwoArguments()
    {
        EmailService emailServiceMock = mock(EmailService.class);
        when(emailServiceMock.sendEmail(any(com.demo.domain.Order.class), anyString())).thenReturn(true);
        assertTrue(emailServiceMock.sendEmail(new OrderService(), "Order placed"));
    }

}