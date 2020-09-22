package com.singleton.implementations;

public class SingletonMain {
	public static void main(String[] args) {
		// Eager Initialization
		EagerInitializedSingleton e1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton e2 = EagerInitializedSingleton.getInstance();

		e1.setId(1);
		e1.setName("sai");
		// emp2.setId(19);
		System.out.println(e2.getId() + e2.getName());

		// Lazy Initialization
		LazyInitializedSingleton l1 = LazyInitializedSingleton.getInstance();
		l1.setId(20);
		l1.setName("Ece");
		System.out.println(l1.getId() + l1.getName());

		// Static Block
		StaticEmpImpl empl = StaticEmpImpl.getInstance();
		empl.setEid(19);
		empl.setEname("satya");
		System.out.println(empl.getEid() + empl.getEname());
		
		ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
		t1.output();
		System.out.println("From Main");
		ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
		t2.output();
		
	}
}
