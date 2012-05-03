package com;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
	public static void main(String[] args) {
		String url ="http://www.iteye.com/";
		try {
			URL requestURL  = new URL(url);
			InputStream inStream = requestURL.openStream();
			
			int c;
			StringBuffer sb = new StringBuffer();
			while ((c =inStream.read())!=-1) {
				sb.append((char)c);
			}
			String respones =new String (sb.toString().getBytes("iso-8859-1") , "utf-8");
			System.out.println(respones);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
