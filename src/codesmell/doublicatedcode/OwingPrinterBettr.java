package codesmell.doublicatedcode;

public class OwingPrinterBettr {

    void printOwing() {
        printBanner();

        // print details.
        printDetails();
    }

    private void printDetails() {
        System.out.println("name: " + getNname());
        System.out.println("amount: " + getOutstanding());
    }

    private void printBanner() {
        // print some general Banner information
    }

    private String getNname() {
        // retrieves th name from somewhere
        return "name";
    }

    private Integer getOutstanding() {
        // calculate amount
        return 42;
    }

}
