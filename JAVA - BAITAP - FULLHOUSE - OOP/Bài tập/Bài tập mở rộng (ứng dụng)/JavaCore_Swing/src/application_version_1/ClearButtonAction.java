package application_version_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClearButtonAction implements ActionListener {
	
	private Application app;
	
	public ClearButtonAction(Application app) {
		this.app = app;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.app.getIdTextField().setText("");
		this.app.getNameTextField().setText("");
		this.app.getAvgTextField().setText("");
	}

}
