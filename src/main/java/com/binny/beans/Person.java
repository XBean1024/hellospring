package com.binny.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * describe:
 *
 * @author 596928539@qq.com
 * @date 2019/03/28
 */
public class Person {
    private String name;
    private int age;
    private Logger log = LoggerFactory.getLogger("AccountHelper");

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hello() {
        log.info("hello" + name);
    }

}
