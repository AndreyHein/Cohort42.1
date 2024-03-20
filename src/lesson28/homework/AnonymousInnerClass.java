package lesson28.homework;

public class AnonymousInnerClass {

    public static void main(String[] args) {

        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring of general indicators has started!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Bug tracking monitoring has started!");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security monitoring has started!");
            }
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
