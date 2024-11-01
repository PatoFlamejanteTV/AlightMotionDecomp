package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class CreationExtras {
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(Key<T> key) {
            AbstractC3292y.i(key, "key");
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public interface Key<T> {
    }

    public abstract <T> T get(Key<T> key);

    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
