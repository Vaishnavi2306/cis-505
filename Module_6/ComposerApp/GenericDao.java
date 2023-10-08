package ComposerApp;

import java.util.List;

/**
 * GenericDao interface. 
 * @param <E> type of Dao.
 * @param <K> Key type.
 */
public interface GenericDao <E,K>{
	List<E> findAll();
	E findBy (K key);
	void insert(E entity);
}



