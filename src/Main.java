import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("aaa", 1, 2));
        transactions.add(new Transaction("bbb", 2, 3));
        transactions.add(new Transaction("ccc", 3, 4));

        var generalProduct = transactions.stream()
                .mapToInt(i -> i.count).sum();
        System.out.println(generalProduct);

        var generalProduct2 = transactions.stream()
                .mapToInt(i -> i.count * i.price).sum();
        System.out.println(generalProduct2);

        var maxCount = transactions.stream()
                .max(Comparator.comparing(Transaction::GetCount)).get();
        System.out.println(maxCount.count);

        var minCountAndPrice = transactions.stream()
                .min(Comparator.comparing(Transaction::GetCountAndPrice)).get();
        System.out.println(minCountAndPrice.GetCountAndPrice());
    }
}