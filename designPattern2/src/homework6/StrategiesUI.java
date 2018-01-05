package homework6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StrategiesUI {
	private Controller controller;
	private JFrame frame1 = new JFrame();
	private String strategyId, strategyName, type;
	private int bookType;
	private double discount;
	
	public StrategiesUI(Controller con) {
		controller = con;
		frame1.setTitle("策略维护");
		frame1.setLayout(null);
	    frame1.setBounds(800, 120, 1200, 600);
	    
	    String[] columnNames = {"策略编号","策略名称","策略类型","适用图书类型","折扣"};
	    JTable strategyTable = new JTable(controller.getStrategyCatalog().info(), columnNames);
	    strategyTable.setBounds(0, 0, 600, 400);
	    strategyTable.setRowHeight(40);
	    
	    JScrollPane p = new JScrollPane(strategyTable);
	    p.setBounds(100, 30, 600, 400);
	    frame1.add(p);
	    
	    JLabel label = new JLabel("策略编号:");
        label.setBounds(750,20,150,25);
        frame1.add(label);
        JTextField text = new JTextField(20);
        text.setBounds(850,20,165,25);
        frame1.add(text);
	    
        JLabel label1 = new JLabel("策略名称:");
        label1.setBounds(750,70,150,25);
        frame1.add(label1);
        JTextField text1 = new JTextField(20);
        text1.setBounds(850,70,165,25);
        frame1.add(text1);
	    
		
	    JLabel label2 = new JLabel("策略类型:");
        label2.setBounds(750,120,150,25);
        frame1.add(label2);
        JTextField text2 = new JTextField(20);
        text2.setBounds(850,120,165,25);
        frame1.add(text2);
        
        JLabel label3 = new JLabel("适用图书类型:");
        label3.setBounds(750,170,150,25);
        frame1.add(label3);
        JTextField text3 = new JTextField(20);
        text3.setBounds(850,170,165,25);
        frame1.add(text3);
        
        JLabel label4 = new JLabel("折扣/优惠/组合:");
        label4.setBounds(750,220,150,25);
        frame1.add(label4);
        JTextField text4 = new JTextField(20);
        text4.setBounds(850,220,165,25);
        frame1.add(text4);
	    
	    strategyTable.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent e) 

            { if(e.getClickCount() == 1){ 

                int row =((JTable)e.getSource()).rowAtPoint(e.getPoint()); //获得行位置 
            	//int col=((JTable)e.getSource()).columnAtPoint(e.getPoint()); //获得列位置 
            	strategyId = (String)(strategyTable.getValueAt(row,0)); //获得点击单元格数据
            	strategyName = (String)(strategyTable.getValueAt(row,1));
            	type = (String)(strategyTable.getValueAt(row,2));
            	bookType = (int)(strategyTable.getValueAt(row,3));
            	discount = (double)(strategyTable.getValueAt(row,4));
            	
            	text.setText(strategyId);
            	text1.setText(strategyName);
            	text2.setText(type);
            	text3.setText(bookType+"");
            	text4.setText(discount+"");
            	//JOptionPane.showMessageDialog(null, cellVal, "捕获成功", JOptionPane.INFORMATION_MESSAGE);
            	}
            }	});
	    
	    JButton addStrategyBtn = new JButton("添加策略");
	    JButton updateStrategyBtn = new JButton("修改策略");
	    JButton deleteStrategyBtn = new JButton("删除策略");
	    
	    addStrategyBtn.setBounds(100, 480, 150, 50);
	    updateStrategyBtn.setBounds(300, 480, 150, 50);
	    deleteStrategyBtn.setBounds(500, 480, 150, 50);
	    
	    frame1.add(addStrategyBtn);
	    frame1.add(updateStrategyBtn);
	    frame1.add(deleteStrategyBtn);
	    
	    addStrategyBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				strategyId = text.getText();
				strategyName = text1.getText();
				bookType = Integer.valueOf(text3.getText());
				discount = Double.valueOf(text4.getText());
				System.out.println(strategyId+strategyName+bookType+discount);
				
					controller.addSimpleStrategy(strategyId, strategyName, bookType, discount);
				
				//else controller.addCompositeStrategy(strategyId, strategyName, bookType, (int)discount);
			}
		});
	    
	    deleteStrategyBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(strategyId);
				controller.deleteStrategy(strategyId);
				
			}
		});
	    
	    
	    updateStrategyBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				strategyId = text.getText();
				strategyName = text1.getText();
				bookType = Integer.valueOf(text3.getText());
				discount = Double.valueOf(text4.getText());
				controller.updateStrategy(strategyId, strategyName, bookType, discount);
				
			}
		});
	    
	 
	    
	    frame1.setVisible(true);
	}
}
