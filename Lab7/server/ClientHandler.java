package Lab7.server;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class ClientHandler extends Thread implements Runnable {

	private Socket clientDialog;

	ClientHandler(Socket client) { this.clientDialog = client; }

	@Override
	public void run() {
		try (BufferedReader in = new BufferedReader(
					new InputStreamReader(clientDialog.getInputStream()));

			PrintWriter out =  new PrintWriter(
					clientDialog.getOutputStream(), true))
			{
			
			String urlStr = in.readLine();
			System.out.println("Accepted request: " + urlStr);

			urlStr = urlStr.substring(urlStr.indexOf(' ')+1, urlStr.length()-8);
			System.out.println("URL: " + urlStr);

			URLConnection urlConnection = new URL(urlStr).openConnection();

			BufferedReader webReader = new BufferedReader(
						new InputStreamReader(urlConnection.getInputStream()));
			String webPage;

			while ((webPage = webReader.readLine()) != null)
			{
				out.println(webPage);
				out.flush();
			}
			out.println("End!");

			in.close();
			out.close();
			clientDialog.close();

			System.out.println("Closing connections & channels - DONE.");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
