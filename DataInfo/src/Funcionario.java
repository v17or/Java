import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Funcionario extends JFrame implements ActionListener{

	private JLabel labelTelefone;
	private JLabel labelNome;
	private JLabel labelEmail;
	private JLabel labelSalario;
	private JLabel labelEndereco;
	private JLabel labelCidade;
	private JLabel labelCPF;
	private JLabel labelIdade;
	private JLabel labelCodigo;
	private JButton btnAbrir, btnGravar;
	private JTextField tfTelefone, tfNome, tfEmail, tfEndereco, tfCidade, tfCPF, tfIdade, tfCodigo, tfSaldo, tfSalario;
	private JPanel painel;
	

	public Funcionario (String titulo){
		
		super(titulo);
		
		labelNome = new JLabel("Nome");
		labelEmail = new JLabel("Email");
		labelTelefone = new JLabel("Telefone");
		labelEndereco = new JLabel("Endereço");
		labelCidade = new JLabel("Cidade");
		labelCPF = new JLabel("CPF");
		labelIdade = new JLabel("Idade");
		labelCodigo = new JLabel("Código");
		labelSalario = new JLabel("Salario");
		
		tfEmail = new JTextField(20);
		tfNome = new JTextField(20);
		tfTelefone = new JTextField(20);
		tfEndereco = new JTextField(20);
		tfCidade = new JTextField(20);
		tfCPF = new JTextField(20);
		tfIdade = new JTextField(20);
		tfCodigo = new JTextField(20);
		tfSalario = new JTextField(20);
		btnAbrir = new JButton("Abrir");
		btnGravar = new JButton("Gravar");
		


		painel = new JPanel();
		painel.setLayout(new GridLayout(10, 10));
		
		painel.add(labelNome);
		painel.add(tfNome);
		
		painel.add(labelEmail);
		painel.add(tfEmail);
		
		painel.add(labelTelefone);
		painel.add(tfTelefone);
		
		painel.add(labelEndereco);
		painel.add(tfEndereco);
		
		painel.add(labelCPF);
		painel.add(tfCPF);
		
		painel.add(labelCidade);
		painel.add(tfCidade);
		
		painel.add(labelIdade);
		painel.add(tfIdade);
		
		painel.add(labelCodigo);
		painel.add(tfCodigo);
		
		painel.add(labelSalario);
		painel.add(tfSalario);
		painel.add(btnAbrir);
		painel.add(btnGravar);
		
		
		this.getContentPane().add(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Tela tela = new Tela("Cadastro");
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	} 
}
