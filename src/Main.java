public class Main {
    public static void main(String[] args) {
      String[] weekdays = new String[5];
      weekdays[0] = "sunday";
      weekdays[1] = "monday";
      weekdays[2] = "tuesday";
      weekdays[3] = "wensday";
      weekdays[4] = "thursday";

      System.out.println(weekdays.length);
      System.out.println(weekdays[weekdays.length-1]);
      for(int  x = 0; x < weekdays.length; x++){
        System.out.println(weekdays[x]);
      }
     
    }

}
