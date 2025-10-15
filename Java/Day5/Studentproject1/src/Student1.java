import java.util.ArrayList;

public class Student1 {
    int testId;
    String testName;
    String testDate;
    ArrayList<Question> questions = new ArrayList<>();

    // Each student can store up to 10 tests
    static final int MAX_TESTS = 10;
    static Student1[] studentTests = new Student1[MAX_TESTS];
    static int testCount = 0;

    public Student1(int testId, String testName, String testDate) {
        this.testId = testId;
        this.testName = testName;
        this.testDate = testDate;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void displayTest() {
        System.out.println("Test ID: " + testId);
        System.out.println("Test Name: " + testName);
        System.out.println("Date: " + testDate);
        for (Question q : questions) {
            q.display();
        }
    }

    public static void addTest(Student1 t) {
        if (testCount < MAX_TESTS) {
            studentTests[testCount++] = t;
        } else {
            System.out.println("Cannot store more than 10 tests for this student.");
        }
    }

    public static void displayAllTests() {
        for (int i = 0; i < testCount; i++) {
            studentTests[i].displayTest();
        }
    }
}
