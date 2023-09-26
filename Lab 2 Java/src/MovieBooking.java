import java.util.HashMap;
import java.util.Map;

class MovieTicket implements Cloneable {
    private String movieName;
    private String theaterName;
    private String showTime;
    private double price;

    public MovieTicket(String movieName, String theaterName, String showTime, double price) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.showTime = showTime;
        this.price = price;
    }

    public MovieTicket clone() {
        try {
            return (MovieTicket) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "movieName='" + movieName + '\'' +
                ", theaterName='" + theaterName + '\'' +
                ", showTime='" + showTime + '\'' +
                ", price=" + price +
                '}';
    }
}

class TicketRegistry {
    private Map<String, MovieTicket> ticketPrototypes = new HashMap<>();

    public void addTicketPrototype(String key, MovieTicket ticket) {
        ticketPrototypes.put(key, ticket);
    }

    public MovieTicket getTicketClone(String key) {
        MovieTicket ticket = ticketPrototypes.get(key);
        if (ticket != null) {
            return ticket.clone();
        }
        return null;
    }
}

