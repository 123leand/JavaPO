public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro mag = new Cachorro("Mag", 'F', 2, 0.42f, 7.2f); 
     Cachorro luna = new CaChorro("Luna", "shih tzu", "white", 'F', 2, 0.42f, 8.2f, true); 



        mag.description();
        luna.description();


        System.out.println(mag.imcc());
    System.out.println(luna.imcc());
    }
}


class Cachorro {
    private int age;
    private String breed;
    private String color;
    private boolean hasVaccine;
    private String name;
    private char sex;
    private float size;
    private float thirstMeter;
    private float weight;


    public Cachorro(String name, char sex, int age, float size, float weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.breed = "shih tzu";
        this.color = "preto e branco";
        this.hasVaccine = false;
    }

    public Cachorro(
            String name, String breed, String color, char sex, int age, float size, float weight, boolean hasVaccine) {

        this.name = name;
        this.breed = breed;
        this.color = color;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.hasVaccine = hasVaccine;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        if (name == "") {
            return;
        }

        this.name = name;
    }

    public boolean getHasVaccine() {
        return this.hasVaccine;
    }

    public void setHasVaccine(boolean hasVaccine) {
        this.hasVaccine = hasVaccine;
    }

    public void description() {
        String sexStr = this.sex == 'F' ? "fêmea" : "macho";
        String vaccineStr = this.hasVaccine ? "vacinado" : "não vacinado";

        System.out.println(
                "Esse é " + this.name +
", ele é um cachorro com " + this.age + " anos " + 
 " da cor " this.color + 
, " de porte " this.size + " e peso" this.weight + 
" é um cachorro" , sexStr + 
" está" vaccineStr);
    }

    public String imcc() {
        
        String imccDescription;
        float imcc = this.weight / (this.size * this.size);


        if (imcc <= 18.5) {
            imccDescription = "Abaixo do peso";
        }
 
else if (imcc <= 25.0) {
            imccDescription = "Peso normal";
        }
 
else if (imcc <= 30) {
            imccDescription = "Acima do peso";
        }

 else {
            imccDescription = "Obeso";
        }

        return imccDescription;
    }

}
