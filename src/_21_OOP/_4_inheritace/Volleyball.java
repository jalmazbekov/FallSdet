    package _21_OOP._4_inheritace;

    public class Volleyball extends Sport{
      private   String lastName;
        public Volleyball(String name, int age ,String lastName) {
            super(name, age);
            this.lastName = lastName;
        }

        @Override
        public String dream() {
            return "Dream,:получить золот";
        }

        public String getLastName() {
            return lastName;
        }
        @Override
        public String toString() {
            return super.toString() + ", lastName='" + lastName + "'";
        }


    }
