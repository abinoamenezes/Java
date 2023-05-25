import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.format.TextStyle;
import java.util.Locale;

public class datas {
    public static void main(String[] args) {
       String nome= "Abinoa";
       LocalDate dataHoje= LocalDate.now();
      DayOfWeek diaSemana= dataHoje.getDayOfWeek();
   
       String diaSemanaPT= diaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault());

        System.out.printf("olá %s. hoje é %s", nome, diaSemanaPT);
    }
}
