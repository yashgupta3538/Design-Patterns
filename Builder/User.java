public class User {
    private String name;
    private String email;
    private String address;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.address = userBuilder.address;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    static class UserBuilder {
        private String name;
        private String email;
        private String address;

        public UserBuilder() {

        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}