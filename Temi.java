package interMinterFeis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Temi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temi frame = new Temi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Temi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrP_Op_Client = new JScrollPane();
		scrP_Op_Client.setBounds(10, 36, 167, 214);
		contentPane.add(scrP_Op_Client);
		
		JList list = new JList();
		list.setVisibleRowCount(15);
		scrP_Op_Client.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Client");
		scrP_Op_Client.setColumnHeaderView(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Unassigned orders:");
		lblNewLabel.setBounds(10, 11, 165, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrP_Op_Prod = new JScrollPane();
		scrP_Op_Prod.setBounds(216, 36, 208, 50);
		contentPane.add(scrP_Op_Prod);
		
		JLabel lblNewLabel_3 = new JLabel("Products");
		scrP_Op_Prod.setColumnHeaderView(lblNewLabel_3);
		
		JList list_1 = new JList();
		scrP_Op_Prod.setViewportView(list_1);
		
		JButton btnNewButton = new JButton("Look assigned orders");
		btnNewButton.setBounds(216, 7, 208, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(269, 102, 155, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address:");
		lblNewLabel_2.setBounds(216, 116, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrP_Op_Driver = new JScrollPane();
		scrP_Op_Driver.setBounds(216, 168, 208, 50);
		contentPane.add(scrP_Op_Driver);
		
		JLabel lblNewLabel_4 = new JLabel("Driver ");
		scrP_Op_Driver.setColumnHeaderView(lblNewLabel_4);
		
		JList list_2 = new JList();
		scrP_Op_Driver.setViewportView(list_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ivan Ivanow", "Pesho", "Gosho", "Nikola"}));
		comboBox.setBounds(216, 228, 167, 22);
		contentPane.add(comboBox);
	}
}
