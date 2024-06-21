package application_version_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SearchButtonAction implements ActionListener {
	
	private Application app;
	
	public SearchButtonAction(Application app) {
		this.app = app;
	}

	// Học viên code ở đây
	@Override
	public void actionPerformed(ActionEvent e) {
		// Triển khai hành động cho nút SEARCH, biết được cung cấp sẵn chức năng kiểm tra đầu vào đầy đủ (searchValidate)
	}
	
	private boolean searchValidate() {
		return !this.app.getIdTextField2().getText().equals("");
	}

}
