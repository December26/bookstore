package homework6;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JLabel;

public class ShoppingCarUI implements Observer {

	private JFrame frame1;
	private JLabel totalLabel = new JLabel();
	
	
	public ShoppingCarUI(Subject sale) {
		sale.registerObserver(this);
		frame1 = new JFrame("���ﳵ");
		frame1.setLayout(null);
	    frame1.setBounds(1100, 120, 300, 600);
	    
	    JLabel titleLabel = new JLabel("����");
		JLabel numberLabel = new JLabel("����");
		titleLabel.setBounds(70, 50, 50, 30);
		numberLabel.setBounds(180, 50, 50, 30);
		frame1.add(titleLabel);
		frame1.add(numberLabel);
		
	    frame1.setVisible(true);
	}
	@Override
	public void update(Sale s) {
		//JOptionPane.showMessageDialog(null, "�۲���", "����ɹ�", JOptionPane.INFORMATION_MESSAGE);
		frame1.repaint();
		
		int position = 90;
		
		ArrayList<SaleLineItem> items = s.getItems();
		for(int i=0;i<items.size();i++) {
			JLabel label1 = new JLabel(items.get(i).getProdSpec().getTitle());
			JLabel label2 = new JLabel(items.get(i).getCopies()+"");
			label1.setBounds(70, position, 50, 30);
			label2.setBounds(180, position, 50, 30);
			frame1.add(label1);
			frame1.add(label2);
			position += 40;
		}
		
		totalLabel.setText("�ܼ�Ϊ:"+String.valueOf(s.getTotal())+"Ԫ");
		totalLabel.setBounds(100, 520, 120, 30);
		frame1.add(totalLabel);
		
		//JOptionPane.showMessageDialog(null, String.valueOf(s.getTotal()), "��ʾ", JOptionPane.INFORMATION_MESSAGE);
	}

}
