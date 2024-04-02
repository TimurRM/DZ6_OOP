public class Program {
    public static void main(String[] args) {
        OrderInput orderInput = new OrderInput();
        Order order = orderInput.inputFromConsole();

        OrderFile orderFile = new OrderFile();
        orderFile.saveToJson(order);

        System.out.printf("Общая сумма чека: %.2f%n", order.getTotalAmount());
    }
}
