package io.lesson7;

public class Doctor extends BattleUnit{
    private int medicineScore;

    public Doctor(int healthScore, int speed, int attackScore, int medicineScore) {
        super(healthScore, speed, attackScore);
        setMedicineScore(medicineScore);
    }


    public int getMedicineScore() {
        return medicineScore;
    }

    public void setMedicineScore(int medicineScore) {
        this.medicineScore = medicineScore;
    }

    @Override
    //  аннотоция Override говорит о том что мы переопределили метод интерфейса, либо род класса,
    //  без него будет работать, но это также указатель компилятору о переопределении метода
    public void attack(BattleUnit friend) {
        System.out.println("Доктор атакует!");
        friend.healthScore += attackScore;
    }

    @Override
    public void rest() {
        System.out.println("Доктор отдыхает");
    }
}
