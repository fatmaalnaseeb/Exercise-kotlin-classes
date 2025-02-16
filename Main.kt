//Part 1: Define a Class Without a Constructor
class Book(){
    var title : String =""
    var author : String= ""
    var yearPublished : Int = 0

    fun getBookInfo(){
        println("Title by Author $yearPublished")
    }


}
//Part 2: Add a Constructor
class Book2(val title : String,val author : String, val yearPublished : Int){
    fun getBookInfo(){
        println("Title by Author $yearPublished")
    }

}
//Challenge
class Book3(){
    var title : String =""
    var author : String= ""
    var yearPublished : Int = 0
    var genre: String = ""
    fun getBookInfo() {
        println("Title: $title, Author: $author, Year Published: $yearPublished, Genre: $genre")
    }

}


fun main(){
    //1
    val book = Book()
    book.title = "coded"
    book.author = "fatma"
    book.yearPublished = 2002
    book.getBookInfo()

    //1
    val book2 = Book2("coded","fatma",2002)
    book2.getBookInfo()

    //Challenge
    var book3=Book3()
    book3.title = "coded"
    book3.author = "fatma"
    book3.yearPublished = 2002
    book3.genre = "Fiction"
    book3.getBookInfo()





}




