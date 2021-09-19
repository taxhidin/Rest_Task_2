package com.example.javawebapplication;

import java.util.ArrayList;
import java.util.List;

public class SummaryService {

    User user = new User();


    public int result (){
        int sum_end = user.getFirst()+user.getSecond()+user.getThird()+user.getFourth()+user.getFive()+user.getSix();
        return sum_end;
    }


}
