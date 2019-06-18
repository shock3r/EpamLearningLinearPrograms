import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {

        // 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        //данное значение длительности в часах, минутах и секундах в следующей форме:
        //ННч ММмин SSc


        int time = 7261; //second 2ч 1мин 1c


        int timeHH = time/3600; //3600
        int timeWithoutHours = time%3600;

        int timeMM = timeWithoutHours/60;
        int timeWithoutHoursAndMinutes = timeWithoutHours%60;

        System.out.printf("%dч %dмин %dc\n", timeHH, timeMM, timeWithoutHoursAndMinutes);

    }
}
