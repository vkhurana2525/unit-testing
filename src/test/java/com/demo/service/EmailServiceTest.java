package com.demo.service;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {



        Order o1=new Order(10,"Pizza",34.98);
        EmailService es=new EmailService();

        @Before



        @Test
        public void sendEmailTest(){
            try{
                es.sendEmail(o1);
            }
            catch(RuntimeException e){
                e.printStackTrace();

            }

        }

        @Test
         public void sendEmail_ReturnTrue(){
            assertTrue("Customer set notified",es.sendEmail(o,"Sending order object"));
        }


       }


}