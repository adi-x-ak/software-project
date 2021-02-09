public class random_number_generator {
    public static void main(String[] args) {
        random_number_generator rand = new random_number_generator(10);
        for (int i = 0; i < 25; i++) {
            System.out.println(rand.nextInt());
        }
    }
    private int max;
    private int last;
    public random_number_generator(int max) {
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }
    public int nextInt(){
        last = (last * 50000 + 5) % 45987;
        return last % max;
    }
}