class numbers {
    public static void main(String[] args)
    {
        int i;

        for (i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 != 0)
          { 

           System.out.println("fizz"); 
               
        } else if ( i % 5 == 0 && i % 3 != 0)
        {
           System.out.println("buzz");

        } else if (i % 3 == 0 && i % 5 == 0)
        {
            System.out.println("fizzbuzz");

        } else if ( i == 1)
        {
            System.out.println(i);
        } else 
        
            System.out.println(i);
        
        
        
    }
}
