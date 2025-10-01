
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
System.out.println("Enter value for x");
double x = Input.readDouble(); 
double y = Math.pow(x, 7); 
System.out.println(y); 

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/ 
System.out.println("Enter value for z");
double z = Input.readDouble(); 
double q = Math.pow(z, 3) + 5; 
System.out.println(q); 

  

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/ 
System.out.println("Enter value for t"); 
double t = Input.readDouble(); 
System.out.println("Enter value for r"); 
double r = Input.readDouble(); 
double s = Math.pow(t, 5) * Math.pow(r+2, 4);
System.out.println(s);
 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/ 
System.out.println("Enter value for A");
double A = Input.readDouble(); 
System.out.println("Enter value for B");
double B = Input.readDouble(); 
double C = Math.sqrt(A + B); 
System.out.println(C); 



/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
System.out.println("Enter value for x2");
double x2 = Input.readDouble();
System.out.println("Enter value for x1"); 
double x1 = Input.readDouble(); 
System.out.println("Enter value for y2"); 
double y2 = Input.readDouble(); 
System.out.println("Enter value for y1"); 
double y1 = Input.readDouble(); 
double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); 
System.out.println(d); 




/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/






/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}