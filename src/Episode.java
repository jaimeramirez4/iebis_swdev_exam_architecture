public class Episode {

    int i; //lenght of the episode in seconds
    String nameEpisode; //name of the episode
    /*
     * constructor
     */
    public Episode(int i, String nameEpisode) {
        this.i = i;
        this.nameEpisode = nameEpisode;
    }

    public String getNameEpisode( ) {
        return nameEpisode;
    }

}