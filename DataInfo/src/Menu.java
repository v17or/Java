import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Menu extends JFrame implements MenuListener, ActionListener{

	private JMenuBar barraMenu;
	private JMenu menuCliente, menuFuncionario, menuSair;
	private JMenuItem menuApagar, menuCadastro, menuCadastrafunc, menuDemitefunc;
	private Menu pcliente = null;
	
	public Menu(String titulo)
	{
		super(titulo);//Aqui � a chamado ao construtor da
		//superclasse, deve ser a primeira instru��o do construtor
		this.setBounds(100, 100, 456, 112);
		iniciar();
	}
	public void iniciar(){
		barraMenu = new JMenuBar();
		menuCliente = new JMenu("Cliente");
		menuCadastro = new JMenuItem("Cadastrar cliente");
		menuApagar = new JMenuItem("Remover cliente");
		
		menuFuncionario = new JMenu("Funcionario");
		menuCadastrafunc = new JMenuItem("Cadastrar funcionario");
		menuDemitefunc = new JMenuItem("Demitir funcionario");
		
		menuSair = new JMenu("Sair");
		
		
	//Menus Cliente
		menuCliente.addMenuListener(this);	
		menuCadastro.addActionListener(this);
		menuApagar.addActionListener(this);
	//Menus Funcionario
		menuFuncionario.addMenuListener(this);
		menuCadastrafunc.addActionListener(this);
		menuDemitefunc.addActionListener(this);
	//atribuicao de itens
		menuCliente.add(menuCadastro);
		menuCliente.add(menuApagar);
		menuFuncionario.add(menuCadastrafunc);
		menuFuncionario.add(menuDemitefunc);
		
		barraMenu.add(menuFuncionario);
		barraMenu.add(menuCliente);
		
		this.setJMenuBar(barraMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
}	
	
	public static void main(String[] args){
		
		new Menu ("Menu da aplicacao").setVisible(true);
	}

@Override
public void actionPerformed (ActionEvent e){
	
	if (e.getSource()== menuCadastrafunc){
		new Funcionario("Cadastrar Funcionario");
		if (pcliente == null){
		 new Funcionario("Cadastrar Funcionario");
			
		}	
	}	}
	public void actionPerformed1 (ActionEvent e){
		
		if (e.getSource()== menuCliente){
			new Cliente("Cadastrar Cliente");
			if (pcliente == null){
			 new Cliente("Cadastrar Cliente");
			}
			else if (e.getSource()== menuSair){
				System.exit(0);
		}
	}	
}
@Override
public void menuCanceled(MenuEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void menuDeselected(MenuEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void menuSelected(MenuEvent e) {
	// TODO Auto-generated method stub
	
}
}




