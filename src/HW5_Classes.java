import java.awt.event.WindowFocusListener;

public class HW5_Classes {
public static void main (String[] args){
    Worker[] personal = new Worker[5];
    personal[0] = new Worker("Ivan Ivanov", "Junior Java Developer", "ivanaivanov@dlc.com", "89991236589", 500, 22);
    personal[1] = new Worker( "Oleg Petrov", "Project Manager","olegpetrov@dlc.com","89991234567",1000, 41);
    personal[2] = new Worker("Oleg Vasiljev", "System Administrator", "olegvasil@dlc.com", "89975694545", 1300, 29);
    personal[3] = new Worker( "Sergej Vodkin", "PR Manager","sergvodkin@dlc.com","89992586935",800, 50);
    personal[4] = new Worker("Petr Satalkin", "Middle Java Developer", "ipetrsatalkin@dlc.com", "89557865289", 2000, 35);

    for (int i = 0; i < personal.length; i++) {
        if (personal[i].age >= 40) {
            personal[i].infoWorker();
        }
    }
}
}
