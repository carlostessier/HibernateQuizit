package main;




import model.Answer;
import model.HibernateHelper;
import model.Question;


public class Main {

	public static void main(String[] args) {
		HibernateHelper hibernateHelper = new HibernateHelper();
    	//System.out.println("Inserto una pregunta nueva");		
		//hibernateHelper.addQuestion((byte)4,"�Cu�nto son 2 + 2?","Matem�ticas");
		
		//Question question = hibernateHelper.getQuestion((byte)1);
		//System.out.println(question);		
		
		for(Question q: hibernateHelper.getQuestion())
			System.out.println(q);
	}

}
