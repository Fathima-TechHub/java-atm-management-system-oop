public class ATMTechnician {
    private int technicianId;
    private String name;

    public ATMTechnician(int technicianId, String name) {
        this.technicianId = technicianId;
        this.name = name;
    }
    public void PerformMaintenance(){
        System.out.println("Maintenace is being proceed by:" + name);
    }
    public void RepairATM(){
        System.out.println("ATM Repaired by:" + name);
    }
    public void showTechnician(){
        System.out.println("TechnicianId:"+ technicianId);
        System.out.println("Technician Name:" + name);
    }
    public static void main(String[] args) {
        ATMTechnician tech1 = new ATMTechnician(301, "Shazard");
tech1.showTechnician();
tech1.PerformMaintenance();
tech1.RepairATM();
    }
}
