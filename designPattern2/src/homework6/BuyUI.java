package homework6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BuyUI {
	private Controller controller;
	private JFrame frame1;
	private String isbn, title;
	private double price;
	private int type;
	
	public BuyUI(Controller con) {
		controller = con;
		Sale sale = new Sale();
		new ShoppingCarUI(sale);
		
		frame1 = new JFrame("购买图书");
		frame1.setLayout(null);
	    frame1.setBounds(300, 120, 800, 600);
	    
	    
	    String[] columnNames = {"ISBN号","书名","价格","类型"};
	    
	    JTable bookTable = new JTable(controller.getBookCatalog().info(), columnNames);
	    //bookTable.setPreferredScrollableViewportSize(new Dimension(550, 200));
	    bookTable.setBounds(0, 0, 600, 400);
	    bookTable.setRowHeight(20);
	    //bookTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    JScrollPane p = new JScrollPane(bookTable);
	    p.setBounds(100, 30, 600, 400);
	    frame1.add(p);
	    
	    bookTable.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent e) 

            { if(e.getClickCount() == 1){ 

                int row =((JTable)e.getSource()).rowAtPoint(e.getPoint()); //获得行位置 
            	//int col=((JTable)e.getSource()).columnAtPoint(e.getPoint()); //获得列位置 
            	isbn = (String)(bookTable.getValueAt(row,0)); //获得点击单元格数据
            	title = (String)(bookTable.getValueAt(row,1));
            	price = (double)(bookTable.getValueAt(row,2));
            	type = (int)(bookTable.getValueAt(row,3));
            	//JOptionPane.showMessageDialog(null, cellVal, "捕获成功", JOptionPane.INFORMATION_MESSAGE);
            	}
            }	});
	    
	    JButton btn = new JButton("加入购物车");
        btn.setBounds(500, 480, 150, 50);
        frame1.add(btn);
	    
        btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SaleLineItem item = controller.buyBook(isbn, price, title, type);
				sale.buyBook(item);
				sale.notifyObserver();
				
			}
		});
        
	    frame1.setVisible(true);
	}
}
