package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC3292y;

@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Preference {

    @PrimaryKey
    @ColumnInfo(name = LeanbackPreferenceDialogFragment.ARG_KEY)
    private final String key;

    @ColumnInfo(name = "long_value")
    private final Long value;

    public Preference(String key, Long l8) {
        AbstractC3292y.i(key, "key");
        this.key = key;
        this.value = l8;
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = preference.key;
        }
        if ((i8 & 2) != 0) {
            l8 = preference.value;
        }
        return preference.copy(str, l8);
    }

    public final String component1() {
        return this.key;
    }

    public final Long component2() {
        return this.value;
    }

    public final Preference copy(String key, Long l8) {
        AbstractC3292y.i(key, "key");
        return new Preference(key, l8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return AbstractC3292y.d(this.key, preference.key) && AbstractC3292y.d(this.value, preference.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        Long l8 = this.value;
        return hashCode + (l8 == null ? 0 : l8.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(String key, boolean z8) {
        this(key, Long.valueOf(z8 ? 1L : 0L));
        AbstractC3292y.i(key, "key");
    }
}
