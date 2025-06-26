public class AuditService {
    private Logger logger;

    public AuditService(Logger logger) {
        this.logger = logger;
    }

    public void performAction() {
        logger.log("Action performed");
    }
}
