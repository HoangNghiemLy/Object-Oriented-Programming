package application_version_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DeleteButtonAction implements ActionListener {
	
	private Application app;
	
	public DeleteButtonAction(Application app) {
		this.app = app;
	}

	// Học viên code ở đây
	@Override
	public void actionPerformed(ActionEvent e) {
		// Triển khai hành động cho nút DELETE, biết được cung cấp sẵn chức năng kiểm tra đầu vào đầy đủ (deleteValidate)
	}
	
	private boolean deleteValidate() {
		return !this.app.getIdTextField2().getText().equals("");
	}
	
}
