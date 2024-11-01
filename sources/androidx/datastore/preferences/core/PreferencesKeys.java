package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PreferencesKeys {
    public static final Preferences.Key<Boolean> booleanKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<byte[]> byteArrayKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Double> doubleKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Float> floatKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Integer> intKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Long> longKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<String> stringKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Set<String>> stringSetKey(String name) {
        AbstractC3292y.i(name, "name");
        return new Preferences.Key<>(name);
    }
}
