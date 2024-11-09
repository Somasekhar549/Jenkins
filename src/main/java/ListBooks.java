import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListBooks {

    private List<Books> books;

    @JsonProperty("books")
    public List<Books> getBooks() {
        return books;
    }

    @JsonProperty("books")
    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
