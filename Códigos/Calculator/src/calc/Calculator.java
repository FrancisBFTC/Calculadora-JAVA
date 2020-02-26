package calc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame{
	private JButton numero1;
	private JButton numero2;
	private JButton numero3;
	private JButton numero4;
	private JButton numero5;
	private JButton numero6;
	private JButton numero7;
	private JButton numero8;
	private JButton numero9;
	private JButton numero0;
	private JButton elev;
	private JButton reset;
	private JButton soma;
	private JButton mult;
	private JButton div;
	private JButton sub;
	private JButton porcent;
	private JButton igual;
	private JTextField campo;
	private int memoria, leitura;
	private int numero = 100;
	private double doubleMemoria;
	private double porc;
	private char operacao;
	private String opElev;
	
	
	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.setVisible(true);
	}
	
	


	@SuppressWarnings("static-access")
	public Calculator(){
		
		
		
		this.setBounds(0, 0, 280, 310);
		this.setTitle("Calculadora");
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setMinimumSize(new Dimension(280, 330));
		getContentPane().setBackground(Color.orange);
		
		ImageIcon icon;
		icon = new ImageIcon(getClass().getResource("/icon/calc.png"));
		this.setIconImage(icon.getImage());
		//OBJETO DOS BOTOES DA CALCULADORA
		
		
		leitura = 0;
		memoria = 0;
		doubleMemoria = 0.0;
		
		campo = new JTextField();
		campo.setBounds(5, 10, 255, 40);
		campo.setBackground(Color.black);
		campo.setForeground(Color.red);
		campo.setFont(new Font("Arial", 1, 20));
		campo.setHorizontalAlignment(campo.RIGHT);
		this.add(campo);
		
		
		
		elev = new JButton();
		elev.setText("elev");
		elev.setBounds(5, 245, 125, 40);
		elev.setBackground(Color.cyan);
		elev.setFont(new Font("Arial", 1, 15));
		this.add(elev);
		
		reset = new JButton();
		reset.setText("reset");
		reset.setBounds(135, 245, 125, 40);
		reset.setBackground(Color.red);
		reset.setFont(new Font("Arial", 1, 15));
		this.add(reset);
		
		div = new JButton();
		div.setText("/");
		div.setBounds(199, 65, 60, 40);
		div.setBackground(Color.red);
		div.setFont(new Font("Arial", 1, 15));
		this.add(div);
		
		mult = new JButton();
		mult.setText("x");
		mult.setBounds(199, 110, 60, 40);
		mult.setBackground(Color.red);
		mult.setFont(new Font("Arial", 1, 15));
		this.add(mult);
		
		soma = new JButton();
		soma.setText("+");
		soma.setBounds(199, 155, 60, 40);
		soma.setBackground(Color.red);
		soma.setFont(new Font("Arial", 1, 15));
		this.add(soma);
		
		sub = new JButton();
		sub.setText("-");
		sub.setBounds(135, 200, 60, 40);
		sub.setBackground(Color.red);
		sub.setFont(new Font("Arial", 1, 15));
		this.add(sub);
		
		porcent = new JButton();
		porcent.setText("%");
		porcent.setBounds(5, 200, 60, 40);
		porcent.setBackground(Color.red);
		porcent.setFont(new Font("Arial", 1, 15));
		this.add(porcent);
		
		igual = new JButton();
		igual.setText("=");
		igual.setBounds(199, 200, 60, 40);
		igual.setBackground(Color.red);
		igual.setFont(new Font("Arial", 1, 15));
		this.add(igual);
		
		
		numero1 = new JButton();
		numero1.setText("1");
		numero1.setBounds(5, 65, 60, 40);
		numero1.setBackground(Color.cyan);
		numero1.setFont(new Font("Arial", 1, 15));
		this.add(numero1);
		
		numero2 = new JButton();
		numero2.setText("2");
		numero2.setBounds(70, 65, 60, 40);
		numero2.setBackground(Color.cyan);
		numero2.setFont(new Font("Arial", 1, 15));
		this.add(numero2);
		
		numero3 = new JButton();
		numero3.setText("3");
		numero3.setBounds(135, 65, 60, 40);
		numero3.setBackground(Color.cyan);
		numero3.setFont(new Font("Arial", 1, 15));
		this.add(numero3);
		
		numero4 = new JButton();
		numero4.setText("4");
		numero4.setBounds(5, 110, 60, 40);
		numero4.setBackground(Color.cyan);
		numero4.setFont(new Font("Arial", 1, 15));
		this.add(numero4);
		
		numero5 = new JButton();
		numero5.setText("5");
		numero5.setBounds(70, 110, 60, 40);
		numero5.setBackground(Color.cyan);
		numero5.setFont(new Font("Arial", 1, 15));
		this.add(numero5);
		
		numero6 = new JButton();
		numero6.setText("6");
		numero6.setBounds(135, 110, 60, 40);
		numero6.setBackground(Color.cyan);
		numero6.setFont(new Font("Arial", 1, 15));
		this.add(numero6);
		
		numero7 = new JButton();
		numero7.setText("7");
		numero7.setBounds(5, 155, 60, 40);
		numero7.setBackground(Color.cyan);
		numero7.setFont(new Font("Arial", 1, 15));
		this.add(numero7);
		
		numero8 = new JButton();
		numero8.setText("8");
		numero8.setBounds(70, 155, 60, 40);
		numero8.setBackground(Color.cyan);
		numero8.setFont(new Font("Arial", 1, 15));
		this.add(numero8);
		
		numero9 = new JButton();
		numero9.setText("9");
		numero9.setBounds(135, 155, 60, 40);
		numero9.setBackground(Color.cyan);
		numero9.setFont(new Font("Arial", 1, 15));
		this.add(numero9);
		
		numero0 = new JButton();
		numero0.setText("0");
		numero0.setBounds(70, 200, 60, 40);
		numero0.setBackground(Color.cyan);
		numero0.setFont(new Font("Arial", 1, 15));
		this.add(numero0);
		
		//AÇOES DOS BOTOES DA CALCULADORA
		
		numero1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 1;
				campo.setText(campo.getText() + "1");
				    
				
			}
		});
		
		numero2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 2;
				campo.setText(campo.getText() + "2");
				
				
			}
		});
		
		numero3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 3;
				campo.setText(campo.getText() + "3");
				
			}
		});

		numero4.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 4;
				campo.setText(campo.getText() + "4");
				
				}
			});

		numero5.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 5;
				campo.setText(campo.getText() + "5");
				
				}
			});

		numero6.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 6;
				campo.setText(campo.getText() + "6");
				
				}
			});

		numero7.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 7;
				campo.setText(campo.getText() + "7");
				
				}
			});

		numero8.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 8;
				campo.setText(campo.getText() + "8");
				
				}
			});

		numero9.addActionListener(new ActionListener() {
	
	@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 9;
				campo.setText(campo.getText() + "9");
				
				}
			});

		numero0.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leitura *= 10;
				leitura += 0;
				campo.setText(campo.getText() + "0");
				
				}
			});
		
		soma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operacao = '+';
				memoria += leitura;
				leitura = 0;
				campo.setText(campo.getText() + "+");
				
			}
		});
		
		sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operacao = '-';
				memoria += leitura;
				leitura = 0;
				campo.setText(campo.getText() + "-");
			}
		});
		
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operacao = '/';
				doubleMemoria += leitura;
				leitura = 0;
				campo.setText(campo.getText() + "/");
			}
		});
		
		mult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operacao = 'x';
				memoria += leitura;
				leitura = 0;
				campo.setText(campo.getText() + "x");
			}
		});
		
		reset.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				memoria = 0;
				doubleMemoria = 0;
				leitura = 0;
				campo.setText(null);
				opElev = null;
				operacao = 0;
			}
		});
		
		elev.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0){
				opElev = "elev";
				memoria += leitura;
				leitura = 0;
				campo.setText(campo.getText() + "elev");
			}
		});
		
		porcent.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0){
				operacao = '%';
				doubleMemoria += leitura;
				leitura = 0;
				campo.setText(campo.getText() + "%");
			}
		});
		
		igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				switch(operacao){
					case '+': {
						memoria += leitura;
						break;
					}
					
					case '-': {
						memoria -= leitura;
						break;
					}
					
					case '/': {
						doubleMemoria /= leitura;
						break;
					}
					
					case 'x': {
						memoria *= leitura;
						break;
					}
					
					case '%': {
						
						porc = doubleMemoria *= leitura;
						doubleMemoria = porc /= numero;
					}
				}
				
					if(opElev=="elev"){
						if(leitura==1){
							memoria *= 1;
						}else{
							if(leitura==2){
								memoria *= memoria;
							}else{
								if(leitura==3){
									memoria *= memoria *= memoria;
								}else{
									if(leitura==4){
										memoria *= memoria *= memoria *= memoria;
									}else{
										if(leitura==5){
											memoria *= memoria *= memoria *= memoria *= memoria;
										}else{
											if(leitura==6){
												memoria *= memoria *= memoria *= memoria *= memoria *= memoria;
												
											}else{
												if(leitura==7){
													memoria *= memoria *= memoria *= memoria *= memoria *= memoria *= memoria;
												}else{
													if(leitura==8){
														memoria *= memoria *= memoria *= memoria *= memoria *= memoria *= memoria *= memoria;
													}else{
														if(leitura==9){
															memoria *= memoria *= memoria *= memoria *= memoria *= memoria *= memoria *= memoria *= memoria;
														}
													}
												}
											}
										}
									}
								}
								
							}//segundo else
						}//primeiro else
				}//if
				leitura = 0;
				if(operacao == '/' || operacao == '%'){
					campo.setText("" + doubleMemoria);
				}else{
					campo.setText("" + memoria);
				}
				
			}
		});
		
		
		
	}
}