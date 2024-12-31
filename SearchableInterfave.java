interface Searchable {
 boolean search(String keyword);
}

  class Document implements Searchable {
        private String content;

    public Document(String content) {
     this.content = content;
   }

 public boolean search(String keyword) {
     return content.contains(keyword);
    }
   }

class WebPage implements Searchable {
 private String content;

 public WebPage(String content) {
     this.content = content;
 }

 public boolean search(String keyword) {
     return content.contains(keyword);
 }
}

public class SearchableInterface {
 public static void main(String[] args) {
	 
     Searchable document = new Document("This is a text document.");
     Searchable webPage = new WebPage("Learn Java programming online.");

     System.out.println("Document contains 'text': " + document.search("text"));
     System.out.println("WebPage contains 'Java': " + webPage.search("Java"));
     System.out.println("Document contains 'Java': " + document.search("Java"));
 }
}
