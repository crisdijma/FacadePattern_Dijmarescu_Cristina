public class AnimalRegister {

    //clasa AnimalRegister care imi creeaza obiectele de tip animal si pentru fiecare obiect apeleaza functia eats

    private Animal pisica;
    private Animal caine;
    private Animal iepure;

    public AnimalRegister() {
        pisica = new Pisica("Miaunel", 7,"bobite Brit");
        caine = new Caine("Ciobanel", 2,"Pedigree");
        iepure = new Iepure("Iepurila", 4, "Amestec Morcov");
    }

    public void hranestePisica(){
        pisica.eats(); //apeleaza eats din clasa Pisica
    }
    public void hranesteCaine(){
        caine.eats(); //apeleaza eats din clasa Caine
    }
    public void hranesteIepure(){
        iepure.eats(); //apeleaza eats din clasa Iepure
    }
}
