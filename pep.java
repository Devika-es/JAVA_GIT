//byte-1
//short-2
//int-4
//long-8
//float-4
//double-8
//boolean -1
//char-2

//i8-1
//i16-2
//i32-4
//i64-8

//Signed vs Unsigned Types in Java
//two types of signed integers-int and long ,size of long is twice as that of int
//there is no unsigned integer in java

//Range of values which can be stored in a variable of a type
//Suppose the size of the type is N bits,total number of values that can be stored in a variable is 2^N-1

//Unsigned integer
//00000000-> 8 times(lowest)=value is 0
//11111111-> 8 times(highest)=>2^8-1 -> 255

//Signed integer
// for 8 bits, there are 256 positions 
// 256/2=128
// 128<0>127
//the range is -128 to 127

//we had 8 bits
//-(2^(N-1)) to 2^(N-1)-1
//-2^(8-1) to 2^(8-1)-1


// class Main {
//     public static void main(String[] args) {
//         byte a=0;
//         byte start=0;
//         do{
//             System.out.println(a);
//             a++;
//         }while(a!=start);
//     }
// }

//Unicode
//represent text in computers->to use characters from different languages and scripts
//utf-16 can have values from 2^0 to 2^16-1 which is 65,536

// class Main {
//     public static void main(String[] args) {
//         char ch=0;
//         System.out.println((int)Character.MAX_VALUE);
//         for(;ch<=Short.MAX_VALUE;ch++)
//         {
//             System.out.printf("%d=%c\n",(int)ch,ch);
//         }
//     }
// }


//Packages
//External packages are in the format :'com.companyname.packagename'
//This is opposite to the website domain convention
//For eg if your website is 'oci.oracle.com',then your package name would be 'com.oracle.oci'

//Internal Packages are in this format: 'java.<package>'
//For eg 'java.util','java.lang','java.util.concurrent.atomic'.

//packages are like folders on a file system

// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        System.out.printf("You entered: %s\n",s);
//        sc.close();
//     }
// }

//Primitive-lower case
//Non primitive datatypes are represented by class in uppercase

//Methods to read different data types
// sc.next()->character
// sc.nextInt()->integer
// sc.nextLong()->Long
// sc.nextLine()->string
// sc.nextByte()->byte


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        byte x =sc.nextByte();
//        System.out.printf("You entered: %s\n",s);
//        System.out.printf("You entered: %d\n",x);
//        sc.close();
//     }
// }



// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        //read an int
//        int n =sc.nextInt();
//        sc.nextLine();
//        //read a string
//        String s=sc.nextLine();
//        System.out.printf("Number is %d String is %s\n",n,s);
//        sc.close();
//     }
// }


// class Main {
//     public static void main(String[] args) {
//       int k =10;
//       int [] arr=new int[k];
//       arr[0]=3;
//       System.out.println(arr[0]);
//     }
// }

//array is stored in heap if exact size is not known else in stack
//size of array=>arr.length
//

//Autotype inferencing it can take the type of data in var instead of using scanner

// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//       System.out.print("Please enter the size of arr: ");    
//       var sc=new Scanner(System.in);    
//       var k =sc.nextInt();
//       int [] arr=new int[k];
//       arr[0]=3;
//       System.out.println(arr[0]);
//       System.out.println(arr.length);
//     }
// }

//Serialization is a process that converts an object's state into a format that can be stored or transmitted. 
//The reverse process of recreating the object from the stored data is called deserialization.


//The Arrays.toString() method belongs to the Arrays class in Java. 
//It converts an array into its string representation consisting of a list of the array’s elements. In the case of an Object Array, if the array contains other arrays as elements, their string representation shows memory addresses instead of contents.

// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//       System.out.print("Please enter the size of arr: ");    
//       var sc=new Scanner(System.in);    
//       var k =sc.nextInt();
//       int [] arr=new int[k];
//       for(var i=1;i<=k;i++)
//       {
//           arr[i-1]=i;
//       }
//       for(var i : arr)
//       {
//           System.out.print(i+" ");
//       }
      
//     }
// }

//Wrapper classes
// A Wrapper class in Java is one whose object wraps or contains primitive data types. 
//When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. 
//In other words, we can wrap a primitive value into a wrapper class object. 
// Need of Wrapper Classes

// They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
// The classes in java.util package handle only objects and hence wrapper classes help in this case.
// Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
// An object is needed to support synchronization in multithreading.

// Advantages of Wrapper Classes
// Collections allow only object data.
// On object data we can call multiple methods compareTo(), equals(), toString()
// The cloning process only works on objects
// Object data allows null values.
// Serialization allows only object data.

//1. Autoboxing
//The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing.
// For example – conversion of int to Integer, long to Long, double to Double, etc. 

// class Main {
//     public static void main(String[] args) {
//       int n=10;
//       Integer.toString(n);
//       System.out.println(n+ " Hello");
      
//     }
// }


//Integer.valueOf() is a method in Java that converts a given input (usually a String or int) into an Integer object. 
//It is commonly used when you need an Integer object instead of a primitive int, such as when working with collections like ArrayList that require objects instead of primitives.

//Arraylists->Dynamic in size


//Compilation and running process
//computer needs assembly code(low level language) to be run on cpu
//Different levels of abstraction are also built with the pass of time
//newer languages with higher levels of abstraction came to the market
//Go lang is  beginner friendly syntax,higher traction in the backend
//Rust is very efficient,not beginner friendly .Memory safe language compared to C/C++
//Swift is used by MacOS,elegant,used to write backend code
//Kotlin syntax is similar to Swift

//Compiled languages
//a code in C/C++/Golang/Rust
//Compiler will take code as input and output a binary
//This binary can only be executed on the same OS and same CPU architecture
//OS-Mac,Windows,BSD,Android,IOS,Arduino
//CPU-Raspberry Pi,Intel,AMD,ARM,ARM64,AARCH
//We cannot run a binary meant to be run on (CPU,C1,OS O1) on a different machine(C2,O2)

//Interpreted languages
//a code
//Interpreted languages requires 2 steps
//1st source code(.java)->byte code(.class)  done by compiler
//2nd byte code->machine code   done by interpreter
//Just in Time-  byte code -> machine code while a java program is running


//Java is neither completely compiler or interpreted its a mix of both
//Byte code is interpreted by JVM (JIT compiler)->machine code
//compiled /half-compiled languages are faster than interpreted languages because compilers can stack in function calls

//java-multi paradigm language
//Functional programming-use of functions
//eg:-Haskell,lisp,Clojure,Scala

//Procedural programming
//eg:-C,C++,Java,Ruby,RUST,GO,PHP,Javascript

//Languages run on JVM
//Kotlin,Scala,Clojure(Functional)

//SDK-Software development kit
//a set of API s and libraries to develop software
//collection of classes,interfaces,methods that are used by the application


//API-Application Programming interface
//During the programming process,how will you use a 3rd party program to do something
//Types of API
//RESTful APIs
//RPC APIs

//3rd party package(dependency) consumption registries
//web developers
//node.js (npm),deno.js (JSR),bun.js

//rust developers
//cargo

//Python->pypi.org, conda-forge etc
//Go: directly downloaded from some git server.You can specify the git commit hash/git tag

//Dependency management
//Some tools provided by the programming language is responsible for dependency management (npm,pnpm,yarn,cargo,pip)
//Packages->downloaded either in local source code(Nodejs)/ global system(python/golang)

//Java uses 'JAR'->Java Archive files for software distribution.JAR files should contain .class files

//Shared library is compiled code which can be used in particular cpu and os architecture
//Statically linked->library is included with the executed file,so its not loaded at runtime
//Dynamically linked-> library is seperate from executable file,so its loaded at runtime.


//Configuration files for dependency management
//node/bun: package-lock.json, python: requirements.txt, rust: cargo.toml, java: pom.xml

//Dependency tree is computed by parsing the configuration files,Computation is done by greedy mode,first level dependencies are added check for each dependency if its added to the list
//if yes skip,no->add to the list

//dependency resolver will fail to resolve to a particular version of a package if there is a disjoint range of versions required for that package

//lockfiles contains resolved dependencies of direct an transitive dependencies,download location,hash  values of downloaded files

//python doesnt officially provide lockfile management systems