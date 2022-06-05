package MoviesClasses;

public class TvSeries extends Video{
    int seasonNumber;
    int chapterNumber;

    public TvSeries(String title, int rating, double duration, int seasonNumber, int chapterNumber) {
        super(title, rating, duration);
        this.seasonNumber = seasonNumber;
        this.chapterNumber = chapterNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }
}
