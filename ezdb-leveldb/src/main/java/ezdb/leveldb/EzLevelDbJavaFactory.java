package ezdb.leveldb;

import java.io.File;
import java.io.IOException;

import ezdb.leveldb.internal.org.iq80.leveldb.Options;
import ezdb.leveldb.internal.org.iq80.leveldb.fileenv.EnvImpl;
import ezdb.leveldb.internal.org.iq80.leveldb.impl.Iq80DBFactory;
import ezdb.leveldb.internal.org.iq80.leveldb.impl.ExtendedDbImpl;

public class EzLevelDbJavaFactory {
	public ExtendedDbImpl open(final File path, final Options options, final boolean rangeTable) throws IOException {
		return new ExtendedDbImpl(options, path.getAbsolutePath(), EnvImpl.createEnv());
	}

	public boolean isVerifyChecksums() {
		return true;
	}

	public void destroy(final File path, final Options options) throws IOException {
		Iq80DBFactory.factory.destroy(path, options);
	}
}
