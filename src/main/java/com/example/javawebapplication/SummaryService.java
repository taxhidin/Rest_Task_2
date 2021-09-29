package com.example.javawebapplication;



public class SummaryService {

    User user = new User(1,2,3,4,5,6);
    


    public int result (){
        int sum_end = user.getFirst()+user.getSecond()+user.getThird()+user.getFourth()+user.getFive()+user.getSix();
        return sum_end;
    }


}
