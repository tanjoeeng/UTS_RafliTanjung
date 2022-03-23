package messenger;

public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "Test", "Halo!");
        std.sendMessage("Tarnished", "Maiden", "Do you accept my offer?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "Secret", "Don't tell anyone!");
        mail.sendMessage("Erdtree", "Burn", "Burned...");
        mail.disconnect();
        mail.sendMessage("Ranni", "Gift", "Elden Ring");
    }
}
