import java.io.FileWriter;
import java.io.IOException;

public class OrderFile {
    public void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            double totalAmount = order.getQnt() * order.getPrice();
            String priceFormatted = String.format("%.2f", order.getPrice());
            String totalAmountFormatted = String.format("%.2f", totalAmount);

            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + priceFormatted + ",\n");
            writer.write("\"totalAmount\":" + totalAmountFormatted + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


