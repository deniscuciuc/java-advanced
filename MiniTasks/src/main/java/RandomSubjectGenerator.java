import java.util.Random;

public class RandomSubjectGenerator {

    private final String[] MEMBERS = {"Bolun Andrei", "Denis Cuciuc", "Cucicovscaia Daria", "Rusu Marcel"};
    private final String[] SUBJECTS = {"KISS", "DRY", "YAGNI", "Prototype", "MVP"};
    private final Random random = new Random();


    public void generate() {
        shuffleArray(MEMBERS);
        shuffleArray(SUBJECTS);

        System.out.println("Members:");
        displayArray(MEMBERS);

        System.out.println("Subjects:");
        displayArray(SUBJECTS);
    }

    void displayArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ". " + array[i]);
        }
        System.out.println();
    }

    void shuffleArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomFirstIndex;
            int randomSecondIndex;
            do {
                randomFirstIndex = random.nextInt(array.length);
                randomSecondIndex = random.nextInt(array.length);
            } while (randomFirstIndex == randomSecondIndex);
            swapByIndexesAndArray(array, randomFirstIndex, randomSecondIndex);
        }
    }

    void swapByIndexesAndArray(String[] array, int firstIndex, int secondIndex) {
        String temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
