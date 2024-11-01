package z5;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import z5.AbstractC4272a;

/* loaded from: classes5.dex */
public final class g extends AbstractC4272a {

    /* renamed from: b, reason: collision with root package name */
    private static final i f41560b = f.a(Collections.emptyMap());

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC4272a.AbstractC0948a {
        public g b() {
            return new g(this.f41553a);
        }

        public b c(Object obj, i iVar) {
            super.a(obj, iVar);
            return this;
        }

        private b(int i8) {
            super(i8);
        }
    }

    public static b b(int i8) {
        return new b(i8);
    }

    @Override // N5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map get() {
        LinkedHashMap b9 = z5.b.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            b9.put(entry.getKey(), ((i) entry.getValue()).get());
        }
        return DesugarCollections.unmodifiableMap(b9);
    }

    private g(Map map) {
        super(map);
    }
}
