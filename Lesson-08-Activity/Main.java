class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}
double FtoC(double F){
double c = (F - 32) * 5.0/9;
return c;
}
double sphereVolume(double r){
double v = 4/3.0 * Math.PI * Math.pow(r, 3); 
return v; 
}
double conevolume(double r, double h){
  double v = 1/3.0 * Math.PI * r * r * h; 
  return v; 
}
double distance(double x1, double x2, double y2 )

  void init(){
  print("Hello");
  double c = FtoC(73.5); 
  System.out.println(c);
  double v = sphereVolume(6.0); 
  System.out.println(v); 
  }
void print(String msg){
System.out.println(msg);
}

}