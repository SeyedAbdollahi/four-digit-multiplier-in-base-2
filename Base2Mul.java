import java.util.Scanner;

 //Compiler version JDK 1.8


 public class Base2Mul
 { 
    private Scanner keyboard = new Scanner(System.in);
    private int numberOne = 0;
    private int numberTwo = 0;
	private boolean runApp = true;
    
 public static void main(String args[]){ 
        Base2Mul base2Mul = new Base2Mul();
		do{
			base2Mul.getNumberOne();
		    base2Mul.getNumberTwo();
			base2Mul.computeMul();
		}while(base2Mul.runApp);
     }
     
     private void getNumberOne(){
		  System.out.println("___________________________# Base 2 Multiplication #___________________________");
		 boolean gettingNumberOne = true;
		do{
			System.out.print("enter binary number One:");
            String numberOneString = keyboard.nextLine();
            try{
			if(numberOneString.equals("exit")){
				runApp = false;
				gettingNumberOne = false;
				System.out.print(">>> App Closed <<<");
				return;
			}
            numberOne = Integer.parseInt(numberOneString , 2);
			if(numberOneString.length() > 4){
				System.out.println("Max Digit should be 4");
			}
			else{
				gettingNumberOne = false;
			}
            }catch(Exception e){
            System.out.println("number One is not true , enter binary number");
            }
		}while(gettingNumberOne);
      }
     
     private void getNumberTwo(){
		 if(runApp){
			 boolean gettingNumberTwo = true;
		 do{
			 System.out.print("enter binary number Two:");
             String numberTwoString = keyboard.nextLine();
              try{
				  if(numberTwoString.equals("exit")){
				runApp = false;
				gettingNumberTwo = false;
				System.out.print(">>> App Closed <<<");
				return;
			}
            numberTwo = Integer.parseInt(numberTwoString , 2);
			if(numberTwoString.length() > 4){
				System.out.println("Max Digit should be 4");
			}
			else{
			gettingNumberTwo = false;
			}
            }catch(Exception e){
            System.out.println("numberTwo is not true , enter binary number");
            }
		    }while(gettingNumberTwo);
		 }
     }
     
     private void computeMul(){
		 if(runApp){
			 System.out.println("Answer is: " + Integer.parseInt(Integer.toBinaryString(numberOne * numberTwo)));
		 }
     }
}