package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface LazyLayoutKeyIndexMap {
    public static final Empty Empty = Empty.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Empty implements LazyLayoutKeyIndexMap {
        static final /* synthetic */ Empty $$INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public int getIndex(Object key) {
            AbstractC3292y.i(key, "key");
            return -1;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public Void getKey(int i8) {
            return null;
        }
    }

    int getIndex(Object obj);

    Object getKey(int i8);
}
