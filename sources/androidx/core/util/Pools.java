package androidx.core.util;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Pools {

    /* loaded from: classes3.dex */
    public interface Pool<T> {
        T acquire();

        boolean release(T t8);
    }

    /* loaded from: classes3.dex */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] pool;
        private int poolSize;

        public SimplePool(@IntRange(from = 1) int i8) {
            if (i8 > 0) {
                this.pool = new Object[i8];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }

        private final boolean isInPool(T t8) {
            int i8 = this.poolSize;
            for (int i9 = 0; i9 < i8; i9++) {
                if (this.pool[i9] == t8) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i8 = this.poolSize;
            if (i8 <= 0) {
                return null;
            }
            int i9 = i8 - 1;
            T t8 = (T) this.pool[i9];
            AbstractC3292y.g(t8, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i9] = null;
            this.poolSize--;
            return t8;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            AbstractC3292y.i(instance, "instance");
            if (!isInPool(instance)) {
                int i8 = this.poolSize;
                Object[] objArr = this.pool;
                if (i8 < objArr.length) {
                    objArr[i8] = instance;
                    this.poolSize = i8 + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!".toString());
        }
    }

    /* loaded from: classes3.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object lock;

        public SynchronizedPool(int i8) {
            super(i8);
            this.lock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t8;
            synchronized (this.lock) {
                t8 = (T) super.acquire();
            }
            return t8;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            boolean release;
            AbstractC3292y.i(instance, "instance");
            synchronized (this.lock) {
                release = super.release(instance);
            }
            return release;
        }
    }

    private Pools() {
    }
}
