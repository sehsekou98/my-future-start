//method overloading
class calcu
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 +n3;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

public class cal {
    public static void main(String a[])
    {
        //creating a object and calling it
        calcu obj =new calcu();
        int r1 = obj.add(4, 6, 11);
        System.out.println(r1);
    }
    
}
