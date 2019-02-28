package testJava;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Calculs {


    private final int operande1;
    private final int operande2;

    public Calculs(int operande1, int operande2) {

        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    public int multiplier() {
        return operande1 * operande2;
    }

    public int additionner() {
        return operande1 + operande2;
    }

    public int diviser() {
        return operande1 / operande2;
    }

    public int soustraire() {
        return operande1 - operande2;
    }
}
