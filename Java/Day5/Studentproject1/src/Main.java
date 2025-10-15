public class Main {
    public static void main(String[] args) {
        Question q1 = new Question(1, "What is Java?", "Language", "Coffee", "Island", "None", 1);
        Question q2 = new Question(2, "Capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", 2);
        Question q3= new Question(3, "Capital of maharastra", "Mumbai","Pune","Nashik","Nagpur",1 );
        Student1 test = new Student1(101, "General Knowledge", "2025-10-06");
        test.addQuestion(q1);
        test.addQuestion(q2);
        test.addQuestion(q3);
        Student1.addTest(test);
        Student1.displayAllTests();
    }
}
