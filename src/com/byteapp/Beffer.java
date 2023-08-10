package com.byteapp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Beffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			FileOutputStream fstream= new FileOutputStream("bufferdata");
			BufferedOutputStream bufferedout=new BufferedOutputStream(fstream);
			
			bufferedout.write("Developer name: Janhavi,Bug no.: 1,Bug Description: Ioexception".getBytes());
		
			bufferedout.flush();
			bufferedout.close();
			
			FileInputStream finstream =new FileInputStream("bufferdata");
			BufferedInputStream bufferin =new BufferedInputStream(finstream);
			byte[] bt=new byte[bufferin.available()];
			bufferin.read(bt);
			System.out.println(new String(bt));
			
			
			
			
			
			
			
		}
		
		
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	}


