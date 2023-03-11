class fizz {
    public static void main(String[] args)
    {
        int i;

        for (i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 != 0)
          { 

           System.out.println("Fizz"); 
               
        } else if ( i % 5 == 0 && i % 3 != 0)
        {
           System.out.println("Buzz");

        } else if (i % 3 == 0 && i % 5 == 0)
        {
            System.out.println("Fizz Buzz");

        } else if ( i == 1)
        {
            System.out.println(i);
        } else 
        
            System.out.println(i);
        
        
        
    }
}

}