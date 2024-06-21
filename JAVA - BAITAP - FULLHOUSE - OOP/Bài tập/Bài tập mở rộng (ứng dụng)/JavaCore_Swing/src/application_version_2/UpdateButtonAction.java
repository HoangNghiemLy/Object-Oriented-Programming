package application_version_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UpdateButtonAction implements ActionListener {
	
	private Application app;
	
	public UpdateButtonAction(Application app) {
		this.app = app;
	}

	// Học viên code ở đây
	@Override
	public void actionPerformed(ActionEvent e) {
		// Triển khai hành động cho nút UPDATE, biết được cung cấp sẵn chức năng kiểm tra đầu vào đầy đủ (updateValidate)
	}
	
	private boolean updateValidate() {
		return !this.app.getIdTextField1().getText().equals("") && 
			   !this.app.getNameTextField().getText().equals("") && 
			   !this.app.getAvgTextField().getText().equals("");
	}

}
