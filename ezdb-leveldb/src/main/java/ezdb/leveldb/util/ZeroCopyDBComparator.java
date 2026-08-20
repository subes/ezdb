package ezdb.leveldb.util;

import ezdb.leveldb.internal.org.iq80.leveldb.DBComparator;
import ezdb.leveldb.internal.org.iq80.leveldb.util.Slice;

public interface ZeroCopyDBComparator extends DBComparator {

	int compare(final Slice k1, final Slice k2);

}
