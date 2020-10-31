package headfirst.designpatterns.proxy.virtualproxy;

import java.net.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("Album Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> albums = new Hashtable<String, String>();

	public static void main (String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception {
		albums.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
		albums.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
		albums.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
		albums.put("MCMXC a.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
		albums.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
		albums.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");

		URL initialURL = new URL((String)albums.get("Selected Ambient Works, Vol. 2"));
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite Albums");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = albums.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem); 
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
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

	URL getAlbumUrl(String name) {
		try {
			return new URL((String)albums.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
