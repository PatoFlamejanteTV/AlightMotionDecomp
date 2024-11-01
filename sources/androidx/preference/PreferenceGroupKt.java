package androidx.preference;

import c6.InterfaceC2072n;
import java.util.Iterator;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PreferenceGroupKt {
    public static final boolean contains(PreferenceGroup preferenceGroup, Preference preference) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        AbstractC3292y.i(preference, "preference");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i8 = 0;
        while (i8 < preferenceCount) {
            int i9 = i8 + 1;
            if (AbstractC3292y.d(preferenceGroup.getPreference(i8), preference)) {
                return true;
            }
            i8 = i9;
        }
        return false;
    }

    public static final void forEach(PreferenceGroup preferenceGroup, Function1 action) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        AbstractC3292y.i(action, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            action.invoke(get(preferenceGroup, i8));
        }
    }

    public static final void forEachIndexed(PreferenceGroup preferenceGroup, InterfaceC2072n action) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        AbstractC3292y.i(action, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            action.invoke(Integer.valueOf(i8), get(preferenceGroup, i8));
        }
    }

    public static final <T extends Preference> T get(PreferenceGroup preferenceGroup, CharSequence key) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        AbstractC3292y.i(key, "key");
        return (T) preferenceGroup.findPreference(key);
    }

    public static final InterfaceC3255g getChildren(final PreferenceGroup preferenceGroup) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        return new InterfaceC3255g() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // k6.InterfaceC3255g
            public Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(PreferenceGroup.this);
            }
        };
    }

    public static final int getSize(PreferenceGroup preferenceGroup) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount();
    }

    public static final boolean isEmpty(PreferenceGroup preferenceGroup) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        if (preferenceGroup.getPreferenceCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(PreferenceGroup preferenceGroup) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        if (preferenceGroup.getPreferenceCount() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<Preference> iterator(PreferenceGroup preferenceGroup) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        return new PreferenceGroupKt$iterator$1(preferenceGroup);
    }

    public static final void minusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        AbstractC3292y.i(preference, "preference");
        preferenceGroup.removePreference(preference);
    }

    public static final void plusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        AbstractC3292y.i(preference, "preference");
        preferenceGroup.addPreference(preference);
    }

    public static final Preference get(PreferenceGroup preferenceGroup, int i8) {
        AbstractC3292y.i(preferenceGroup, "<this>");
        Preference preference = preferenceGroup.getPreference(i8);
        AbstractC3292y.h(preference, "getPreference(index)");
        return preference;
    }
}
