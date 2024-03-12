
package bayabos_rpg;

class Paladin extends Character {
    private boolean hasResurrected;
    
    public Paladin (){
        super(150, 15, 20);
        this.hasResurrected = false;        
    }
    public void resurrect(){
        if (hasResurrected){
        } else {
            hasResurrected = true;
            setHealth(150);
            System.out.println("Paladin has already been resurrected once. ");
        }
       }
    }