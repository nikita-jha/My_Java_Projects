public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;

        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
    }

    public int addToner(int tonerAmount) {
        if(tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }

    }

    public int printPages(int pages) { //pages are the number of actual physical pieces of paper going through the printer
        int pagesToPrint = pages;
        if(this.duplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in Duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
