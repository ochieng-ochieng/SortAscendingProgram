import  java.util.Scanner ;

public class  Ascending
{
	  private  int   a,b,c,temp;

      private  int  counter = 10;
	  
	  
	  public  void ascendFunc()
	  {
		 Scanner  input  = new  Scanner(System.in);
   
      int  items[] = new  int[counter]; 

       System.out.println("Enter 10  random integers");	

       for(c = 0; c < counter ; c++)
          items[c] = input.nextInt();		   
		
		for(a = 1; a < counter; a++)
		{
			for(b = counter - 1; b >= a ; b--)
			{
				if(items[b-1] > items[b])
				{
					temp = items[b-1];
					items[b-1] = items[b];
					items[b] = temp;
				}
			}
		}
			
		System.out.println("ASCENDING SORTED LIST");
		        for(c = 0; c < counter ; c++)
                  System.out.println(items[c]);
		
		 
	  }
	  
	 
}