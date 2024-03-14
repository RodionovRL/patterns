package visitor;

/**
 * Посещаемый
 */
public interface Animal {
    void accept(AnimalOperation operation);
}
