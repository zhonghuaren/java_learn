package com.imooc;

public class Telphone {
	float screen;
	float cpu;
	float mem;
	void call() {
		System.out.println("Telphone can call");
	}
	void sendMessage() {
		System.out.println("Telphone can sendmessage");
		System.out.println("screen "+screen+" cpu "+cpu+" mem"+mem);
	}
}
