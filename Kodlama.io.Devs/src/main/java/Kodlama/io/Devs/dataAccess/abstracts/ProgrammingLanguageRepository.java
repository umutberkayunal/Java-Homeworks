package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	
	ProgrammingLanguage getById(int id) throws Exception;
	void create(ProgrammingLanguage programminglanguage);
	void update(ProgrammingLanguage programminglanguage, int id);
	void delete(int id);
}
