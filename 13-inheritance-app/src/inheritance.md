# Inheritance 

- derives properties of one object into another.
- Why? Reuse the code
- archive by using extends  
- private members are not inherited

class A     ->  super class
{

}

class B exends A    -> sub class
{
}


Types of inheritance  ->

1. `single`  ->   A   ->>   B    Class B extends A
2. `multilevel`  ->  A   ->>   B    -->  C    class C  extends B      class B extends  A 
3. `heirarcial`   ->     A    ->>  B    C
4. `multiple`  ->  A     B     ---->   C   // not allowed  class C extends A,B
5. `hybrid`  ->  