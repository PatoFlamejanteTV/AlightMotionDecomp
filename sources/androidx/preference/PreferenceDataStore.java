package androidx.preference;

import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class PreferenceDataStore {
    public boolean getBoolean(String str, boolean z8) {
        return z8;
    }

    public float getFloat(String str, float f8) {
        return f8;
    }

    public int getInt(String str, int i8) {
        return i8;
    }

    public long getLong(String str, long j8) {
        return j8;
    }

    @Nullable
    public String getString(String str, @Nullable String str2) {
        return str2;
    }

    @Nullable
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return set;
    }

    public void putBoolean(String str, boolean z8) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putFloat(String str, float f8) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putInt(String str, int i8) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putLong(String str, long j8) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putString(String str, @Nullable String str2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putStringSet(String str, @Nullable Set<String> set) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
}
