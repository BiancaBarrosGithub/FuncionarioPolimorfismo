package FuncionarioHeranca;

public class Principal {

	public static void main(String[] args) {
		
		Jornada jornada = new Jornada(1,"Luna", "12345-3456", 10, "California");
		
		System.out.println(jornada.getId());
		System.out.println(jornada.getNome());
		System.out.println(jornada.getTelefone());
		System.out.println(jornada.getMatricula());
		System.out.println(jornada.getEndereco());
		
		System.out.println(jornada.calculaSalario(230, 9));
		
		
		Horista horista = new Horista (2, "Elena", "99087-1234", 20, "Los Angeles");
		
		System.out.println(horista.getId());
		System.out.println(horista.getNome());
		System.out.println(horista.getTelefone());
		System.out.println(horista.getMatricula());
		System.out.println(horista.getEndereco());
		
		System.out.println(horista.calculaSalario(100, 9));
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica(3, "Maria Fernanda", "0098-4567", 25, "New York");

		System.out.println(pessoaJuridica.getId());
		System.out.println(pessoaJuridica.getNome());
		System.out.println(pessoaJuridica.getTelefone());
		System.out.println(pessoaJuridica.getMatricula());
		System.out.println(pessoaJuridica.getEndereco());
		
		System.out.println(pessoaJuridica.calculaSalario(1200, 200));
		
	}

}
