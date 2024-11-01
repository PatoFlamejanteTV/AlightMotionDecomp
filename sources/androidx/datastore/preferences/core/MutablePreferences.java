package androidx.datastore.preferences.core;

import Q5.r;
import R5.AbstractC1435t;
import R5.Q;
import androidx.datastore.preferences.core.Preferences;
import i6.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class MutablePreferences extends Preferences {
    private final AtomicBoolean frozen;
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public Map<Preferences.Key<?>, Object> asMap() {
        r rVar;
        Set<Map.Entry<Preferences.Key<?>, Object>> entrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(Q.d(AbstractC1435t.x(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC3292y.h(copyOf, "copyOf(this, size)");
                rVar = new r(key, copyOf);
            } else {
                rVar = new r(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(rVar.c(), rVar.d());
        }
        return Actual_jvmKt.immutableMap(linkedHashMap);
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (!this.frozen.get()) {
        } else {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.clear();
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(Preferences.Key<T> key) {
        AbstractC3292y.i(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:15:0x002f->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.preferences.core.MutablePreferences
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.datastore.preferences.core.MutablePreferences r6 = (androidx.datastore.preferences.core.MutablePreferences) r6
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r6.preferencesMap
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r6 = r6.preferencesMap
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L27
        L25:
            r1 = 1
            goto L67
        L27:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L64
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5f
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L64
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L64
            r0 = 1
            goto L65
        L5f:
            boolean r0 = kotlin.jvm.internal.AbstractC3292y.d(r0, r2)
            goto L65
        L64:
            r0 = 0
        L65:
            if (r0 != 0) goto L2f
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.core.MutablePreferences.equals(java.lang.Object):boolean");
    }

    public final void freeze$datastore_preferences_core() {
        this.frozen.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.core.Preferences
    public <T> T get(Preferences.Key<T> key) {
        AbstractC3292y.i(key, "key");
        T t8 = (T) this.preferencesMap.get(key);
        if (t8 instanceof byte[]) {
            byte[] bArr = (byte[]) t8;
            T t9 = (T) Arrays.copyOf(bArr, bArr.length);
            AbstractC3292y.h(t9, "copyOf(this, size)");
            return t9;
        }
        return t8;
    }

    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core() {
        return this.preferencesMap;
    }

    public int hashCode() {
        int hashCode;
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i8 += hashCode;
        }
        return i8;
    }

    public final void minusAssign(Preferences.Key<?> key) {
        AbstractC3292y.i(key, "key");
        checkNotFrozen$datastore_preferences_core();
        remove(key);
    }

    public final void plusAssign(Preferences prefs) {
        AbstractC3292y.i(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void putAll(Preferences.Pair<?>... pairs) {
        AbstractC3292y.i(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core();
        for (Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core(pair.getKey$datastore_preferences_core(), pair.getValue$datastore_preferences_core());
        }
    }

    public final <T> T remove(Preferences.Key<T> key) {
        AbstractC3292y.i(key, "key");
        checkNotFrozen$datastore_preferences_core();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void set(Preferences.Key<T> key, T t8) {
        AbstractC3292y.i(key, "key");
        setUnchecked$datastore_preferences_core(key, t8);
    }

    public final void setUnchecked$datastore_preferences_core(Preferences.Key<?> key, Object obj) {
        AbstractC3292y.i(key, "key");
        checkNotFrozen$datastore_preferences_core();
        if (obj == null) {
            remove(key);
            return;
        }
        if (obj instanceof Set) {
            this.preferencesMap.put(key, Actual_jvmKt.immutableCopyOfSet((Set) obj));
            return;
        }
        if (obj instanceof byte[]) {
            Map<Preferences.Key<?>, Object> map = this.preferencesMap;
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            AbstractC3292y.h(copyOf, "copyOf(this, size)");
            map.put(key, copyOf);
            return;
        }
        this.preferencesMap.put(key, obj);
    }

    public String toString() {
        return AbstractC1435t.w0(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, MutablePreferences$toString$1.INSTANCE, 24, null);
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map, (i8 & 2) != 0 ? true : z8);
    }

    public final void plusAssign(Preferences.Pair<?> pair) {
        AbstractC3292y.i(pair, "pair");
        checkNotFrozen$datastore_preferences_core();
        putAll(pair);
    }

    public MutablePreferences(Map<Preferences.Key<?>, Object> preferencesMap, boolean z8) {
        AbstractC3292y.i(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z8);
    }
}
