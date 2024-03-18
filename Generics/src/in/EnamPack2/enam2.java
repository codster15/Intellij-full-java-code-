package in.EnamPack2;

import in.enampack1.Course;

public class enam2 {

        public enum WEEKEND{
            SATURDAY , SUNDAY;
        }

        public static void main(String[] args) {
             Course val[] =  Course.values();

             for(Course c : val){
                 System.out.println(c);
             }

        }
    }


