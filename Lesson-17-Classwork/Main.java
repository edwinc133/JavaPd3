class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    System.out.println(swapLetter("the seen", "e", "%"));


    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  String swapLetter(String s, String find, String replace){
    String bld = "";
    for (int x=0; x<=s.length()-1; x++){
      if(s.substring(x,x+1).equals(find))
      bld+=replace; 
      else
      bld+=s.substring(x,x+1);
    }
    return bld;
  }


}