public class FacadePatternDemo {

    //clasa FacadePatternDemo imi arata cum functioneaza facade pattern-ul

    public static void main(String[] args) {
        AnimalRegister animalRegister = new AnimalRegister(); //fac un obiect de tipul AnimalRegister (care are o pisica, un caine si un iepure)

        animalRegister.hranestePisica(); //apelez functia hranestePisica din AnimalRegister care la randul ei va apela functia eats din clasa Pisica
        animalRegister.hranesteCaine(); //apelez functia hranestePisica din AnimalRegister care la randul ei va apela functia eats din clasa Caine
        animalRegister.hranesteIepure(); //apelez functia hranestePisica din AnimalRegister care la randul ei va apela functia eats din clasa Iepure
    }
}