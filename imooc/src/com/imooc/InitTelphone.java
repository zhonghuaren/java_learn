package com.imooc;

public class InitTelphone {
	public static void main(String[] args) {
		Telphone phone = new Telphone();
		phone.sendMessage();
		phone.screen = 5.0f;
		phone.cpu = 1.4f;
		phone.mem = 2.0f;
		phone.sendMessage();
	}
}
