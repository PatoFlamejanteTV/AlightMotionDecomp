package androidx.preference;

import d6.InterfaceC2767a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PreferenceGroupKt$iterator$1 implements Iterator<Preference>, InterfaceC2767a {
    final /* synthetic */ PreferenceGroup $this_iterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PreferenceGroupKt$iterator$1(PreferenceGroup preferenceGroup) {
        this.$this_iterator = preferenceGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.$this_iterator.getPreferenceCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        PreferenceGroup preferenceGroup = this.$this_iterator;
        int i8 = this.index - 1;
        this.index = i8;
        preferenceGroup.removePreference(preferenceGroup.getPreference(i8));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Preference next() {
        PreferenceGroup preferenceGroup = this.$this_iterator;
        int i8 = this.index;
        this.index = i8 + 1;
        Preference preference = preferenceGroup.getPreference(i8);
        AbstractC3292y.h(preference, "getPreference(index++)");
        return preference;
    }
}
