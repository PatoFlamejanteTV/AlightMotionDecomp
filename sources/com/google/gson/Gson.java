package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import t1.C4002a;
import t1.EnumC4003b;

/* loaded from: classes4.dex */
public final class Gson {

    /* renamed from: A, reason: collision with root package name */
    static final c f18754A = b.f18790a;

    /* renamed from: B, reason: collision with root package name */
    static final q f18755B = p.f19040a;

    /* renamed from: C, reason: collision with root package name */
    static final q f18756C = p.f19041b;

    /* renamed from: z, reason: collision with root package name */
    static final String f18757z = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f18758a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f18759b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.c f18760c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f18761d;

    /* renamed from: e, reason: collision with root package name */
    final List f18762e;

    /* renamed from: f, reason: collision with root package name */
    final Excluder f18763f;

    /* renamed from: g, reason: collision with root package name */
    final c f18764g;

    /* renamed from: h, reason: collision with root package name */
    final Map f18765h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f18766i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f18767j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f18768k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f18769l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f18770m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f18771n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f18772o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f18773p;

    /* renamed from: q, reason: collision with root package name */
    final String f18774q;

    /* renamed from: r, reason: collision with root package name */
    final int f18775r;

    /* renamed from: s, reason: collision with root package name */
    final int f18776s;

    /* renamed from: t, reason: collision with root package name */
    final n f18777t;

    /* renamed from: u, reason: collision with root package name */
    final List f18778u;

    /* renamed from: v, reason: collision with root package name */
    final List f18779v;

    /* renamed from: w, reason: collision with root package name */
    final q f18780w;

    /* renamed from: x, reason: collision with root package name */
    final q f18781x;

    /* renamed from: y, reason: collision with root package name */
    final List f18782y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private TypeAdapter f18787a = null;

        FutureTypeAdapter() {
        }

        private TypeAdapter f() {
            TypeAdapter typeAdapter = this.f18787a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(C4002a c4002a) {
            return f().b(c4002a);
        }

        @Override // com.google.gson.TypeAdapter
        public void d(t1.c cVar, Object obj) {
            f().d(cVar, obj);
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter e() {
            return f();
        }

        public void g(TypeAdapter typeAdapter) {
            if (this.f18787a == null) {
                this.f18787a = typeAdapter;
                return;
            }
            throw new AssertionError("Delegate is already set");
        }
    }

    public Gson() {
        this(Excluder.f18801g, f18754A, Collections.emptyMap(), false, false, false, true, false, false, false, true, n.f19032a, f18757z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f18755B, f18756C, Collections.emptyList());
    }

    private static void a(Object obj, C4002a c4002a) {
        if (obj != null) {
            try {
                if (c4002a.N() != EnumC4003b.END_DOCUMENT) {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (t1.d e8) {
                throw new m(e8);
            } catch (IOException e9) {
                throw new g(e9);
            }
        }
    }

    private static TypeAdapter b(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicLong b(C4002a c4002a) {
                return new AtomicLong(((Number) TypeAdapter.this.b(c4002a)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, AtomicLong atomicLong) {
                TypeAdapter.this.d(cVar, Long.valueOf(atomicLong.get()));
            }
        }.a();
    }

    private static TypeAdapter c(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray b(C4002a c4002a) {
                ArrayList arrayList = new ArrayList();
                c4002a.a();
                while (c4002a.t()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.b(c4002a)).longValue()));
                }
                c4002a.j();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i8 = 0; i8 < size; i8++) {
                    atomicLongArray.set(i8, ((Long) arrayList.get(i8)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, AtomicLongArray atomicLongArray) {
                cVar.g();
                int length = atomicLongArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    TypeAdapter.this.d(cVar, Long.valueOf(atomicLongArray.get(i8)));
                }
                cVar.j();
            }
        }.a();
    }

    static void d(double d8) {
        if (!Double.isNaN(d8) && !Double.isInfinite(d8)) {
            return;
        }
        throw new IllegalArgumentException(d8 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    private TypeAdapter e(boolean z8) {
        if (z8) {
            return TypeAdapters.f18932v;
        }
        return new TypeAdapter() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Double b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return Double.valueOf(c4002a.E());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Number number) {
                if (number == null) {
                    cVar.z();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.d(doubleValue);
                cVar.M(doubleValue);
            }
        };
    }

    private TypeAdapter f(boolean z8) {
        if (z8) {
            return TypeAdapters.f18931u;
        }
        return new TypeAdapter() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Float b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return Float.valueOf((float) c4002a.E());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Number number) {
                if (number == null) {
                    cVar.z();
                    return;
                }
                float floatValue = number.floatValue();
                Gson.d(floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                cVar.P(number);
            }
        };
    }

    private static TypeAdapter n(n nVar) {
        if (nVar == n.f19032a) {
            return TypeAdapters.f18930t;
        }
        return new TypeAdapter() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return Long.valueOf(c4002a.G());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Number number) {
                if (number == null) {
                    cVar.z();
                } else {
                    cVar.Q(number.toString());
                }
            }
        };
    }

    public Object g(Reader reader, TypeToken typeToken) {
        C4002a o8 = o(reader);
        Object j8 = j(o8, typeToken);
        a(j8, o8);
        return j8;
    }

    public Object h(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), typeToken);
    }

    public Object i(String str, Type type) {
        return h(str, TypeToken.b(type));
    }

    public Object j(C4002a c4002a, TypeToken typeToken) {
        boolean u8 = c4002a.u();
        boolean z8 = true;
        c4002a.S(true);
        try {
            try {
                try {
                    c4002a.N();
                    z8 = false;
                    return k(typeToken).b(c4002a);
                } catch (EOFException e8) {
                    if (z8) {
                        c4002a.S(u8);
                        return null;
                    }
                    throw new m(e8);
                } catch (IOException e9) {
                    throw new m(e9);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e10.getMessage(), e10);
            } catch (IllegalStateException e11) {
                throw new m(e11);
            }
        } finally {
            c4002a.S(u8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:            r2.g(r4);        r0.put(r7, r4);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.gson.TypeAdapter k(com.google.gson.reflect.TypeToken r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = r6.f18759b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal r0 = r6.f18758a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.f18758a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List r3 = r6.f18762e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.r r4 = (com.google.gson.r) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapter r4 = r4.a(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.g(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal r2 = r6.f18758a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap r7 = r6.f18759b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.10.1) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal r0 = r6.f18758a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.k(com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public TypeAdapter l(Class cls) {
        return k(TypeToken.a(cls));
    }

    public TypeAdapter m(r rVar, TypeToken typeToken) {
        if (!this.f18762e.contains(rVar)) {
            rVar = this.f18761d;
        }
        boolean z8 = false;
        for (r rVar2 : this.f18762e) {
            if (!z8) {
                if (rVar2 == rVar) {
                    z8 = true;
                }
            } else {
                TypeAdapter a9 = rVar2.a(this, typeToken);
                if (a9 != null) {
                    return a9;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public C4002a o(Reader reader) {
        C4002a c4002a = new C4002a(reader);
        c4002a.S(this.f18771n);
        return c4002a;
    }

    public t1.c p(Writer writer) {
        if (this.f18768k) {
            writer.write(")]}'\n");
        }
        t1.c cVar = new t1.c(writer);
        if (this.f18770m) {
            cVar.I("  ");
        }
        cVar.H(this.f18769l);
        cVar.J(this.f18771n);
        cVar.K(this.f18766i);
        return cVar;
    }

    public String q(f fVar) {
        StringWriter stringWriter = new StringWriter();
        t(fVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        if (obj == null) {
            return q(h.f18799a);
        }
        return s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(f fVar, Appendable appendable) {
        try {
            u(fVar, p(com.google.gson.internal.l.b(appendable)));
        } catch (IOException e8) {
            throw new g(e8);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f18766i + ",factories:" + this.f18762e + ",instanceCreators:" + this.f18760c + "}";
    }

    public void u(f fVar, t1.c cVar) {
        boolean r8 = cVar.r();
        cVar.J(true);
        boolean q8 = cVar.q();
        cVar.H(this.f18769l);
        boolean p8 = cVar.p();
        cVar.K(this.f18766i);
        try {
            try {
                com.google.gson.internal.l.a(fVar, cVar);
            } catch (IOException e8) {
                throw new g(e8);
            } catch (AssertionError e9) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e9.getMessage(), e9);
            }
        } finally {
            cVar.J(r8);
            cVar.H(q8);
            cVar.K(p8);
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, p(com.google.gson.internal.l.b(appendable)));
        } catch (IOException e8) {
            throw new g(e8);
        }
    }

    public void w(Object obj, Type type, t1.c cVar) {
        TypeAdapter k8 = k(TypeToken.b(type));
        boolean r8 = cVar.r();
        cVar.J(true);
        boolean q8 = cVar.q();
        cVar.H(this.f18769l);
        boolean p8 = cVar.p();
        cVar.K(this.f18766i);
        try {
            try {
                k8.d(cVar, obj);
            } catch (IOException e8) {
                throw new g(e8);
            } catch (AssertionError e9) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e9.getMessage(), e9);
            }
        } finally {
            cVar.J(r8);
            cVar.H(q8);
            cVar.K(p8);
        }
    }

    Gson(Excluder excluder, c cVar, Map map, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, n nVar, String str, int i8, int i9, List list, List list2, List list3, q qVar, q qVar2, List list4) {
        this.f18758a = new ThreadLocal();
        this.f18759b = new ConcurrentHashMap();
        this.f18763f = excluder;
        this.f18764g = cVar;
        this.f18765h = map;
        com.google.gson.internal.c cVar2 = new com.google.gson.internal.c(map, z15, list4);
        this.f18760c = cVar2;
        this.f18766i = z8;
        this.f18767j = z9;
        this.f18768k = z10;
        this.f18769l = z11;
        this.f18770m = z12;
        this.f18771n = z13;
        this.f18772o = z14;
        this.f18773p = z15;
        this.f18777t = nVar;
        this.f18774q = str;
        this.f18775r = i8;
        this.f18776s = i9;
        this.f18778u = list;
        this.f18779v = list2;
        this.f18780w = qVar;
        this.f18781x = qVar2;
        this.f18782y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f18909W);
        arrayList.add(ObjectTypeAdapter.e(qVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f18889C);
        arrayList.add(TypeAdapters.f18923m);
        arrayList.add(TypeAdapters.f18917g);
        arrayList.add(TypeAdapters.f18919i);
        arrayList.add(TypeAdapters.f18921k);
        TypeAdapter n8 = n(nVar);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, n8));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, e(z14)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, f(z14)));
        arrayList.add(NumberTypeAdapter.e(qVar2));
        arrayList.add(TypeAdapters.f18925o);
        arrayList.add(TypeAdapters.f18927q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, b(n8)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, c(n8)));
        arrayList.add(TypeAdapters.f18929s);
        arrayList.add(TypeAdapters.f18934x);
        arrayList.add(TypeAdapters.f18891E);
        arrayList.add(TypeAdapters.f18893G);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f18936z));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f18887A));
        arrayList.add(TypeAdapters.a(com.google.gson.internal.f.class, TypeAdapters.f18888B));
        arrayList.add(TypeAdapters.f18895I);
        arrayList.add(TypeAdapters.f18897K);
        arrayList.add(TypeAdapters.f18901O);
        arrayList.add(TypeAdapters.f18903Q);
        arrayList.add(TypeAdapters.f18907U);
        arrayList.add(TypeAdapters.f18899M);
        arrayList.add(TypeAdapters.f18914d);
        arrayList.add(DateTypeAdapter.f18827b);
        arrayList.add(TypeAdapters.f18905S);
        if (com.google.gson.internal.sql.a.f19025a) {
            arrayList.add(com.google.gson.internal.sql.a.f19029e);
            arrayList.add(com.google.gson.internal.sql.a.f19028d);
            arrayList.add(com.google.gson.internal.sql.a.f19030f);
        }
        arrayList.add(ArrayTypeAdapter.f18821c);
        arrayList.add(TypeAdapters.f18912b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar2));
        arrayList.add(new MapTypeAdapterFactory(cVar2, z9));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar2);
        this.f18761d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f18910X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar2, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f18762e = DesugarCollections.unmodifiableList(arrayList);
    }
}
