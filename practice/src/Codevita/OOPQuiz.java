package Codevita;

import java.io.*;
import java.util.*;

class Question {
    String question;
    String[] options;
    int correctIndex;

    Question(String question, String[] options, int correctIndex) {
        this.question = question;
        this.options = options;
        this.correctIndex = correctIndex;
    }
}

public class OOPQuiz {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Map<String, List<Question>> levels = new HashMap<>();
        levels.put("easy", loadQuestions("questions/easy.txt"));
        levels.put("medium", loadQuestions("medium.txt"));
        levels.put("hard", loadQuestions("hard.txt"));

        System.out.println("Welcome to Java OOP Quiz!");
        System.out.println("Choose level: easy / medium / hard");
        String level = sc.nextLine().trim().toLowerCase();

        if (!levels.containsKey(level)) {
            System.out.println("Invalid level chosen.");
            return;
        }

        List<Question> questions = new ArrayList<>(levels.get(level));
        Collections.shuffle(questions); // randomize questions

        System.out.print("How many questions do you want to answer? (1-" + questions.size() + "): ");
        int numQ = Integer.parseInt(sc.nextLine().trim());
        numQ = Math.max(1, Math.min(numQ, questions.size()));

        int score = 0;

        for (int i = 0; i < numQ; i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ". " + q.question);

            List<Integer> order = Arrays.asList(0, 1, 2, 3);
            Collections.shuffle(order);
            int correctPos = -1;
            for (int j = 0; j < 4; j++) {
                int oi = order.get(j);
                if (oi == q.correctIndex) correctPos = j;
                System.out.println((j + 1) + ". " + q.options[oi]);
            }

            System.out.print("Your answer (1-4): ");
            int ans;
            try { ans = Integer.parseInt(sc.nextLine().trim()) - 1; } catch (Exception e) { ans = -1; }
            if (ans == correctPos) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong. Correct answer: " + q.options[q.correctIndex]);
            }
        }

        System.out.println("\nYour Score: " + score + "/" + numQ);
    }

    private static List<Question> loadQuestions(String filename) throws Exception {
        List<Question> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split("\\|");
                if (parts.length < 6) continue;
                String question = parts[0];
                String[] options = Arrays.copyOfRange(parts, 1, 5);
                int correct = Integer.parseInt(parts[5].trim());
                list.add(new Question(question, options, correct));
            }
        }
        return list;
    }
}
