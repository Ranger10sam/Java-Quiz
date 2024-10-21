public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Service service = new Service();
        service.createQuestions();
        service.displayQuestions();
        service.checkScores();

    }
}