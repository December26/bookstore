package homework6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainUI {
	private Controller controller = new Controller();
	
	public MainUI() {
		JFrame frame = new JFrame("һ�����������鼮�ĵ���������վ�Ĺ��ﳵϵͳ");
		frame.setLayout(null);
		frame.setBounds(100, 100, 1000, 800);
		
		JButton addBookButton = new JButton("ͼ������");
		JButton strategiesButton = new JButton("����ά��");
		JButton buyButton = new JButton("����ͼ��");
		
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
