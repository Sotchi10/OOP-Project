package models;

public class Record {
    private String record_id;
    private User user;

    private static int qty = 0;

    //qty is for recording the amount of user after creating, the plan of Record class is to record user activity
    //such as what user spent on + where the income comes from
    //Sample output: 
    //User---------------------------
    //Added Income: +300$ from salary
    //Added Income: +100$ from gift
    //Added Expense: -100$ on shoes
    public Record(User user) {
        qty++;
    }
}
