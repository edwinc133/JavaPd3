class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Franklin", "Kylian", "Bruno", "Alexander"}; 

    double[] tempC = {25, 37, 10, 34, 0, 5};

    double[] tempF = convert(tempC);
    for (int i=0; i<tempF.length; i++){
      print(tempF[i]);
  }

  }

  double[] convert(double[] c){
    double[] tmp = new double[c.length];
    for (int i=0; i<c.length; i++){
      tmp[i] = cToF(c[i]);
    }
    return tmp; 
  }

  
  
  double cToF(double c){
        return c*9/5+32;
  }
  

