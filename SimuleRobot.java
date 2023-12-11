public class SimuleRobot{
	public static void main(String[] args){
	    Robot robot1=new Robot("Busquito 0.5");
	    robot1.sePresenter();
	    robot1.accelerer();
	    robot1.allerALest();
	    robot1.stop();
	    robot1.sePresenter();
	    robot1.setNiveau(5);
	    do{
	        robot1.sePromener();
	        robot1.sePresenter();
	    }while(robot1.getNiveau() != 0);
	}
}
