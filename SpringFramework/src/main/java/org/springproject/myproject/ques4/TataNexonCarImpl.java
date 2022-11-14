package org.springproject.myproject.ques4;

import org.springframework.stereotype.Component;

@Component
public class TataNexonCarImpl implements Car {
    @Override
    public void carName() {
        System.out.println("Tata Nexon");
    }
}
