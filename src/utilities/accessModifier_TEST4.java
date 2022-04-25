package utilities;

import day40_finalKeyword.protectedAccessModifier;

public class accessModifier_TEST4 extends protectedAccessModifier  {

    public static void main(String[] args) {

        System.out.println(protectedAccessModifier.name);// not vissible b/c default is vissible only inside same class and package
        System.out.println(protectedAccessModifier.name1);// vissible b/c protected is vissible in same class, package and any other package subclass
        accessModifier_TEST4.method1();// default method is not vissible outside pkag
        accessModifier_TEST4.method2();// protected is visible outside pkg



    }



}
