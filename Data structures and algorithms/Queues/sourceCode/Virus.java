public class Virus {
    String name;
    long num;

    Virus(String name, long num){
    this.name = name;
    this.num = num;
    }

    public String toString() {
        return name + "," + num;
    }
}