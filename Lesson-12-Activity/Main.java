class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
  String creditCardType(String creditCardNumber){
    if (creditCardNumber.substring(0,1).equals("4")){
      return "Visa";
    }
      else if(creditCardNumber.substring(0,2).equals("34") ||
      creditCardNumber.substring(0,2).equals("37"){
      return "America Express";
      }
      else if(creditCardNumber.substring(0,2).equals("36")){
      return "DinerClub";
      }
      else if(creditCardNumber.substring(0,2).equals("51") ||
      creditCardNumber.substring(0,2).equals("55"){
      return "MasterCard";
      }
      else if(creditCardNumber.substring(0,4).equals("6011") ||
      creditCardNumber.substring(0,2).equals("65"){
      return "Discovery";
      }
      else { 
      return "Unknown";
      }
    }
    String nylocate(String zipCode){
      if (zipCode.substring(0,3).equals("100") || 
      zipCode.substringt(0,3).equals("101") ||
      zipCode.substringt(0,3).equals("102")){
        return "Manhattan";
      }
      
    }
    }
  }



}
  
  
}