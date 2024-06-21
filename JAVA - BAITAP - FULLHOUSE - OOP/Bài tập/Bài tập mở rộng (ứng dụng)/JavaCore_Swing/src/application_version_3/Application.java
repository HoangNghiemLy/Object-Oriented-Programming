package application_version_3;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.io.File;


@SuppressWarnings("serial")
public class Application extends JFrame {
	
	private StudentManagement sm;
	private JButton createButton;
	private JButton updateButton;
	private JLabel idLabel1;
	private JLabel nameLabel;
	private JLabel avgLabel;
	private JTextField idTextField1;
	private JTextField nameTextField;
	private JTextField avgTextField;
	private JButton searchButton;
	private JButton deleteButton;
	private JLabel idLabel2;
	private JTextField idTextField2;
	private JButton clearButton;
	private JButton showAllButton;
	private JButton loadFileButton;
	private JButton saveFileButton;

	public Application() {
		this.sm = new StudentManagement();
		int lineStretch = 10;
		
		this.setTitle("Simple Student Management System");
		this.setSize(850, 750);
		
		/*
		 * Initialize components
		 */
		// ------------------------------------------------------------------------------------------------------
		// Create button
		this.createButton = new JButton("CREATE");
		this.createButton.setBounds(150 + lineStretch, 50, 200, 30);
		this.createButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		// Học viên code ở đây
		this.createButton.addActionListener((e) -> {
			// Triển khai hành động cho nút CREATE, biết được cung cấp sẵn chức năng kiểm tra đầu vào đầy đủ (createValidate)
		});
		this.add(this.createButton);
		
		// Update button
		this.updateButton = new JButton("UPDATE");
		this.updateButton.setBounds(350 + lineStretch * 2, 50, 200, 30);
		this.updateButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		// Học viên code ở đây
		this.updateButton.addActionListener((e) -> {
			// Triển khai hành động cho nút UPDATE, biết được cung cấp sẵn chức năng kiểm tra đầu vào đầy đủ (updateValidate)
		});
		this.add(this.updateButton);
		
		// ID label 1
		this.idLabel1 = new JLabel("ID: ");
		this.idLabel1.setBounds(50, 80 + lineStretch, 100, 30);
		this.idLabel1.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.idLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.idLabel1);
		
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
		
		// ID text field 1
		this.idTextField1 = new JTextField();
		this.idTextField1.setBounds(150 + lineStretch, 80 + lineStretch, 600, 30);
		this.idTextField1.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.add(this.idTextField1);
		
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
		// Học viên code ở đây
		this.clearButton.addActionListener((e) -> {
			// Triển khai hành động cho nút CLEAR
		});
		this.add(this.clearButton);
		
		// Search button
		this.searchButton = new JButton("SEARCH");
		this.searchButton.setBounds(150 + lineStretch, 200 + lineStretch * 14, 200, 30);
		this.searchButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		// Học viên code ở đây
		this.searchButton.addActionListener((e) -> {
			// Triển khai hành động cho nút SEARCH, biết được cung cấp sẵn chức năng kiểm tra đầu vào đầy đủ (searchValidate)
		});
		this.add(this.searchButton);
		
		// Delete button
		this.deleteButton = new JButton("DELETE");
		this.deleteButton.setBounds(350 + lineStretch * 2, 200 + lineStretch * 14, 200, 30);
		this.deleteButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		// Học viên code ở đây
		this.deleteButton.addActionListener((e) -> {
			// Triển khai hành động cho nút DELETE, biết được cung cấp sẵn chức năng kiểm tra đầu vào đầy đủ (deleteValidate)
		});
		this.add(this.deleteButton);
		
		// ID label 2
		this.idLabel2 = new JLabel("ID: ");
		this.idLabel2.setBounds(50, 230 + lineStretch * 15, 100, 30);
		this.idLabel2.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.idLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.idLabel2);
		
		// ID text field 2
		this.idTextField2 = new JTextField();
		this.idTextField2.setBounds(150 + lineStretch, 230 + lineStretch * 15, 600, 30);
		this.idTextField2.setFont(new Font("Times new roman", Font.BOLD, 20));
		this.add(this.idTextField2);
		
		// Show all button
		this.showAllButton = new JButton("SHOW ALL");
		this.showAllButton.setBounds(150 + lineStretch, 260 + lineStretch * 25, 200, 30);
		this.showAllButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		// Học viên code ở đây
		this.showAllButton.addActionListener((e) -> {
			// Triển khai hành động cho nút SHOW ALL
		});
		this.add(this.showAllButton);
		
		// Load file button
		this.loadFileButton = new JButton("LOAD FILE");
		this.loadFileButton.setBounds(150 + lineStretch, 290 + lineStretch * 35, 200, 30);
		this.loadFileButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		// Học viên code ở đây
		this.loadFileButton.addActionListener((e) -> {
			// Triển khai hành động cho nút LOAD FILE
		});
		this.add(this.loadFileButton);
		
		// Save file button
		this.saveFileButton = new JButton("SAVE FILE");
		this.saveFileButton.setBounds(350 + lineStretch * 2, 290 + lineStretch * 35, 200, 30);
		this.saveFileButton.setFont(new Font("Times new roman", Font.BOLD, 20));
		// Học viên code ở đây
		this.saveFileButton.addActionListener((e) -> {
			// Triển khai hành động cho nút SAVE FILE
		});
		this.add(this.saveFileButton);
		// ------------------------------------------------------------------------------------------------------
		
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public StudentManagement getSm() {
		return sm;
	}

	public JButton getCreateButton() {
		return createButton;
	}

	public JButton getUpdateButton() {
		return updateButton;
	}

	public JLabel getIdLabel1() {
		return this.idLabel1;
	}

	public JLabel getNameLabel() {
		return this.nameLabel;
	}

	public JLabel getAvgLabel() {
		return this.avgLabel;
	}

	public JTextField getIdTextField1() {
		return this.idTextField1;
	}

	public JTextField getNameTextField() {
		return this.nameTextField;
	}

	public JTextField getAvgTextField() {
		return this.avgTextField;
	}

	public JButton getSearchButton() {
		return this.searchButton;
	}

	public JButton getDeleteButton() {
		return this.deleteButton;
	}

	public JLabel getIdLabel2() {
		return this.idLabel2;
	}

	public JTextField getIdTextField2() {
		return this.idTextField2;
	}

	public JButton getClearButton() {
		return this.clearButton;
	}

	public JButton getShowAllButton() {
		return this.showAllButton;
	}

	public JButton getLoadFileButton() {
		return this.loadFileButton;
	}

	public JButton getSaveFileButton() {
		return this.saveFileButton;
	}
	
	private boolean createValidate() {
		return !this.idTextField1.getText().equals("") && 
			   !this.nameTextField.getText().equals("") && 
			   !this.avgTextField.getText().equals("");
	}
	
	private boolean updateValidate() {
		return !this.idTextField1.getText().equals("") && 
			   !this.nameTextField.getText().equals("") && 
			   !this.avgTextField.getText().equals("");
	}
	
	private boolean searchValidate() {
		return !this.idTextField2.getText().equals("");
	}
	
	private boolean deleteValidate() {
		return !this.idTextField2.getText().equals("");
	}
	
}
