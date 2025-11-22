package _21_OOP._2_Constructor;

public class Gum {
    String phone;
    int model;
    int price;
    int balance;
    Map<String, Double> apple = new HashMap<>();

    public Cum(String phone, int model, int price) {
        this.phone = phone;
        this.model = model;
        this.price = price;
        apple.put("Iphone 14", 45000.0);
        apple.put("Iphone 15", 70000.0);
        apple.put("Iphone 18",100000.0);
    }

    public void byPhone(){
        System.out.println("Выберите модель телефона: ");
        System.out.println(apple);
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        if (!(apple.(scan))){
            System.out.println("Такой модели нет");
        }
        if (apple.contains(scan)){
            System.out.println("Вы выбрали: " + scan + "Каков ваш баланс?");
        }
    }

    @Override
    public String toString() {
        return "Cum{" +
                "phone='" + phone + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", balance=" + balance +
                ", apple=" + apple +
                '}';
    }
}
}
