package headfirst.designpatterns.proxy.virtualproxy;

import java.net.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> cds = new Hashtable<String, String>();

	public static void main (String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception {
		cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
		cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
		cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
		cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
		cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
		cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");

		URL initialURL = new URL((String)cds.get("Selected Ambient Works, Vol. 2"));
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem); 
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
				frame.repaint();
			});
		}

		// set up frame and menus

		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

	}

	URL getCDUrl(String name) {
		try {
			return new URL((String)cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
