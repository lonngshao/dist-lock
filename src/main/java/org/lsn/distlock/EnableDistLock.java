package org.lsn.distlock;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.lsn.distlock.spi.DistLockProvider;
import org.lsn.distlock.spi.DistLockStrategy;
import org.lsn.distlock.spi.provider.DistLockStrategyFailLoop;
import org.lsn.distlock.spring.DistLockRegistrar;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(DistLockRegistrar.class)
public @interface EnableDistLock {

	/**
	 * 分布式锁实现的客户端引用bean名称
	 * 
	 * @return
	 */
	String[] refs() default {};

	Class<? extends DistLockProvider> provider();

	Class<? extends DistLockStrategy>[] strategies() default { DistLockStrategyFailLoop.class };
}
