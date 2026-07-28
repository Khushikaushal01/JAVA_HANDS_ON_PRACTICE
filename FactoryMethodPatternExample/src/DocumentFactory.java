public abstract class DocumentFactory {
    
    public abstract Document createDocument();

    
    public Document openDocument() {
        Document doc = createDocument();
        doc.open();
        return doc;
    }
}
