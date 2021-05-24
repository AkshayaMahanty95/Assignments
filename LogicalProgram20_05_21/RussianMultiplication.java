package com.ojas.ak;

public class RussianMultiplication {
	public static void multiplication( int num1, int num2 )
    {
        int product = 0;
        if( num1 %2 != 0 )
            product = product+num2;
        while( num1 != 1)
        {
            num1 = num1/2;
            num2 = num2*2;
            if(num1 %2 != 0)
                product = product+num2;
        }
        System.out.println("The product is: "+product);
    }
    public static void main(String[] args)
    {
        int num1 = 11, num2 = 2;
        multiplication(num1, num2);


}

}

