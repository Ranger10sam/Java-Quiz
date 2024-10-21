import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Service {
    Questions[] questions = new Questions[4];
    ArrayList<String> userInput = new ArrayList<>();
    public void createQuestions(){
        questions[0] = new Questions(
                1,
                "What is the Birth year of Samprit?",
                "A. 2000",
                "B. 2001",
                "C. 2002",
                "D. 2003",
                "B"
        );
        questions[1] = new Questions(
                2,
                "What is the Birth year of Moly?",
                "A. 2000",
                "B. 2001",
                "C. 2007",
                "D. 2008",
                "D"
        );
        questions[2] = new Questions(
                3,
                "What is the Birth year of Chilli?",
                "A. 2000",
                "B. 2001",
                "C. 2023",
                "D. 2024",
                "D"
        );
        questions[3] = new Questions(
                4,
                "What is the Birth year of Kulso?",
                "A. 2000",
                "B. 2024",
                "C. 2023",
                "D. 2021",
                "B"
        );
    }
    public void displayQuestions(){

        for(Questions q : questions){
            System.out.print(q.getId()+". ");
            System.out.println(q.getQuestion());
            System.out.println("--------Options--------");
            System.out.println(q.getOption1()+" "+q.getOption2()+" "+q.getOption3()+" "+q.getOption4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Your Answer: ");
            userInput.add(sc.nextLine());
        }
    }
    public void checkScores(){
        int scores = 0;
        for(int i=0; i<questions.length; i++){
            if(Objects.equals(userInput.get(i), questions[i].getAnswer())){
                scores++;
            }
        }
        System.out.println("You have scored: "+scores);
    }
}
