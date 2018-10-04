package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import negocio.Apartamento;
import negocio.Casa;
import negocio.Imobiliaria;
import negocio.Imovel;
import negocio.Informacao;
import negocio.Proprietario;

public class TestaImobiliaria {
	public static void main(String[] args) {			
		Calendar dataPublic = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date data = (Date)df.parse("04/10/2018 12:00");            
            dataPublic.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}         		
      
		Informacao i = new Informacao(5000,150,150,true,5000);
		
		Proprietario p = new Proprietario("João Zinho","(21)98765-4321");
		p.setCpf("123.456.789-11");
		
		Casa casa = new Casa("1A","Rua xyz, 214, rio de janeiro - RJ");
		casa.setDatadoAnuncio(dataPublic);
		String[] comodos = {"2 quartos","1 Sala","1 Cozinha","2 Banheiros","2 Vagas na garagem"};
		casa.setComodos(comodos);
		casa.setComplemento("");
		casa.setProprietario(p);
		casa.setInformacao(i);

		Calendar dataPublicAp = Calendar.getInstance();
		DateFormat dfAp = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date dataAp = (Date)dfAp.parse("04/10/2018 18:31");            
            dataPublicAp.setTime(dataAp);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
        
		Informacao i2 = new Informacao(8000,200,110,true,2000);
		
		Proprietario p2 = new Proprietario("Maria Zinha","(21) 91234-5678");
		p2.setCpf("119-876-543-21-00");
		
		Apartamento apartamento = new Apartamento("2A","Rua aaabbb, 215, rio de janeiro - RJ");
		apartamento.setDatadoAnuncio(dataPublicAp);
		String[] comodos2 = {"4 quartos","Sala","Cozinha","3 Banheiros","4 Vagas na garagem"};
		apartamento.setComodos(comodos2);
		apartamento.setComplemento("Apartamento 315 - Bloco B");
		apartamento.setProprietario(p2);
		apartamento.setInformacao(i2);
		
		List<Imovel> imoveis = new ArrayList<Imovel>();
		imoveis.add(casa);
		imoveis.add(apartamento);
		
		Imobiliaria imobiliaria = new Imobiliaria();		
		imobiliaria.setNome("Sua Casa");
		imobiliaria.setEndereco("Rua: Principal, 240, Heidel - BDO");
		imobiliaria.setContato("(21) 2675-8897");
		imobiliaria.setImoveis(imoveis);
		imobiliaria.exibir();
		
	}
}