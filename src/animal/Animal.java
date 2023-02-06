package animal;

public class Animal {
    // フィールドを定義
    private String animalName;
    private int age;

    // 引数なしのコンストラクタ
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }

    //getter
    public int getAge() {
        return age;
    }
    public String getAnimalName() {
        return animalName;
    }

    //setter
    public void setAge(int age) {
        this.age = age;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void say() {
        System.out.println(animalName+"です。"+age+"歳です。");
    }


}
