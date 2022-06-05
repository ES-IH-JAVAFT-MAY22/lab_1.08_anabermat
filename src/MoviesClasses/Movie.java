package MoviesClasses;

public class Movie extends Video{
    String nextInSeries;
    int numberOfFilmsInSeries;

    public Movie(String title, int rating, double duration, String nextInSeries, int numberOfFilmsInSeries) {
        super(title, rating, duration);
        this.nextInSeries = nextInSeries;
        this.numberOfFilmsInSeries = numberOfFilmsInSeries;
    }

    public String getNextInSeries() {
        return nextInSeries;
    }

    public void setNextInSeries(String nextInSeries) {
        this.nextInSeries = nextInSeries;
    }

    public int getNumberOfFilmsInSeries() {
        return numberOfFilmsInSeries;
    }

    public void setNumberOfFilmsInSeries(int numberOfFilmsInSeries) {
        this.numberOfFilmsInSeries = numberOfFilmsInSeries;
    }
}
