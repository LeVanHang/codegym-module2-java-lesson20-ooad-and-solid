package depency_inversion;

public class BackEndDeveloper implements Developer{


    public void developer() {
        this.writeJava();
    }

    public void writeJava() {
        System.out.println("Writes Java Code");
    }
}
