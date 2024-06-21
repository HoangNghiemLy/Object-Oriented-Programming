package application_version_1;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class Application extends JFrame {
	
	private StudentManagement sm;
	private JButton createButton;
	private JLabel idLabel;
	private JLabel nameLabel;
	private JLabel avgLabel;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField avgTextField;
	private JButton clearButton;
	private JButton showAllButton;

	public Application() {
		this.sm = new StudentManagement();
		int lineStretch = 10;
		
		this.setTitle("Simple Student Management System");
		this.setSize(850, 450);
		
		/*
		 * Initialize components
		 */
		// ------------------------------------------------------------------------------------------------------
		// Create button
		this.createButton = new JButton("CREATE");
		this.createButton.setBounds(150 + lineStretch, 50, 200, 30);
		this.createButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.createButton.addActionListener(new CreateButtonAction(this));
		this.add(this.createButton);
		
		// ID label
		this.idLabel = new JLabel("ID: ");
		this.idLabel.setBounds(50, 80 + lineStretch, 100, 30);
		this.idLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.idLabel);
		
		// Name label
		this.nameLabel = new JLabel("Name: ");
		this.nameLabel.setBounds(50, 110 + lineStretch * 2, 100, 30);
		this.nameLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.nameLabel);
		
		// Avg label
		this.avgLabel = new JLabel("Avg: ");
		this.avgLabel.setBounds(50, 140 + lineStretch * 3, 100, 30);
		this.avgLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.avgLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.avgLabel);
		
		// ID text field
		this.idTextField = new JTextField();
		this.idTextField.setBounds(150 + lineStretch, 80 + lineStretch, 600, 30);
		this.idTextField.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.add(this.idTextField);
		
		// Name text field
		this.nameTextField = new JTextField();
		this.nameTextField.setBounds(150 + lineStretch, 110 + lineStretch * 2, 600, 30);
		this.nameTextField.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.add(this.nameTextField);
		
		// Avg text field
		this.avgTextField = new JTextField();
		this.avgTextField.setBounds(150 + lineStretch, 140 + lineStretch * 3, 600, 30);
		this.avgTextField.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.add(this.avgTextField);
		
		// Clear button
		this.clearButton = new JButton("CLEAR");
		this.clearButton.setBounds(150 + lineStretch, 170 + lineStretch * 4, 200, 30);
		this.clearButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.clearButton.addActionListener(new ClearButtonAction(this));
		this.add(this.clearButton);
		
		// Show all button
		this.showAllButton = new JButton("SHOW ALL");
		this.showAllButton.setBounds(150 + lineStretch, 170 + lineStretch * 14, 200, 30);
		this.showAllButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.showAllButton.addActionListener(new ShowAllButtonAction(this));
		this.add(this.showAllButton);
		// ------------------------------------------------------------------------------------------------------
		
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public StudentManagement getSm() {
		return this.sm;
	}


	public JButton getCreateButton() {
		return this.createButton;
	}

	public JLabel getIdLabel() {
		return this.idLabel;
	}

	public JLabel getNameLabel() {
		return this.nameLabel;
	}


	public JLabel getAvgLabel() {
		return this.avgLabel;
	}


	public JTextField getIdTextField() {
		return this.idTextField;
	}

	public JTextField getNameTextField() {
		return this.nameTextField;
	}


	public JTextField getAvgTextField() {
		return this.avgTextField;
	}


	public JButton getClearButton() {
		return this.clearButton;
	}

	public JButton getShowAllButton() {
		return this.showAllButton;
	}

}
