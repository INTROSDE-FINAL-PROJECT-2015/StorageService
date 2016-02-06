package introsde.ws;

import introsde.client.adapterClient.*;
import introsde.models.*;

import java.util.List;

public class AdapterClient{
  public static void main(String[] args) {
    AdapterServiceImplService adapterServiceImpl = new AdapterServiceImplService();
    AdapterService adapterService = adapterServiceImpl.getAdapterServiceImplPort();
    List<String> song = adapterService.getSong();
    List<String> quote = adapterService.getQuote();

    Song songObject = new Song(song);
    Quote quoteObject = new Quote(quote);

    System.out.println(songObject);
    System.out.println(quoteObject);

    //System.out.println("Song:" + "\n\t" + song.get(0) + "\n\t" + song.get(1));
    //System.out.println("Quote:" + "\n\t" + quote.get(0) + "\n\t" + quote.get(1));
  }
}
