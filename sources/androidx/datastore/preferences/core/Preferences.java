package androidx.datastore.preferences.core;

import R5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class Preferences {

    /* loaded from: classes3.dex */
    public static final class Key<T> {
        private final String name;

        public Key(String name) {
            AbstractC3292y.i(name, "name");
            this.name = name;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return AbstractC3292y.d(this.name, ((Key) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public final Pair<T> to(T t8) {
            return new Pair<>(this, t8);
        }

        public String toString() {
            return this.name;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t8) {
            AbstractC3292y.i(key, "key");
            this.key = key;
            this.value = t8;
        }

        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> key);

    public abstract <T> T get(Key<T> key);

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(Q.B(asMap()), false);
    }

    public final Preferences toPreferences() {
        return new MutablePreferences(Q.B(asMap()), true);
    }
}
