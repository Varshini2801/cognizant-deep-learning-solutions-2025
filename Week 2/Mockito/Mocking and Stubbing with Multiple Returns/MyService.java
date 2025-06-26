public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String checkStatus() {
        return api.fetchStatus();
    }
}
