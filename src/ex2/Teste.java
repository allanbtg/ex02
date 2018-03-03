package ex2;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pais pais = new Pais();

		pais.setNome("teste");
		pais.setArea(454545.00);
		pais.setPopulacao(654654546);
		
		pais.criar();
		
		pais.carregar();
		for(int i = 0; i <pais.carregar().size();i++) {
			System.out.println(pais.carregar().get(i).toString());
		}

		Pais novo = new Pais(1,"Outro",1032291,23.4);
		novo.atualizar();
		
		novo.excluir();
		
		
		
		pais.paisHabitantes();
		System.out.println(pais.toString());
		
		pais.paisMenorArea();
		System.out.println(pais.toString());
		
		String [] array = pais.paisVetPaises();
		
		for(int i = 0; i <array.length;i++) {
			System.out.println(array[i]);
		}

	}

}