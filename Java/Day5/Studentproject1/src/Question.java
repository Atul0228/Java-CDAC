public class Question {
    int number;
    String text;
    String[] options = new String[4];
    int answer;

    public Question(int number, String text, String opt1, String opt2, String opt3, String opt4, int answer) {
    	 this.number = number;
         this.text = text;
         this.options[0] = opt1;
         this.options[1] = opt2;
         this.options[2] = opt3;
         this.options[3] = opt4;
         this.answer = answer;
    }

    public void display() {
        System.out.println("Q" + number + ": " + text);
        for (int i = 0; i < options.length; i++) {
            System.out.println("  " + (i + 1) + ". " + options[i]);
        }
        System.out.println("The Answer is: " + answer);
    }
}
