package messenger;

public class MailMessenger implements Messenger{
    boolean isSuccess, isConnectedToServer;
    
    void connect(){
        isConnectedToServer = true;
        System.out.println("Connected to Server\n");
    }
    
    void disconnect(){
        isConnectedToServer = false;
        System.out.println("Disconnected from Server\n");
    }
    
    public void sendMessage(String receiver, String subject, String messege) {
        System.out.println("Receiver            : "+receiver);
        System.out.println("Subject             : "+subject);
        System.out.println("Message             : "+messege);
        System.out.println("Status Server       : "+isConnectedToServer);
        
        if (isConnectedToServer == true) {
            if (receiver == ""){
                isSuccess = false;
                System.out.println("Status Message      : "+isSuccess);
                System.out.println("Mail not sent.\n");
            } else {
                isSuccess = true;
                System.out.println("Status Message      : "+isSuccess);
                System.out.println("Mail sent.\n");
            }
        } else {
            System.out.println("Mail not sent. Please connect to the server first.\n");
        }
    }
}
