package animal;

public class Human extends Animal implements Thinkable {
    //趣味を定義
    private String hobby;

    // 引数なしのコンストラクタ
    public Human() {
    }

    // 引数ありのコンストラクタ
    public Human(String animalName, int age, String hobby) {
        // スーパークラスのコンストラクタを呼び出す
        super.setAnimalName(animalName);
        super.setAge(age);
        this.hobby = hobby;
    }

    // getter
    public String getHobby() {
        return hobby;
    }

    // setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    @Override
    public void think() {
        System.out.println("私は"+hobby+"について考えています。");
    }
}
