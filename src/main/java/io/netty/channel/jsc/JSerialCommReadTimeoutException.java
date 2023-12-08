package io.netty.channel.jsc;
public class JSerialCommReadTimeoutException extends RuntimeException{
    public JSerialCommReadTimeoutException(){

    }
    public JSerialCommReadTimeoutException(String msg){
        super(msg);
    }
}