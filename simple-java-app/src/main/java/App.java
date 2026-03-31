public class App {

    public String getMessage() {
        return "Hello from Java CI/CD Pipeline!";
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println("Java CI/CD Application Started...");
        while (true) {
            Thread.sleep(5000);
            System.out.println(app.getMessage());
        }
    }
}
