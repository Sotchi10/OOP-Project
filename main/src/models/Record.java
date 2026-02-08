package models;

import java.time.LocalDate;

public class Record {
    private String record_id;
    private String type;
    private LocalDate date;
    private User user;

    private static int qty = 0;

    public Record(String type, int amount, LocalDate date, String des) {
        
    }

    //qty is for recording the amount of user after creating, the plan of Record class is to record user activity
    //such as what user spent on + where the income comes from
    //Sample output: 
    //User---------------------------
    //User Activties = 3 times
    //Added Income: +300$ from salary
    //Added Income: +100$ from gift
    //Added Expense: -100$ on shoes
    

    //Overall amount of user activity record
    public static int record_qty() {
        return qty;
    }
    
}   
