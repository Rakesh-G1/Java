package group.mydiary1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import group.mydiary1.dao.EntryDaoInterface;
import group.mydiary1.entities.Entry;

@Component
public class EntryBusinessInterfaceImpl implements EntryBusinessInterface 
{
	@Autowired
	private EntryDaoInterface entryDaoInterface ;
	

	public EntryDaoInterface getEntryDaoInterface() {
		return entryDaoInterface;
	}

	public void setEntryDaoInterface(EntryDaoInterface entryDaoInterface) {
		this.entryDaoInterface = entryDaoInterface;
	}

	public void save(Entry entry) 
	{
		entryDaoInterface.save(entry);
	}

	public void update(Entry entry)
	{
		entryDaoInterface.update(entry);
	}

	public void delete(Entry entry) 
	{
		entryDaoInterface.delete(entry);
	}

	public Entry findById(int id) 
	{
		return entryDaoInterface.findById(id);
	}

	public List<Entry> findAll() 
	 {
		return entryDaoInterface.findAll();
	}

	public List<Entry> findByUserid(int id) {
		return entryDaoInterface.findByUserid(id);
	}

}
