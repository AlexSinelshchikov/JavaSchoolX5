package Fruits;

public abstract class Fruits {
     private float weight;

     public Fruits (float weight) {
         this.weight = weight;
     }

     public Fruits () {

     }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
