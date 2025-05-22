package com.learn.access;

public class FacebookMain {
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        fb.setUsername("FIIT");
        fb.setAge(5);
        fb.setContactNumber(12345L);
        fb.setEmail("test@gmail.com");
        fb.setMaritalStatus("Single");


        System.out.println("Name: "+fb.getUsername());
        System.out.println("Age: "+fb.getAge());
        System.out.println("Contact: "+fb.getContactNumber());
        System.out.println("Email: "+fb.getEmail());
        System.out.println("MaritalStatus: "+fb.getMaritalStatus());
    }
}
