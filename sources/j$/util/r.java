package j$.util;

import java.util.Map;

/* loaded from: classes2.dex */
final class r implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private Map.Entry f33213a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Map.Entry entry) {
        this.f33213a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = this.f33213a;
        Object key = entry2.getKey();
        Object key2 = entry.getKey();
        if (key == null ? key2 == null : key.equals(key2)) {
            Object value = entry2.getValue();
            Object value2 = entry.getValue();
            if (value == null ? value2 == null : value.equals(value2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33213a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33213a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f33213a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f33213a.toString();
    }
}
