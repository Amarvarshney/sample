// // // class Test { 
// // //  protected int x, y; 
// // // } 
 
// // // class Main { 
// // //  public static void main(String args[]) { 
// // //  Test t = new Test(); 
// // //  System.out.println(t.x + " " + t.y); 
// // //  } 
// // // } 
// // // class Test 
// // // { 
// // //  int x = 10; 
// // //  public static void main(String[] args) 
// // //  { 
// // //  Test t = new Test(); 
// // //  System.out.println(t.x); 
// // //  } 
// // // }
// // class Gfg 
// // { 
// //  Gfg() 
// //  { 
// //  System.out.println("ABC"); 
// //  } 
 
// //  static Gfg a = new Gfg(); 
// //  public static void main(String args[]) 
// //  { 
// //  Gfg b; 
// //  b = new Gfg(); 
// //  } 
// // }  
//  class VariableMethodOutput { 
//  int x = 10; 
//  void modify(int value) { 
//  x = value; 
//  } 
//  void display() { 
//  System.out.println("Value of x: " + x); 
//  } 
//  public static void main(String[] args) { 
//  VariableMethodOutput obj1 = new VariableMethodOutput(); 
//  VariableMethodOutput obj2 = obj1; 
//  obj1.modify(20); 
//  obj1.display(); 
//  obj2.display(); 
//  obj2.modify(30); 
//  obj1.display(); 
//  obj2.display(); 
//  } 
// }
