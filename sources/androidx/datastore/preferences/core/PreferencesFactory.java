package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PreferencesFactory {
    public static final Preferences create(Preferences.Pair<?>... pairs) {
        AbstractC3292y.i(pairs, "pairs");
        return createMutable((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    public static final Preferences createEmpty() {
        return new MutablePreferences(null, true, 1, null);
    }

    public static final MutablePreferences createMutable(Preferences.Pair<?>... pairs) {
        AbstractC3292y.i(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.putAll((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
