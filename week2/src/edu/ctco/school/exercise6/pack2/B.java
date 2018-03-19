package edu.ctco.school.exercise6.pack2;



/**
 * Why we can't instantiate class A, even it has public constructor ? class no visibility - only same package?
 *
 * How to fix it ? move under same package - other options??? like in excersize 4
 */
class B
{
    A a = new A();       //Compile Time Error
}
