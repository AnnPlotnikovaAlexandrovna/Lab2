package Author;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Anna", "anna.plotnikova@yandex.ru", 'W');
        System.out.println(a1);
        a1.setEmail("anna.plotnikovay@yandex.ru");
        System.out.println(a1);
    }
}
