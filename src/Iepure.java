public class Iepure implements Animal{

    //Clasa iepure care implementeaza interfata Animal si descrie un iepure si cate grame de mancare consuma acesta pe zi

    private String nume;
    private Integer varsta;
    private String denumire_hrana;

    public Iepure(String nume, Integer varsta, String denumire_hrana) {
        this.nume = nume;
        this.varsta = varsta;
        this.denumire_hrana = denumire_hrana;
    }

    //rescriu functia eats definita in interfata Animal
    @Override
    public void eats() {
        System.out.println("Iepurele " + nume + " mananca "+ 5*varsta + " grame de " + denumire_hrana);
    }
}
