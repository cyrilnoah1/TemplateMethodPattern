package template;

/**
 * Class for Upma to be made using rice flour.
 */
public class RiceFlourUpma extends UpmaTemplateMethodClass {
    boolean roastMainIngredient = false;

    @Override
    protected void collectIngredients() {
        System.out.println("Collecting ingredients: Rice flour and other spices.");
    }

    @Override
    public boolean shouldRoastMainIngredient() {
        return roastMainIngredient;
    }

    /**
     * Deciding whether the main ingredient needs to be roased or not.
     * @param roastMainIngredient (Should or shouldn't)
     */
    public void setRoastMainIngredient(boolean roastMainIngredient) {
        this.roastMainIngredient = roastMainIngredient;
    }
}
