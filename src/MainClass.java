import template.RiceFlourUpma;
import template.SemiyaUpma;

/**
 * Class containing the main method.
 */
public class MainClass {

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String args[]) {
        // Preparing Upma.
        upmaPreparationProcess();
    }

    /**
     * Preparing required type of Upma.
     */
    private static void upmaPreparationProcess() {
        // Preparing Rice Flour Upma.
        System.out.println("Preparing Rice Flour Upma:\n");
        RiceFlourUpma riceFlourUpma = new RiceFlourUpma();
        riceFlourUpma.setRoastMainIngredient(false);
        riceFlourUpma.prepareUpma();

        // Preparing Semiya Upma.
        System.out.println("\nPreparing Semiya Upma:\n");
        SemiyaUpma semiyaUpma = new SemiyaUpma();
        semiyaUpma.setRoastMainIngredient(true);
        semiyaUpma.prepareUpma();
    }
}
