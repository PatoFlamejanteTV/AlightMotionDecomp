package V0;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f10410a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f10411b;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f10412a;

        /* renamed from: b, reason: collision with root package name */
        private Map f10413b = null;

        b(String str) {
            this.f10412a = str;
        }

        public c a() {
            Map unmodifiableMap;
            String str = this.f10412a;
            if (this.f10413b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap(this.f10413b));
            }
            return new c(str, unmodifiableMap);
        }

        public b b(Annotation annotation) {
            if (this.f10413b == null) {
                this.f10413b = new HashMap();
            }
            this.f10413b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f10410a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f10411b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10410a.equals(cVar.f10410a) && this.f10411b.equals(cVar.f10411b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f10410a.hashCode() * 31) + this.f10411b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f10410a + ", properties=" + this.f10411b.values() + "}";
    }

    private c(String str, Map map) {
        this.f10410a = str;
        this.f10411b = map;
    }
}
