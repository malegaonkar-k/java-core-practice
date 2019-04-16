package org.kc.threds;

public class DemoPrint {

	public   static void print(){
		int number=0,row=3;
		for(int j=row;j>0;j--){
			number++;
			for(int i=1;i<=j;i++){		
				System.out.print("*");		
			}
			System.out.println();
		//System.out.println(number);
			
			
		}
	}
	public static void main(String[] vars){
		DemoPrint.print();
		DemoPrint.print1();
	}
	public   static void print1(){
		int number=0,row=3;
		for(int j=row;j>0;j--){
			number++;
			for(int i=1;i<=row;i++){
				
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print(number);
					number++;
				}
			}
			  
			//System.out.print("*");
			System.out.println();
		//System.out.println(number);
		}
	}
//sys
}