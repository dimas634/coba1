package Modul2.Tugas;

class ConcertTicketSystem {
    public static final int DEFAULT_PRICE = 50;
    private int [][]seatPrices;
    private boolean[][] seatAvailability;//encaosulate
    private int totalRows;
    private int totalCols;
    private int seatsAvailable;
    public ConcertTicketSystem(int rows, int cols){
        this.totalRows = rows;
        this.totalCols = cols;
        this.seatsAvailable = rows*cols;
        initializeSeatPricesAndAvailability();
    }

    private void initializeSeatPricesAndAvailability(){
        seatPrices = new int[totalRows][totalCols];
        seatAvailability = new boolean[totalRows][totalCols];

        for (int i=0; i<totalRows; i++){
            for (int j=0; j<totalCols; j++){
                seatPrices[i][j] = DEFAULT_PRICE; //ref DEFAULT_PRICE + getter (int const + encaps)
                getSeatAvailability()[i][j] = true;
            }
        }
    }
    public void showSeatPrice(){
        System.out.println("Seat Prices : ");
        for (int i=0; i<totalRows; i++){
            for (int j =0; j<totalCols; j++){
                System.out.println("Row " + (i+1) + ", Column " + (j+1) + ": $" + seatPrices[i][j]);
            }
        }
    }
    public void showAvailableSeats(){
        System.out.println("Available Seats : ");
        for (int i = 0; i<totalRows;i++){
            for (int j = 0; j<totalCols;j++){
                if (getSeatAvailability()[i][j]){
                    System.out.print("[ "+ (i + 1) + "," + (j + 1) + " ] ");
                }else {
                    System.out.print("[ X ]");
                }
            }
            System.out.println();
        }
    }
    public void buyTicket(int row, int col){
        if (isValidSeat(row, col)){//inline + extract ke isValidSeat
            int price = seatPrices[row-1][col-1];
            System.out.println("You have purchased a ticket at row " + row + " and column " + col + "for $" + price);
            getSeatAvailability()[row - 1][col - 1] = false;
            seatsAvailable--;
        }else {
            System.out.println("Invalid seat selection or seat is already taken.");
        }
    }

    private boolean isValidSeat(int row, int col) {
        return row >= 1 && row <= totalRows && col >= 1 && col <= totalCols && getSeatAvailability()[row - 1][col - 1];
    }

    public boolean[][] getSeatAvailability() {
        return seatAvailability;
    }
}