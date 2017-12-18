package org.lsn.distlock.spi.provider;

import java.io.Serializable;

import org.lsn.distlock.DistLockConfig;
import org.lsn.distlock.DistLockStatus;
import org.lsn.distlock.spi.DistLockProvider;

public class DistLockProviderDemo implements DistLockProvider {

	@Override
	public DistLockStatus doLock(DistLockConfig<? extends Serializable>.DistLockConfigEntry<?> entry) {
		// TODO Auto-generated method stub
		return DistLockStatus.Locked;
	}

	@Override
	public void doUnLock(DistLockConfig<? extends Serializable>.DistLockConfigEntry<?> entry) {
		// TODO Auto-generated method stub
		
	}

}
