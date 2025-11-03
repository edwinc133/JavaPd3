class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(spaces(10)+"DONE");

    print("harmonic: " +harmonic(5));

    
    
  }
  String spaces(int N){
    String result = ""; 
    for(int x=0; x<N; x++){
      result+=" ";
    }
    return result;
  }
  double harmonic(int N){
    double sum = 0;
    for(int x=1; x<=N; x++){
      sum += 1./x;
    }
    return sum;
  }

    
  }
  