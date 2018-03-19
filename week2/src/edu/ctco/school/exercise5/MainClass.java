package edu.ctco.school.exercise5;

/**
 * Why we are able to see protected variable i from class X ? //same package visibility
 *
 * What will be printed out, then fixed ? printed x2 sout and method
 */
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();

        System.out.println(x.i);

        x.methodOfX();
    }
}