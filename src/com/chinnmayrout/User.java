package com.chinnmayrout;

public class User {
    //Fields (attributes)
    public String name;

    //Constructor
    public User(String name) {
        this.name = name;
        // set the name field of the object to value of name parameter
        // this is the reference to the current object
    }

    //Methods
    public void sayHello() {
        // sout for System.out.println
        System.out.println(" - Hi, my name is: " + name);
        // We don't have a this keyword, so we can refernece to the object directluy

    }

}
