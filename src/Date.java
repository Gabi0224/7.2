public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Date date = new Date(15, 10, 2023);

        date.displayDate();
    }
}