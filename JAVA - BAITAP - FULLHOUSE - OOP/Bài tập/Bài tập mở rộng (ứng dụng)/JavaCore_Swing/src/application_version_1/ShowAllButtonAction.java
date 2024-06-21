package application_version_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ShowAllButtonAction implements ActionListener {
	
	private Application app;
	
	public ShowAllButtonAction(Application app) {
		this.app = app;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.app.getSm().showAll();
	}

}
