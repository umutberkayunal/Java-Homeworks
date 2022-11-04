package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programminglanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programminglanguages = new ArrayList<ProgrammingLanguage>();
		programminglanguages.add(new ProgrammingLanguage(1, "C#"));
		programminglanguages.add(new ProgrammingLanguage(2, "Java"));
		programminglanguages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programminglanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception{
		for (ProgrammingLanguage programminglanguage : programminglanguages) {
			if (programminglanguage.getId() == id) {
				return programminglanguage;
			}
		}
		 throw new Exception("There is no such programming language with this id.");
	}

	@Override
	public void create(ProgrammingLanguage programminglanguage){
		programminglanguages.add(programminglanguage);
	}

	@Override
	public void update(ProgrammingLanguage programminglanguage, int id){
		for (ProgrammingLanguage programminglanguageiterator : programminglanguages) {
			if (programminglanguageiterator.getId() == id) {
				programminglanguages.set(id, programminglanguageiterator);
			}
		}
	}

	@Override
	public void delete(int id){
		for (ProgrammingLanguage programminglanguageiterator : programminglanguages) {
			if (programminglanguageiterator.getId() == id) {
				programminglanguages.remove(programminglanguageiterator);
			}
		}
	}

}
