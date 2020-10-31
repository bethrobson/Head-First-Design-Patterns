package headfirst.designpatterns.command.swing;
	
import java.awt.*;
import javax.swing.*;
	
public class SwingCommandExample {
	JFrame frame;
	JPanel panel;
	
	public static void main(String[] args) {
		SwingCommandExample example = new SwingCommandExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		panel = new JPanel();

		// The GUI is the client
		// The buttons are the invokers
		JButton onButton = new JButton("On");
		JButton offButton = new JButton("Off");
		
		// The light is the receiver
		JLabel light = new JLabel("light");
		light.setOpaque(true);
		light.setBackground(Color.LIGHT_GRAY);
		
		// The lambdas (ActionListeners) are the commands & actionPerformed() method implementation in one.
		// We use addActionListener() to set the commands and code for the actionPerformed() method
		//     in the invokers (the buttons)
		// The interface that all the commands (listeners) implement is the ActionListener interface.
		// This interface has one method, actionPerformed(). 
		// This is equivalent to the execute() method. 
		// The buttons invoke the actionPerformed() method when they are clicked, which is the method
		//   we implemented in the command (the listeners) 
		// This method which executes the code to run on the receiver, the light.
		onButton.addActionListener(event -> 
			light.setBackground(Color.YELLOW)
		);
		offButton.addActionListener(event -> 
			light.setBackground(Color.LIGHT_GRAY)
		);
		// Set frame properties 
		frame.setContentPane(panel);
		panel.add(onButton);
		panel.add(light);
		panel.add(offButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 * 
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/

}
