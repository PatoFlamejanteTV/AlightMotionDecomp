package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.core.Preferences;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SharedPreferencesMigrationKt {
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Function0 function0, Set set, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(function0, (Set<String>) set);
    }

    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }

    private static final InterfaceC2073o getMigrationFunction() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(null);
    }

    private static final InterfaceC2072n getShouldRunMigration(Set<String> set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Function0 produceSharedPreferences) {
        AbstractC3292y.i(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Function0 produceSharedPreferences, Set<String> keysToMigrate) {
        AbstractC3292y.i(produceSharedPreferences, "produceSharedPreferences");
        AbstractC3292y.i(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(produceSharedPreferences, (Set) null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 2, (AbstractC3284p) null);
        }
        return new SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Context context, String str, Set set, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sharedPreferencesName, "sharedPreferencesName");
        AbstractC3292y.i(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(context, sharedPreferencesName, null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 4, null);
        }
        return new SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }
}
