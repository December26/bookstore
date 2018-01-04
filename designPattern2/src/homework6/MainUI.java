package homework6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainUI {
	private Controller controller = new Controller();
	
	public MainUI() {
		JFrame frame = new JFrame("一个贩卖各类书籍的电子商务网站的购物车系统");
		frame.setLayout(null);
		frame.setBounds(100, 100, 1000, 800);
		
		JButton addBookButton = new JButton("图书增加");
		JButton strategiesButton = new JButton("策略维护");
		JButton buyButton = new JButton("购买图书");
		
		addBookButton.setBounds(120, 120, 150, 100);
		strategiesButton.setBounds(120, 320, 150, 100);
		buyButton.setBounds(120, 520, 150, 100);
		
		frame.add(addBookButton);
		frame.add(strategiesButton);
		frame.add(buyButton);
		
		addBookButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddBookUI(controller);
				
			}
		});
		
		strategiesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StrategiesUI(controller);
				
			}
		});
		
		buyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new BuyUI(controller);
				
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
