package sockets.improved_simple_chat_client_and_server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author chanst
 *
 *Chat program meant to be ran on the client side
 *@Variables
 *incoming - Just an area that displays plain text on the GUI
 *<br>outgoing - Object for editing a single line of text before the messages is being sent out. Think of it as the text editor that doesn't do anything but records what you write. 
 *<br>reader - This is a BufferedReader object which is efficient when reading large amounts of data. This object readers character data (Text)  
 *<br>writer - This is a PrintWriter object for writing character data (Text) to somewhere
 *<br>sock - This is a Socket, here we define the IP address and the port number of the Server that we somehow knew beforehand and attempt to connect to it.
 */

public class SimpleChatClient {
	
	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;

	public static void main(String[] args) {
		SimpleChatClient client = new SimpleChatClient();
		client.go();
	}

	/**
	 * The main code for calling all methods and classes in order to create this chat program. 
	 * Code also creates a separate thread for incoming messages and everything else is on the outgoing messages.
	 * @Variables frame - a JFrame object
	 *<br>mainPanel - Looks like the entire chat client program container. After all the chat program compartments are defined we attach it here. 
	 *<br>outgoing - global object that was already defined. Just setting more variables here. 
	 *<br>sendButton - Just a button that is created. addActionListener() method is what actually execute some kind of action when the button is being clicked on. {SendButtonListener}
	 *<br>
	 */
	public void go() {
		JFrame frame = new JFrame("Ludicrously simple chat client");
		JPanel mainPanel = new JPanel();
		
		incoming = new JTextArea(15, 50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(true);
		
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		outgoing = new JTextField(20);
		
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());

		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		
		setUpNetworking();
		
		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
		
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		frame.setSize(800,500);
		frame.setVisible(true);
	} // close go

	/**
	 * Class for starting the initial connection with the designated server and declaring the "reader" and "writer" objects which associates with the socket.
	 * @Variables writer - A PrintWriter object which writes to the socket. 
	 * <br> reader - a InputStreamReader which reads from the socket.  
	 */
	public void setUpNetworking() {
		try {
			sock = new Socket("127.0.0.1", 5020);
			writer = new PrintWriter(sock.getOutputStream()); //Write character data to the socket
			
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader); //Receives character data to the socket. 
			
			System.out.println("Networking Established");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	} // close setUpNetworking
	
	
	
	
	/**
	 * 
	 *Defines the action that will be performed when the "send" button is being clicked on. In thise case, it will read all the text that were written on outgoing, and then
	 *sends it to the "writer" variable which is a PrintWriter that is connected to the socket. 
	 */
	public class SendButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				writer.println(outgoing.getText());
				writer.flush();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocusInWindow();
		}

	}//close SendButtonListener

	
	

	/**
	 * 
	 *The particular process that will be multithreaded. In this case, reading a message and appending it to the "incoming" object which is the chat box. 
	 */
	public class IncomingReader implements Runnable {
		String message;
		@Override
		public void run() {
			try {
				while ((message = reader.readLine()) != null) {
					System.out.println("read " + message);
					incoming.append(message + "\n");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

	} //Close Runnable

}
