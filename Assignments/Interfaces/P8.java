public class P8 {
    public static void main(String[] args) {
        Document d = new Document("This is the string in which keyword is to found!");

        d.search("in");
    }
}

interface Searchable {
    public void search(String keyword);
}

class Document implements Searchable {

    String text;

    Document() {

    }

    Document(String text) {
        this.text = text;
    }

    @Override
    public void search(String keyword) {
        String[] arr = text.trim().toLowerCase().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(keyword)) {
                System.out.printf("The Keyword :--> %s , has been found in the String.\n", keyword);
                return;
            }
        }
        System.out.printf("The Keyword %s NOT FOUNDED!\n", keyword);

    }
}