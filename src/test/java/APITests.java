import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class APITests {

    @Test
    public void firstTest(){
        ListBooks listOfBooks = given().
                when().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
                .then()
                .log().body()
                .assertThat().statusCode(200)
                .assertThat().contentType("application/json")
                .assertThat().body("books", hasSize(8))
                .assertThat().body("books[0].title",equalTo("Git Pocket Guide"))
                .extract().body().as(ListBooks.class);

        for(Books books:listOfBooks.getBooks()){
            System.out.println("Title of the book is: "+books.getTitle());
        }
    }

    @Test
    public void secondTest(){
        PostCodeDetails postCodeDetails = given()
                .when().get("http://zippopotam.us/IN/517325")
                .then().log().body()
                .assertThat().statusCode(200)
                .extract().body().as(PostCodeDetails.class);

        System.out.println(postCodeDetails.getCountry());

        for(Places places : postCodeDetails.getPlaces()){
            System.out.println("place name is : "+places.getPlacename());
        }
    }

    @Test()
    public void thirdTest(){

        List<Places> places = new ArrayList<>();

        // Create Place objects using the constructor
        Places place1 = new Places("Bangalore", "78.5", "Andhra Pradesh", "AP", "13.55");
        places.add(place1);

        PostCodeDetails postCodeDetails = new PostCodeDetails("517325","India","IN", (List<Places>) places);
        for(Places pl: postCodeDetails.getPlaces()){
            System.out.println(pl.getPlacename());
        }

    }
}
