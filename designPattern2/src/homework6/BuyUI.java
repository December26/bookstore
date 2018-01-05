package homework6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BuyUI {
	private Controller controller;
	private JFrame frame1;
	private String isbn, title;
	private double price;
	private int type, copies;
	
	public BuyUI(Controller con) {
		controller = con;
		Sale sale = new Sale();
		new ShoppingCarUI(sale);
		
		frame1 = new JFrame("����ͼ��");
		frame1.setLayout(null);
	    frame1.setBounds(300, 120, 800, 600);
	    
	    
	    String[] columnNames = {"ISBN��","����","�۸�","����"};
	    
	    JTable bookTable = new JTable(controller.getBookCatalog().info(), columnNames);
	    //bookTable.setPreferredScrollableViewportSize(new Dimension(550, 200));
	    bookTable.setBounds(0, 0, 600, 400);
	    bookTable.setRowHeight(40);
	    //bookTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    JScrollPane p = new JScrollPane(bookTable);
	    p.setBounds(100, 30, 600, 400);
	    frame1.add(p);
	    
	    bookTable.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent e) 

            { if(e.getClickCount() == 1){ 

                int row =((JTable)e.getSource()).rowAtPoint(e.getPoint()); //�����λ�� 
            	//int col=((JTable)e.getSource()).columnAtPoint(e.getPoint()); //�����λ�� 
            	isbn = (String)(bookTable.getValueAt(row,0)); //��õ����Ԫ������
            	title = (String)(bookTable.getValueAt(row,1));
            	price = (double)(bookTable.getValueAt(row,2));
            	type = (int)(bookTable.getValueAt(row,3));
            	//JOptionPane.showMessageDialog(null, cellVal, "����ɹ�", JOptionPane.INFORMATION_MESSAGE);
            	}
            }	});
	    
	    JLabel label = new JLabel("��������:");
        label.setBounds(80,480,150,25);
        frame1.add(label);
        JTextField text = new JTextField(20);
        text.setBounds(180,480,100,25);
        text.setText("1");
        frame1.add(text);
	    
	    JButton btn = new JButton("���빺�ﳵ");
        btn.setBounds(500, 480, 150, 50);
        frame1.add(btn);
	    
        btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				copies = Integer.valueOf(text.getText());
				SaleLineItem item = controller.buyBook(isbn, price, title, type, copies);
				sale.buyBook(item);
				sale.notifyObserver();
				
			}
		});
        
	    frame1.setVisible(true);
	}
}
