package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.HibernateHelper;
import view.MainWindow;



public class Controller {
	MainWindow view;
	HibernateHelper model;
	
	
	Controller() {
		
		MainWindow view = new MainWindow();
		HibernateHelper model = new HibernateHelper();	

		launchMainWindow(view);		
		
		loadCategories(view);	
		
		actionSave(view, model);
		
	}


	private void launchMainWindow(MainWindow view) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private void actionSave(MainWindow view, HibernateHelper model) {
		view.getBtnSaveQuestion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sQuestion;
				String sCategory;
				byte id;
				
				sQuestion = view.gettQuestion().getText();
				sCategory = (String) view.getCategory().getSelectedItem();
				id = model.getLastQuestion().getIdQuestion();
				id++;
				
				System.out.println("save question:"+id+ " "+sQuestion+ " "+sCategory);
				model.addQuestion(id,sQuestion,sCategory,null);				
			
			}
		});
	}


	private void loadCategories(MainWindow view) {
		view.getCategory().addItem("Matemáticas");
		view.getCategory().addItem("Historia");
	}



}
