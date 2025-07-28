package kodong.study.BackEndTmp.infrastructure;

public class CountID {
    private static Long productID = 0L;

    private CountID() {};

    public static Long getID() {
        return productID;
    }

    public static void increaseID() {
        productID += 1;
    }

}

