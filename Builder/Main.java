public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder().setName("Yashasvi").setEmail("gyashasvi85@gmail.com").setAddress("Noida")
                .build();
        System.out.println(user1.getName() + " " + user1.getEmail() + " " + user1.getAddress());

        User user2 = new User.UserBuilder().setName("Gupta").build();
        System.out.println(user2.getName());
    }
}

// Above you see there is no need to pass all parameters and also you not
// overloaded contructor builder class handling all of that stuff this is the
// beauty
// of using builder pattern. :)