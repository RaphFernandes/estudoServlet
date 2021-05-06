package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Cola Cola");
		empresas.add(empresa);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Guaraná");
		empresa2.setId(chaveSequencial++);
		empresas.add(empresa2);
		Empresa empresa3 = new Empresa();
		empresa3.setId(chaveSequencial++);
		empresa3.setNome("Fanta");
		empresas.add(empresa3);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.empresas;
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.empresas.add(empresa);
		// TODO Auto-generated method stub
		
	}
	

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = empresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
			
		}
		
	}
	
}
