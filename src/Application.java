import java.awt.Frame;

public class Application extends Frame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		
		this.add(vue);
		this.pack();
		this.setVisible(true);
		
		 
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		        public void windowClosing(java.awt.event.WindowEvent evt) {
		                dispose();
		                System.exit(0);
		        } 
		} );

	}

}
