
import java.awt.Point;
public class Robot{
  String nom;
  private Point position;
  int vitesse;
  int niveau;
  public Robot(String MonRobot){
  nom=MonRobot;
  position=new Point (0,0);
  vitesse=0;
  }
  
  public Robot(String MonRobot ,int x, int y, int vitesse) {
    nom=MonRobot;
    position=new Point (x,y);
    this.vitesse=vitesse;
  }
  
  public void allerALest(){
      position.translate(vitesse,0);
  }
  public void allerALOuest(){
      position.translate(-vitesse,0);
  }
  public void allerAuNord(){
      position.translate(0,vitesse);
  }
  public void allerAuSudt(){
      position.translate(0,-vitesse);
  }
  public void accelerer(){
    if(vitesse<10){
      vitesse++;
    }
  }
  public void decelerer(){
  vitesse--;
    if(vitesse==0){
      stop();
    }
  }
  public void stop(){
  vitesse=0;
  }
  public Point getPosition(){
  return position;  
  }
  public void sePresenter(){
  System.out.println("nom: " + nom + " position " +position);
  }
  
  public void setNiveau(int n){
    int somme=this.niveau + n;
    if(somme>=0 && somme<=100){
    this.niveau += n;
    }else if(somme>100){
      this.niveau = 100;
    }
  }
  public int getNiveau(){
    return this.niveau;
  }
  public void sePromener(){
      int d=  4*(int)Math.random();
        if(vitesse==0){
        this.accelerer();
        }
    switch(d){
      case 0:
        this.allerALest();
        break;
      case 1:
        this.allerALOuest();
        break;
      case 2:
          this.allerAuNord();
        break;
      case 3:
          this.allerAuSudt();
        break;
        
      default:
      System.out.println("Valeur du deplacement invalide");
     }
     this.setNiveau(-vitesse);
  }
}
