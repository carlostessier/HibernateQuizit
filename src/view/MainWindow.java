package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;



public class MainWindow extends JFrame {

	private static final String TEXT_BUTTON_SAVE = "Save Question";
	private JPanel contentPane;
	private JTextField tQuestion;
	private JTextField tAnswer1;
	private JTextField tAnswer2;
	private JTextField tAnswer3;
	private JTextField tAnswer4;
	
	

	private JButton btnSaveQuestion;
	private JComboBox category;
	
	
	
	public JComboBox getCategory() {
		return category;
	}



	public void setCategory(JComboBox category) {
		this.category = category;
	}



	public JButton getBtnSaveQuestion() {
		return btnSaveQuestion;
	}



	public void setBtnSaveQuestion(JButton btnSaveQuestion) {
		this.btnSaveQuestion = btnSaveQuestion;
	}


	

	public JTextField gettQuestion() {
		return tQuestion;
	}



	public void settQuestion(JTextField tQuestion) {
		this.tQuestion = tQuestion;
	}



	public JTextField gettAnswer1() {
		return tAnswer1;
	}



	public void settAnswer1(JTextField tAnswer1) {
		this.tAnswer1 = tAnswer1;
	}



	public JTextField gettAnswer2() {
		return tAnswer2;
	}



	public void settAnswer2(JTextField tAnswer2) {
		this.tAnswer2 = tAnswer2;
	}



	public JTextField gettAnswer3() {
		return tAnswer3;
	}



	public void settAnswer3(JTextField tAnswer3) {
		this.tAnswer3 = tAnswer3;
	}



	public JTextField gettAnswer4() {
		return tAnswer4;
	}



	public void settAnswer4(JTextField tAnswer4) {
		this.tAnswer4 = tAnswer4;
	}



	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tQuestion = new JTextField();
		tQuestion.setBounds(35, 31, 261, 42);
		contentPane.add(tQuestion);
		tQuestion.setColumns(10);
		
		tAnswer1 = new JTextField();
		tAnswer1.setBounds(37, 108, 86, 20);
		contentPane.add(tAnswer1);
		tAnswer1.setColumns(10);
		
		tAnswer2 = new JTextField();
		tAnswer2.setBounds(230, 108, 86, 20);
		contentPane.add(tAnswer2);
		tAnswer2.setColumns(10);
		
		tAnswer3 = new JTextField();
		tAnswer3.setBounds(37, 158, 86, 20);
		contentPane.add(tAnswer3);
		tAnswer3.setColumns(10);
		
		tAnswer4 = new JTextField();
		tAnswer4.setBounds(230, 158, 86, 20);
		contentPane.add(tAnswer4);
		tAnswer4.setColumns(10);
		
		btnSaveQuestion = new JButton(TEXT_BUTTON_SAVE);		
		
		btnSaveQuestion.setBounds(124, 211, 129, 23);
		contentPane.add(btnSaveQuestion);
		
		category = new JComboBox();
		category.setBounds(321, 31, 103, 20);
		contentPane.add(category);
		
		JCheckBox chCorrect1 = new JCheckBox("");
		chCorrect1.setBounds(129, 108, 37, 23);
		
		contentPane.add(chCorrect1);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(129, 157, 37, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(323, 107, 37, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(323, 155, 37, 23);
		contentPane.add(checkBox_2);
		
	
		
      
		
	}
}
