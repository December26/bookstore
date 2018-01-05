package homework6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainUI {
	private Controller controller = new Controller();
	
	public MainUI() {
		
		controller.addSimpleStrategy("Discount001", "绝对值优惠策略1", 2, 1);
		controller.addSimpleStrategy("Discount002", "百分比折扣策略1", 3, 7);
		controller.addSimpleStrategy("Discount003", "百分比折扣策略2", 1, 3);
		controller.addCompositeStrategy("Discount004", "组合策略", 4, 13);
		
		controller.addBook("978-7-302-2", 18, "UML与模式应用", 2);
		controller.addBook("978-7-312-3", 34, "Java与模式", 1);
		controller.addBook("968-6-302-1", 58, "HeadFirst 设计模式", 1);
		controller.addBook("958-1-302-2", 30, "爱丽丝历险记", 3);
		controller.addBook("900-7-392-2", 20, "煲汤大全", 4);
		
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
