public class Duck extends Animal{
    @Override
    void sound(){
        System.out.println("Quack Quack");
    }

    public void fly(){
        System.out.println("เป็ดบิน");
    }

    public void glide(){
        System.out.println("เป็ดร่อน");
    }

    public void clean(Animal prey){
        System.out.println(prey + "is being clean.");
    }
}
