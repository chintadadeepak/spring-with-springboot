package com.deepak.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    @Qualifier("laptop")
    private Computer computer;
    public void code() {
        computer.compile();
    }

}
