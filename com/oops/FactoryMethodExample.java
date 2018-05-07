package com.oops;

import java.util.List;

public class FactoryMethodExample {  
    public static void main(String[] args) {  
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:list) {  
            System.out.println(l);  
        }  
    }  
}  