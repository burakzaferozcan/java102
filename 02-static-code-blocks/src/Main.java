public class Main {
    public static void main(String[] args) {

        System.out.println(User.counter);

        User u1=new User("bzo");
        System.out.println(User.counter);
        User u2=new User("bzo");
        System.out.println(User.counter);
        User u3=new User("bzo");
        System.out.println(User.counter);





    }
}