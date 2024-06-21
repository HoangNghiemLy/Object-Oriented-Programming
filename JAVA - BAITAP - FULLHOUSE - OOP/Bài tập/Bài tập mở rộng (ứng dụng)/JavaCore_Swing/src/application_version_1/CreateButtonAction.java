package application_version_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateButtonAction implements ActionListener {
	
	private Application app;
	
	public CreateButtonAction(Application app) {
		this.app = app;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.createValidate()) {
			int id = Integer.parseInt(this.app.getIdTextField().getText());
			String name = this.app.getNameTextField().getText();
			double avg = Double.parseDouble(this.app.getAvgTextField().getText());
			this.app.getSm().create(new Student(id, name, avg));
		}else {
			System.err.println("Not enough information!");
		}
	}
	
	private boolean createValidate() {
		return !this.app.getIdTextField().getText().equals("") && 
			   !this.app.getNameTextField().getText().equals("") && 
			   !this.app.getAvgTextField().getText().equals("");
	}

}
