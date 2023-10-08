package ComposerApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implementing ComposerDao.
 */
public class MemComposerDao implements ComposerDao {
	private List<Composer> composers;
	
	MemComposerDao() {
		composers = new ArrayList<>(5);
	}

	@Override
	public List<Composer> findAll() {
		return composers;
	}

	@Override
	public Composer findBy(Integer key) {
		for(Composer composer: composers) {
			if (composer.getId() == key) {
				return composer;
			}
		}
		return null;
	}

	@Override
	public void insert(Composer entity) {
		composers.add(entity);
	}
}


