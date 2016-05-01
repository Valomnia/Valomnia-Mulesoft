package jmsconsumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;


// TODO: Auto-generated Javadoc
/**
 * The Class Consumer1.
 */
public class Consumer {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Consumer consumerTool = new Consumer();
		consumerTool.run();
		
	}
	
	/**
	 * Run.
	 */
	public void run() {
        try {
        	String url="tcp://localhost:61616";
        	String subject="Myqueue";
        	ConnectionFactory cf = new ActiveMQConnectionFactory(url);
    		Connection conn = null;
    		Session session = null;
    		conn = cf.createConnection();
    		session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
    		Destination destination = new ActiveMQTopic(subject);
    		MessageConsumer consumer = session.createConsumer(destination);
    		conn.start();
    		Message message = consumer.receive();
    		TextMessage textMessage = (TextMessage) message;
    		System.out.println("GOT A MESSAGE: " + textMessage.getText());
    		conn.stop();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}