package tugasPertemuan13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatihanKasus extends JFrame implements ActionListener {
	private JTextField input1;
	private JTextField input2;
	private JButton btn_jumlah;
	
	public LatihanKasus()  {
		input1 = new JTextField();
		input2 = new JTextField();
		btn_jumlah = new JButton("Jumlah");
		
		btn_jumlah.addActionListener(this);
		setLayout(new GridLayout(3, 2));
		
		add(input1);
		add(input2);
		add(btn_jumlah);

		setTitle("Penjumlahan");
		setSize(300, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int angka1 = Integer.parseInt(input1.getText());
			int angka2 = Integer.parseInt(input2.getText());
			
			int hasil = angka1 + angka2;
			String pesan = "Jumlah: " + hasil;
			JOptionPane.showMessageDialog(this, pesan, "Hasil", JOptionPane.INFORMATION_MESSAGE);
			} 
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LatihanKasus();
			}
		});
	}
}		

