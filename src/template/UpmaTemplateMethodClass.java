package template;

/**
 * Parent class containing the Template Method for making
 * Upma using different ingredients, but using similar
 * steps for the preparation.
 */
public abstract class UpmaTemplateMethodClass {

    /**
     * Template Method to prepare any presently
     * available type of Upma.
     */
    public final void prepareUpma() {
        // Step-by-step process.
        collectIngredients();
        if (shouldRoastMainIngredient()) {
            roastMainIngredient();
        }
        fryIngredientsInOil();
        marinateInWater();
        waitTillPrepared();
        serveUpma();
    }

    /**
     * Collect respective ingredients based
     * on the type of Upma to be prepared.
     */
    protected abstract void collectIngredients();

    /**
     * Roast the main ingredient.
     */
    private void roastMainIngredient() {
        System.out.println("Roasting the main ingredient.");
    }

    /**
     * Frying the ingredients in oil.
     */
    private void fryIngredientsInOil() {
        System.out.println("Frying the ingredients in oil.");
    }

    /**
     * Marinating the fried ingredients.
     */
    private void marinateInWater() {
        System.out.println("Marinating the fried ingredients.");
    }

    /**
     * Wait till the Upma is properly cooked before serving.
     */
    private void waitTillPrepared() {
        System.out.println("Waiting till the Upma is prepared.");
    }

    /**
     * Server the prepared Upma.
     */
    private void serveUpma() {
        System.out.println("Serving the yummy Upma.");
    }

    /**
     * Creating a hook to make roasting of main ingredient
     * optional.
     *
     * @return boolean to choose if the main ingredient is to be roasted.
     */
    public boolean shouldRoastMainIngredient() {
        return true;
    }
}
