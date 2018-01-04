package homework6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddBookUI {
	private Controller controller;
	private JFrame frame1;
	
	
	public AddBookUI(Controller con) {
		controller = con;
		frame1 = new JFrame("图书增加");
		frame1.setLayout(null);
	    frame1.setBounds(800, 120, 800, 600);
	    frame1.setVisible(true);
	    
	    JLabel label = new JLabel("ISBN:");
        label.setBounds(10,20,150,25);
        frame1.add(label);
        JTextField text = new JTextField(20);
        text.setBounds(150,20,165,25);
        frame1.add(text);
	    
        JLabel label1 = new JLabel("书名:");
        label1.setBounds(10,70,150,25);
        frame1.add(label1);
        JTextField text1 = new JTextField(20);
        text1.setBounds(150,70,165,25);
        frame1.add(text1);
        
        JLabel label2 = new JLabel("单价:");
        label2.setBounds(10,120,150,25);
        frame1.add(label2);
        JTextField text2 = new JTextField(20);
        text2.setBounds(150,120,165,25);
        frame1.add(text2);
        
        JLabel label3 = new JLabel("类型:");
        label3.setBounds(10,170,150,25);
        frame1.add(label3);
        JTextField text3 = new JTextField(20);
        text3.setBounds(150,170,165,25);
        frame1.add(text3);
        
        JButton btn = new JButton("完成");
        btn.setBounds(350, 100, 80, 30);
        frame1.add(btn);
        btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String isbn = text.getText();
				String title = text1.getText();
				double price = Double.valueOf(text2.getText());
				int type = Integer.valueOf(text3.getText());
				controller.addBook(isbn, price, title, type);
				frame1.dispose();
			}
		});
	}
	
	
}
