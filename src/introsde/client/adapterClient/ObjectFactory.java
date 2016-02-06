
package introsde.client.adapterClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.client.adapterClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSong_QNAME = new QName("http://ws.adapter.introsde/", "getSong");
    private final static QName _GetSongResponse_QNAME = new QName("http://ws.adapter.introsde/", "getSongResponse");
    private final static QName _GetQuoteResponse_QNAME = new QName("http://ws.adapter.introsde/", "getQuoteResponse");
    private final static QName _GetQuote_QNAME = new QName("http://ws.adapter.introsde/", "getQuote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.client.adapterClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link GetSong }
     * 
     */
    public GetSong createGetSong() {
        return new GetSong();
    }

    /**
     * Create an instance of {@link GetSongResponse }
     * 
     */
    public GetSongResponse createGetSongResponse() {
        return new GetSongResponse();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getSong")
    public JAXBElement<GetSong> createGetSong(GetSong value) {
        return new JAXBElement<GetSong>(_GetSong_QNAME, GetSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getSongResponse")
    public JAXBElement<GetSongResponse> createGetSongResponse(GetSongResponse value) {
        return new JAXBElement<GetSongResponse>(_GetSongResponse_QNAME, GetSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getQuoteResponse")
    public JAXBElement<GetQuoteResponse> createGetQuoteResponse(GetQuoteResponse value) {
        return new JAXBElement<GetQuoteResponse>(_GetQuoteResponse_QNAME, GetQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getQuote")
    public JAXBElement<GetQuote> createGetQuote(GetQuote value) {
        return new JAXBElement<GetQuote>(_GetQuote_QNAME, GetQuote.class, null, value);
    }

}
