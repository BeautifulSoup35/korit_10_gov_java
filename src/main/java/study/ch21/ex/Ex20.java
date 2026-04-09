package study.ch21.ex;

public class Ex20 {
    public static void main(String[] args) {
//        DataService dataService = new DataService();
//        dataService.fetchData("jdbc:mysql://localhost");
//        dataService.fetchData(null);

    }
}

interface AutoCloseable {

}

class ConnectionException extends Exception{

}
class Connection implements AutoCloseable {

}
class DataService {
    private String url;
    void fetchData (String url) {
        this.url = url;
    }
}