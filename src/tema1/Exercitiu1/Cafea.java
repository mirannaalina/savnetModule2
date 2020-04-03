package tema1.Exercitiu1;

import java.util.HashSet;
import java.util.Set;

public class Cafea {

    private Set<Ingredient> ingrediente;


    public Cafea(Ingredient... ingrediente ) {
        this.ingrediente= new HashSet<Ingredient>(ingrediente.length);

        if(ingrediente!= null){
            for(Ingredient ingredient : ingrediente){
                this.ingrediente.add(ingredient);
            }
        }
    }

    @Override
    public String toString() {
        return "Cafea{" +
                "ingrediente=" + ingrediente +
                '}';
    }
}
