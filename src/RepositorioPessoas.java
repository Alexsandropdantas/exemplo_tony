import java.util.ArrayList;

public class RepositorioPessoas {

	private ArrayList<Pessoa> pessoas = new ArrayList<>();

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}


	public void adicionarPessoa(Pessoa p) {
		pessoas.add(p);
	}

	public void listarPessoa() {
		System.out.println("------Início Lista Pessoa-----------");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}
		System.out.println("------Fim Lista Pessoas-------------");
	}

	public void atualizarPessoa(Pessoa p) {
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getId() == p.getId()) {
				pessoas.set(p.getId()-1, p);
			}
		}
	}

	public void removerPessoa(Pessoa p) {
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getId() == p.getId()) {
				pessoas.remove(pessoa.getId()-1);
			}
		}
	}

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Alex", 10);
		Pessoa p2 = new Pessoa(2, "Bruno", 12);
		Pessoa p3 = new Pessoa(3, "Carlos", 14);

		RepositorioPessoas cp = new RepositorioPessoas();
		cp.adicionarPessoa(p1);
		cp.adicionarPessoa(p2);
		cp.adicionarPessoa(p3);
		cp.listarPessoa();

		cp.atualizarPessoa(new Pessoa(2, "Baltazar", 20));
		cp.listarPessoa();
		
		//pessoas.remove(p3.getId()-1);
		
		// cp.removerPessoa(p3);
		cp.listarPessoa();
		
	}
}
