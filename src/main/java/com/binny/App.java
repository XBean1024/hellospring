package com.binny;

import com.binny.beans.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe:
 *
 * @author 596928539@qq.com
 * @date 2019/03/28
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("person.xml");
        Person person = (Person) ctx.getBean("person");
        person.hello();
    }
}
