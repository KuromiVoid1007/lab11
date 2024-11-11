public class Transaction {
    public String info;
    public Integer count;
    public Integer price;

    public Transaction(String info, Integer count, Integer price){
        this.info = info;
        this.count = count;
        this.price = price;
    }

    public Integer GetCount(){
        return count;
    }

    public Integer GetCountAndPrice(){
        return count*price;
    }
}