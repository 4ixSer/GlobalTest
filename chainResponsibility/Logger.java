package com.chainResponsibility;

/**
 * Created by qny4i on 06.03.2017.
 */
public abstract class Logger {
     public int priority;

    public Logger(int priority) {
        this.priority = priority;
    }
    Logger next = null;
    public void setNext(Logger next){  this.next=next;}
    public void writeMessage(String massage, int level){
        if(level<=priority)   {
            write(massage);
        }
        if(next!=null){
            next.writeMessage(massage,level);
        }
    }

    public abstract void write(String massage);
}
