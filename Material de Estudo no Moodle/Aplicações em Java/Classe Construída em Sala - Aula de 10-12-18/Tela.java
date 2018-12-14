package aula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame implements KeyListener,ActionListener{
	
	JTextField tx; JButton bt;
	
	public Tela() {
		setTitle("Exemplo de Tela");
		setBounds(100,100,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tx = new JTextField();
		tx.setBounds(20,50,150,30);
		tx.addKeyListener(this);
		
		bt = new JButton();
		bt.setBounds(20, 120, 80, 40);
		bt.setText("Ok");
		bt.addActionListener(this);
		
		getContentPane().setLayout(null);
		getContentPane().add(tx);
		getContentPane().add(bt);
		
	}
	
	public static void main(String[] args) {
		new Tela().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "O valor informado foi "+tx.getText(),
			"AVISO",JOptionPane.INFORMATION_MESSAGE );
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int tecla = e.getKeyChar();
		if(!Character.isDigit(tecla))
			e.consume();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {	}

	@Override
	public void keyReleased(KeyEvent arg0) { }



}

