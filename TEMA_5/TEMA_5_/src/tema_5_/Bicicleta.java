/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_5_;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    // Atributos /controles de acceso
    int ruedas; // friendly: accesible dentro del mismo paquete
    protected String manillar; // accesible desde subclases
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;

    // Atributo estático que pertenece a la clase (no al objeto)
    private static int numBicicletas = 0;

    // Constructores
    public Bicicleta() {
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        incrementarNumBicicletas();
    }

    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        incrementarNumBicicletas();
    }

    // Getters y Setters
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    public String getManillar() {
        return this.manillar;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getFrenos() {
        return this.frenos;
    }

    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }

    public boolean getEstaPedaleando() {
        return this.estaPedaleando;
    }

    // Métodos
    public void acelerar() {
        System.out.println("¡Acelerando!");
    }

    private static void incrementarNumBicicletas() {
        numBicicletas++;
    }

    public static int getNumBicicletas() {
        return numBicicletas;
    }

    @Override
    public String toString() {
        return "Mi bicicleta tiene " + this.ruedas + " ruedas, un manillar " + this.manillar +
               ", pedales " + this.pedales + ", frenos " + this.frenos +
               " y ahora... ¿está pedaleando? " + this.estaPedaleando;
    }
}