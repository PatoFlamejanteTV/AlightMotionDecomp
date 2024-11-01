package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final Object f33118a;

    /* renamed from: b, reason: collision with root package name */
    Object f33119b;

    /* renamed from: c, reason: collision with root package name */
    final ConcurrentHashMap f33120c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f33118a = obj;
        this.f33119b = obj2;
        this.f33120c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f33118a) || key.equals(obj2)) && (value == (obj3 = this.f33119b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33118a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33119b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f33118a.hashCode() ^ this.f33119b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f33119b;
        this.f33119b = obj;
        this.f33120c.put(this.f33118a, obj);
        return obj2;
    }

    public final String toString() {
        return u.b(this.f33118a, this.f33119b);
    }
}
