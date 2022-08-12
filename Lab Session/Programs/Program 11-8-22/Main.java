//Author - veda
/*Question -
Using inheritance concept with milk as parent class display other two product's rate and
 other essential details*/



package inheritancee;

 class Milk
 {
	 int rate,quantity,fatPercent;
	 
 }
 class aavin extends Milk
 {
    aavin(int r,int q,int F) 
    {
    	this.rate=r;
    	this.quantity=q;
    	this.fatPercent =F;
    	
    }
 }
  class hatsun extends Milk
  {
	 hatsun (int r, int q, int F)
	 {
		 this.rate=r;
		 this.quantity=q;
		 this.fatPercent=F;
	 }
  }
  public class Main
  {   public static void main(String args[])
	  {
	     aavin obj1=new aavin(20,1,10);
	     System.out.println(obj1.rate+"rate "+","+"quantity"+","+"fatPercent");
	     hatsun obj2=new hatsun(30,2,22);
			System.out.println(obj2.fatPercent+"fatPercent" +",rate"+obj2.rate);
			
	     
	  }
  }
	
	  
	 
	 
	 
 


