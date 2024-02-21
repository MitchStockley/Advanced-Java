package lesson15;

public class RunnableExample implements Runnable {

    private final String name;



    public RunnableExample(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(name + ":" + i);
        }
    }


}
