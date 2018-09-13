package test;

import java.util.UUID;

public class TestUUID {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString(); 
		//去掉“-”符号 
		String uid = uuid.replaceAll("-", "");
		System.out.println(uid);
		
		}
	}

