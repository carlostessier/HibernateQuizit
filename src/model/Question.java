package model;

// Generated 15-feb-2015 19:11:03 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Question generated by hbm2java
 */
public class Question implements java.io.Serializable {

	private byte idQuestion;
	private String text;
	private String category;
	private Set<Answer> answers = new HashSet<Answer>(0);

	public Question() {
	}

	public Question(byte idQuestion) {
		this.idQuestion = idQuestion;
	}

	public Question(byte idQuestion, String text, String category,
			Set<Answer> answers) {
		this.idQuestion = idQuestion;
		this.text = text;
		this.category = category;
		this.answers = answers;
	}

	public byte getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(byte idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set<Answer> getAnswers() {
		return this.answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", text=" + text
				+ ", category=" + category;
	}
	
	

}
