import comportement.*;

class Test{

  public static void main(String[] args) {
    Personnage pers = new Guerrier();
    pers.soigner();     
    pers.setSoin(new Operation());
    pers.soigner();
    
    //Utilisation d'une classe anonyme
    pers.setSoin(new Soin() {
		public void soigne() {
			System.out.println("Je soigne avec une classe anonyme ! ");
		}

		@Override
		public void soigner() {
			// TODO Auto-generated method stub
			
		}    	
    });
    
    pers.soigner();
  }
}