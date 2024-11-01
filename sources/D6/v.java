package D6;

import E6.S;
import R5.AbstractC1435t;
import d6.InterfaceC2767a;
import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

@y6.g(with = w.class)
/* loaded from: classes5.dex */
public final class v extends i implements Map<String, i>, InterfaceC2767a, j$.util.Map {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f1505a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final y6.b serializer() {
            return w.f1507a;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1506a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC3292y.i(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            i iVar = (i) entry.getValue();
            StringBuilder sb = new StringBuilder();
            S.c(sb, str);
            sb.append(':');
            sb.append(iVar);
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            return sb2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Map content) {
        super(null);
        AbstractC3292y.i(content, "content");
        this.f1505a = content;
    }

    public boolean c(String key) {
        AbstractC3292y.i(key, "key");
        return this.f1505a.containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return c((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return e((i) obj);
    }

    public boolean e(i value) {
        AbstractC3292y.i(value, "value");
        return this.f1505a.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, i>> entrySet() {
        return j();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC3292y.d(this.f1505a, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public i g(String key) {
        AbstractC3292y.i(key, "key");
        return (i) this.f1505a.get(key);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return g((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f1505a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f1505a.isEmpty();
    }

    public Set j() {
        return this.f1505a.entrySet();
    }

    public Set k() {
        return this.f1505a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return k();
    }

    public int l() {
        return this.f1505a.size();
    }

    public Collection m() {
        return this.f1505a.values();
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i put(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends String, ? extends i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return l();
    }

    public String toString() {
        return AbstractC1435t.w0(this.f1505a.entrySet(), ",", "{", "}", 0, null, b.f1506a, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<i> values() {
        return m();
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
