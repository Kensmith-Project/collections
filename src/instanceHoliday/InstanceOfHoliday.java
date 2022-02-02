package instanceHoliday;

import holiday.Holiday;

public class InstanceOfHoliday {

        public static void main(String[] args) {
                Holiday christmas = new Holiday();
                christmas.setDay(25);
                christmas.setMonth("December");
                christmas.setName("Christmas");

                System.out.println(christmas.getDay());
                System.out.println(christmas.getMonth());
                System.out.println(christmas.getName() );
        }


}
