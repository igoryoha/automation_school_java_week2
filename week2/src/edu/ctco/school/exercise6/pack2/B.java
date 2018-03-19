package edu.ctco.school.exercise6.pack2;

import edu.ctco.school.exercise6.pack1.A;

/**
 * Why we can't instantiate class A, even it has public constructor ?
 *
 * How to fix it ?
 */
class B
{
    A a = new A();       //Compile Time Error
}