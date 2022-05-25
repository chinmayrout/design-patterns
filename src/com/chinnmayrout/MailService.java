package com.chinnmayrout;

public class MailService {

    public void sendEmail(){
        connect(1);
        authenticate();
        // Send email
        discconnect();
    }

    // We only want our end user of this class to use sendEmail and not care about connect, disconnect and authenticate.
    // connect, disconnect and authenticate have implementation details about how sendEmail works. The end user of this class doesn't care about it
    // All we care about is ability to send email. It makes it harder for end user of the class to work.
    //So we use abstraction principle. We make these methods private.


//    public void connect(){
//        System.out.println("Connect");
//    }
//
//    public void discconnect(){
//        System.out.println("Disconnect");
//    }
//
//    public void authenticate(){
//        System.out.println("Authenticate");
//    }

    private void connect(int timeout){
        System.out.println("Connect");
    }

    private void discconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }

    /**
     * If we introduce change in the main class, the whole code can be affected but
     * changes in the private methods won't affect main class.
     *
     * This is because main class cannot see the private methods and won't be affected by anything.
     * This is the benefit  of applying abstract principle. We can change the implementation detail without
     * affecting other classes in our application.
     */
}
