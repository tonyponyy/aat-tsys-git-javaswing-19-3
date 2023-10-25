package unidad_19_3;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class vista1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Ubuntu");
	JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
	JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
	JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
	ButtonGroup bgroup = new ButtonGroup();
	JSlider slider = new JSlider();


	public vista1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
		lblNewLabel.setBounds(10, 11, 184, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEligeEspecialidad = new JLabel("Elige especialidad");
		lblEligeEspecialidad.setBounds(10, 115, 184, 14);
		contentPane.add(lblEligeEspecialidad);
		
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(10, 32, 184, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1.setBounds(10, 58, 184, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2.setBounds(10, 84, 184, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		

		chckbxNewCheckBox.setBounds(10, 136, 184, 23);
		contentPane.add(chckbxNewCheckBox);
		

		chckbxNewCheckBox_1.setBounds(10, 162, 184, 23);
		contentPane.add(chckbxNewCheckBox_1);
		

		chckbxNewCheckBox_2.setBounds(10, 188, 184, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		slider.setMaximum(10);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1); 
        slider.setMinorTickSpacing(1); 
        
		slider.setBounds(204, 32, 200, 62);
		contentPane.add(slider);
		
		JLabel lblHorasDedicadas = new JLabel("Horas dedicadas");
		lblHorasDedicadas.setBounds(204, 11, 200, 14);
		contentPane.add(lblHorasDedicadas);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(315, 188, 89, 23);
		btnNewButton.addActionListener(a1);
		contentPane.add(btnNewButton);
		

		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);
		
	}

	
	ActionListener a1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String sistema = "";
			String especialidad = " especialidad: ";
			if (rdbtnNewRadioButton.isSelected()) {
				sistema = rdbtnNewRadioButton.getText();
			}
			if (rdbtnNewRadioButton_1.isSelected()) {
				sistema = rdbtnNewRadioButton_1.getText();
			}
			if (rdbtnNewRadioButton_2.isSelected()) {
				sistema = rdbtnNewRadioButton_2.getText();
			}
			
			if (chckbxNewCheckBox.isSelected() || chckbxNewCheckBox_1.isSelected() || chckbxNewCheckBox_2.isSelected()) {
				if (chckbxNewCheckBox.isSelected()) {
					especialidad += chckbxNewCheckBox.getText()+" ";
				}
				if (chckbxNewCheckBox.isSelected()) {
					especialidad += chckbxNewCheckBox_1.getText()+" ";
				}
				if (chckbxNewCheckBox.isSelected()) {
					especialidad += chckbxNewCheckBox_2.getText()+" ";
				}
				
			}else{
				especialidad = " ";
			}
			
			String string = "Sistema opertativo: "+sistema+especialidad+"horas destinadas: "+slider.getValue();
			JOptionPane.showMessageDialog(null, string);
		}
	};
	
}
