public class NotificationTest {
    public static void main(String[] args) {
        // Basic Email Notification
        Notifier emailNotifier = new EmailNotifier();

        // Email + SMS
        Notifier emailSmsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Email + SMS + Slack
        Notifier fullNotifier = new SlackNotifierDecorator(emailSmsNotifier);

        System.out.println("Notification via Email:");
        emailNotifier.send("Server down");

        System.out.println("\nNotification via Email + SMS:");
        emailSmsNotifier.send("High CPU usage");

        System.out.println("\nNotification via Email + SMS + Slack:");
        fullNotifier.send("Security alert");
    }
}
