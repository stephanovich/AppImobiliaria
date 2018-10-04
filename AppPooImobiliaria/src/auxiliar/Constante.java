package auxiliar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constante {
	public static final int ANO = 12;
	
	public static String obterDataHoraFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
        return df.format(data);
	}	
}
	
