package EnumOpdrachtp212O1;

public enum Day {
    MONDAY(false),
    TUESDAY(false),
    WENSDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isWeekend;

    Day(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }


    public boolean isWeekend() {
        return isWeekend;
    }
    @Override
    public String toString() {
        return Day.MONDAY.name();
    }
}
