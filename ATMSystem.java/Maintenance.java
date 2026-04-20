public class Maintenance {
    private int maintenanceId;
    private String type;

    public Maintenance(int maintenanceId, String type) {
        this.maintenanceId = maintenanceId;
        this.type = type;
    }
    public void refillCash(double amount) {
        System.out.println("ATM Cash Refill:" + amount);
    }
    public void refillPaper() {
        System.out.println("ATM Paper Refilled");
    }
    public void upgradeHardware() {
        System.out.println("ATM Hardware upgraded");
    }
    public void upgradeSoftware() {
        System.out.println("ATM Software upgraded");
    }
    public void showMaintenance() {
        System.out.println("Maintenance ID:" + maintenanceId);
        System.out.println("Type:" + type);
    }
    public static void main(String[] args) {
        Maintenance m = new Maintenance(501, "Cash Refill");
        m.refillCash(50000);
    }
}
