class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    String msg = Input.readFile("Original.txt");
   

    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.
 String encode(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x+=3){
      ch=txt.charAt(x);
      ascii=(int)ch;
    }
  }
  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.
  String decode(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x+=3){
      ch=txt.charAt(x);
      ascii=(int)ch;
    }
  } 
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}