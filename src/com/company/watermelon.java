package com.company;

public class watermelon
{
   public Boolean  weight_checker (int entered_weight)throws IllegalArgumentException{

       if(entered_weight<=1|| entered_weight>=100)
           throw new IllegalArgumentException(" this weight is not accepted ");
       if(entered_weight>2)
       {
           if(entered_weight%2==0){
               System.out.println("YES");
               return true;
           }

           else {
               System.out.println("NO");
               return false;

           }
       }
       else {
           System.out.println("NO");
           return false;
       }
   }
}
