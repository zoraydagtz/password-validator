/**
 * .matches() Metodo de String que verifica si cumple un patrón
 * .* -> "Cualquier carácter, cero o más veces"
 * [A-Z] -> "Una letra mayúscula de A a Z"
 * [0-9] -> "Un dígito del 0 al 9"
 * [!@#$...]" -> Uno de estos caracteres especiales"
 *
 * "Cuando una prueba usa assertTrue/assertFalse, tu metodo debe retornar boolean.
 * Analiza qué hace que cada prueba pase o falle para deducir las reglas."
 */

public class PasswordValidator {
    public boolean isValid(String password){

        if (password.length() < 7) {
            return false;
        }
        // Mayuscula
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        // Número
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        // Caracter especial
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return false;
        }
        return true;
    }
}
