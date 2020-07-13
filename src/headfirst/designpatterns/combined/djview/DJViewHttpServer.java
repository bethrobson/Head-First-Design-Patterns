package headfirst.designpatterns.combined.djview;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class DJViewHttpServer {
 
	public static void main(String[] args) {
		
		try {
			System.out.println("DJView Http Server Running");
			
			BeatModel beatModel = new BeatModel();
			beatModel.initialize();
			// create a server on port 8080, with a backlog queue allowed of size 0 (ie, no queue)
			// most people will already have a web server running on 80, so we're using 8080
			HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);
			server.createContext("/djview", new DJViewHttpHandler(beatModel));
			server.start();
			System.out.println("DJView Server is running at http://localhost:8080/djview");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
