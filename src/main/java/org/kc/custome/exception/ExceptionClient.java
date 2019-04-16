package org.kc.custome.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionClient {
	
	ExceptionClient(){
		
	}
	public void getNames() throws ExceptionNameNotFound {
		throw new ExceptionNameNotFound("no name found");
	}

	public int getSomeData() throws ExceptionNameNotFound {
		throw new ExceptionNameNotFound("no name found");
		// return 1; unreachable statement
	}
	
	public void readFile(){
		//FileInputStream fis=new FileInputStream("file.text");
		
		FileInputStream fis = null;
		int data = 0;
		
		try{
			fis=new FileInputStream("file.text");			
			while(data != -1){
				System.out.println((char) data);
				data=fis.read();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(null != fis){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
		}
		
		//int data=fis.read();
		
		
		
		
				
	}
	
	public void readFileTryWithResource(){
		// FileInputStream fis=new FileInputStream("file.text");
		try(FileInputStream fis=new FileInputStream("file.text")){
			int data=fis.read();
			while(data != -1){
				System.out.println((char) data);
				data=fis.read();
			}		
		}catch( IOException e){
			
				
		}catch(Exception e){
			
		}
			
	}
	{
		throw new Exception();
		
	}

	public static void main(String[] args) throws Exception {
		
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler() );
		ExceptionClient e = new ExceptionClient();
		
		e.readFile();
		
		try {
			e.getNames();
		} catch (ExceptionNameNotFound e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}
		throw new FileNotFoundException();
	}

}
