package kotlin.jvm.internal;

import R5.AbstractC1435t;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import b6.AbstractC1989a;
import c6.InterfaceC2059a;
import c6.InterfaceC2060b;
import c6.InterfaceC2061c;
import c6.InterfaceC2062d;
import c6.InterfaceC2063e;
import c6.InterfaceC2064f;
import c6.InterfaceC2065g;
import c6.InterfaceC2066h;
import c6.InterfaceC2067i;
import c6.InterfaceC2068j;
import c6.InterfaceC2069k;
import c6.InterfaceC2070l;
import c6.InterfaceC2071m;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import c6.InterfaceC2075q;
import c6.InterfaceC2076r;
import c6.InterfaceC2077s;
import c6.InterfaceC2078t;
import c6.InterfaceC2079u;
import j6.InterfaceC3214c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlin.jvm.internal.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3282n implements InterfaceC3214c, InterfaceC3281m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34593b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f34594c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f34595d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f34596e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f34597f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f34598g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f34599a;

    /* renamed from: kotlin.jvm.internal.n$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final String a(Class jClass) {
            String str;
            AbstractC3292y.i(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C3282n.f34597f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C3282n.f34597f.get(jClass.getName());
            if (str3 == null) {
                return jClass.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:            if (r2 == null) goto L13;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = l6.n.E0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = l6.n.E0(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                java.lang.String r1 = l6.n.D0(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.C3282n.g()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.C3282n.g()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C3282n.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class jClass) {
            AbstractC3292y.i(jClass, "jClass");
            Map map = C3282n.f34594c;
            AbstractC3292y.g(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return Z.i(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC1989a.b(AbstractC1989a.c(jClass));
            }
            return jClass.isInstance(obj);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        int i8 = 0;
        List p8 = AbstractC1435t.p(Function0.class, Function1.class, InterfaceC2072n.class, InterfaceC2073o.class, InterfaceC2074p.class, InterfaceC2075q.class, InterfaceC2076r.class, InterfaceC2077s.class, InterfaceC2078t.class, InterfaceC2079u.class, InterfaceC2059a.class, InterfaceC2060b.class, InterfaceC2061c.class, InterfaceC2062d.class, InterfaceC2063e.class, InterfaceC2064f.class, InterfaceC2065g.class, InterfaceC2066h.class, InterfaceC2067i.class, InterfaceC2068j.class, InterfaceC2069k.class, InterfaceC2070l.class, InterfaceC2071m.class);
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(p8, 10));
        for (Object obj : p8) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            arrayList.add(Q5.x.a((Class) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        f34594c = R5.Q.u(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f34595d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f34596e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC3292y.h(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            AbstractC3292y.f(str);
            sb.append(l6.n.G0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            Q5.r a9 = Q5.x.a(sb.toString(), str + ".Companion");
            hashMap3.put(a9.c(), a9.d());
        }
        for (Map.Entry entry : f34594c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f34597f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(R5.Q.d(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), l6.n.G0((String) entry2.getValue(), '.', null, 2, null));
        }
        f34598g = linkedHashMap;
    }

    public C3282n(Class jClass) {
        AbstractC3292y.i(jClass, "jClass");
        this.f34599a = jClass;
    }

    @Override // j6.InterfaceC3214c
    public String a() {
        return f34593b.a(d());
    }

    @Override // j6.InterfaceC3214c
    public String b() {
        return f34593b.b(d());
    }

    @Override // j6.InterfaceC3214c
    public boolean c(Object obj) {
        return f34593b.c(obj, d());
    }

    @Override // kotlin.jvm.internal.InterfaceC3281m
    public Class d() {
        return this.f34599a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3282n) && AbstractC3292y.d(AbstractC1989a.b(this), AbstractC1989a.b((InterfaceC3214c) obj))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1989a.b(this).hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
