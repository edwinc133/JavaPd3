class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}
	double FtoC(double F){
	double c = (F-32) * 9/5.0;
	return c;
}
double sphereVolume(double r){
	double v = 4/3.0 * Math.PI * Math.pow(r, 3); 
	return v; 
}

  void init(){
  print("Hello");
  }
void print(String msg){
System.out.println(msg);
}

}