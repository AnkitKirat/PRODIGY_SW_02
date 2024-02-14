package PRODIGY_SW_02;

import java.util.*;
class Guess{
  int rn,n,gu=1;
  public Guess(){
    Random r=new Random();
    rn=r.nextInt(1001);   
      }
   
  public void take_ip(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No. :- ");
    n=sc.nextInt();
  }

  public void no_of_guess(){
    ++gu;
  }

  public void iscorrect(int a,int b){
    
    while(a!=b){
      
      if(a>b){
        
        System.out.println("You Entered Greater no.");
      }
      else{
        System.out.println("You Entered Smaller no.");
      }
      no_of_guess();
      take_ip();
      a=n;
   
      }
      System.out.println("Congratulation You guessed the Number");
      
    }
  
  }
 class SW_TASK_02
 {
   public static void main(String args[])
   { 
     Guess guess=new Guess();
     System.out.println("The Generated Number Is Between 0-1000 \nSo Try TO Guess Number, Best Of Luck..!");
     
     guess.take_ip();
     int n=guess.n;
     int rn=guess.rn;
     
     guess.iscorrect(n,rn);
     System.out.printf("You Taken %d Chance to Guess Answer ",guess.gu);
}
}