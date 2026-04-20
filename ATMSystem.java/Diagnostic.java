public class Diagnostic {
    private int diagnosticId;
    private String mode;
     
    public Diagnostic(int diagnosticId, String mode){
        this.diagnosticId = diagnosticId;
        this.mode = mode;

    }
    public void runDiagnostic() {
        System.out.println("Running Diagnostics in:" + mode + " Mode for ATM.");
    }
public void showDiagnostic(){
    System.out.println("DiagnosticId:" + diagnosticId);
    System.out.println("Mode:" + mode);
}
public static void main(String[] args) {
    Diagnostic d1 = new Diagnostic(501, "Full ");
    d1.showDiagnostic();
    d1.runDiagnostic();
}

}