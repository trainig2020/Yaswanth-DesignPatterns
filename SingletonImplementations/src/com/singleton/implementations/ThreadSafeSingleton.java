package com.singleton.implementations;

public class ThreadSafeSingleton {
	
	void output() {
		System.out.println("Thread safe output from class");
	}

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
}
