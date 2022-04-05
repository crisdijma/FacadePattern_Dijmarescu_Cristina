public class Pisica implements Animal{

    //Clasa pisica care implementeaza interfata Animal si descrie o pisica si cate grame de mancare consuma aceasta pe zi

    private String nume;
    private Integer varsta;
    private String denumire_hrana;

    public Pisica(String nume, Integer varsta, String denumire_hrana) {
        this.nume = nume;
        this.varsta = varsta;
        this.denumire_hrana = denumire_hrana;
    }

    //rescriu functia eats definita in interfata Animal
    @Override
    public void eats() {
        System.out.println("Pisica " + nume + " mananca "+ 20*varsta + " grame de " + denumire_hrana);
    }
}