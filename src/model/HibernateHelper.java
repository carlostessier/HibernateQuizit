package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateHelper {
	
	private SessionFactory sesion;
	
	public HibernateHelper(){
		
		 sesion = SessionFactoryUtil.getSessionFactory();
	}
	
	public List<Question> getQuestion(){
		List<Question> questions;
		Session session = sesion.openSession();

		Query query = session.createQuery("from Question");
		questions = query.list();
		session.close();
		
		return questions;

	}
	
	public Question getQuestion(byte id){
		Session session = sesion.openSession();
		
		Question question = (Question) session.get(Question.class, (byte)id);		
		
		if (question== null)
			return new Question ();
		
		Set<Answer> answers = new HashSet<Answer>(0);
		for(Answer a: question.getAnswers())
			answers.add(a);
		
		session.close();

		question.setAnswers(answers);
		
		return question;
	}

	public void addQuestion(byte id, String text, String category){
				
		Question question = new Question(id,text,category,new HashSet<Answer>(0));		
		saveQuestion(question);
		
	}
	
	public void  deleteAnswer(byte id){
		Session session = sesion.openSession();
		Answer answer = (Answer) session.get(Answer.class, (byte)id);	
		if(answer!=null)
			session.delete(answer);		
		session.close();
		
	}
	
	public void  updateAnswer(Answer answer){
		Session session = sesion.openSession();
		Answer oldAnswer = (Answer) session.get(Answer.class, answer.getIdAnswer());	
		if(oldAnswer!=null)
			session.delete(answer);		
		session.close();
		
	}
	
	public void  saveQuestion(Question question){
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		session.save(question);		
		session.close();
		tx.commit();
		
	}
	
	public void addAnswer(Answer a, byte idQuestion ){
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
				
		session.save(a);		

		tx.commit();
		session.close();
	}
}
