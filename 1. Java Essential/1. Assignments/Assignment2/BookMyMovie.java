public class BookMyMovie {
    private int movieId;
    private int noOfTickets;
    private double discount;
    private double totalAmount;

    BookMyMovie(int movieId,int noOfTickets) {
        this.movieId = movieId;
        this.noOfTickets = noOfTickets;
    }

    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }
    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void calculateDiscount() {
        if(this.movieId==101 || this.movieId==103) {
            if(this.noOfTickets>=5 && this.noOfTickets<10) {
                this.discount = 15;
            } else if(this.noOfTickets>=10 && this.noOfTickets<15) {
                this.discount = 20;
            }
        } else if(this.movieId==102) {
            if(this.noOfTickets>=5 && this.noOfTickets<10) {
                this.discount = 10;
            } else if(this.noOfTickets>=10 && this.noOfTickets<15) {
                this.discount = 15;
            }
        }
    }

    public double calculateTicketAmount() {
        double basefare=0;
        if(this.movieId==101) {
            basefare = 120;
        } else if(this.movieId==102) {
            basefare = 170;
        } else if(this.movieId==103) {
            basefare = 150;
        }
        this.totalAmount = (basefare*noOfTickets)-(basefare*noOfTickets*(discount/100));
        return totalAmount;
    }
}