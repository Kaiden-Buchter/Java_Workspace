import java.util.ArrayList;

// Array Quiz #1
// public class Student {
//     private int[] quizGrades;

//     public Student() {
//         quizGrades = new int[10];
//         for (int i = 0; i < quizGrades.length; i++) {
//             quizGrades[i] = 100;
//         }
//     }

//     public int[] getGrades() {
//         return quizGrades;
//     }

//     public Static void main(String[] args) {
//         Student kaiden = new Student();
//     }
// }

// ArrayList Quiz #1
// public class Student {
//     private ArrayList<Integer> scores;

//     public Student(int score, int num) {
//         scores = new ArrayList<Integer>();
//         for (int i = 0; i < num; i++) {
//             scores.add(score);
//         }
//     }

//     public boolean insertScore(int pos, int newScore) {
//         if (pos > scores.size() || pos < 0)
//             return false;

//         scores.add(pos, newScore);
//         return true;
//     }

//     public ArrayList<Integer> getScores() {
//         return scores;
//     }

//     public static void main(String[] args) {
//         Student kaiden = new Student(99, 10);
//         System.out.println(kaiden.getScores());
//         System.out.println(kaiden.insertScore(5, 100));
//         System.out.println(kaiden.getScores());
//     } 
// }