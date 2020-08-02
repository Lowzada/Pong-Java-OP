import javax.swing.JFrame;


public class Pong extends JFrame{
	private final static String PONGWINDOW = "Pong";
	private final static int HEIGHTWINDOW = 800;
	private final static int WEIGHTWINDOW = 600;
	public Pong() {
    	setTitle(PONGWINDOW);
    	setSize(HEIGHTWINDOW, WEIGHTWINDOW);
    	setResizable(false);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	add(new PongPanel());
	}
	
	

	public static void main(String[] args) {
		new Pong();
	}

}
