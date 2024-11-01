package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import q1.c;
import t1.C4002a;
import t1.EnumC4003b;

/* loaded from: classes4.dex */
public abstract class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final TypeAdapter f18887A;

    /* renamed from: B, reason: collision with root package name */
    public static final TypeAdapter f18888B;

    /* renamed from: C, reason: collision with root package name */
    public static final r f18889C;

    /* renamed from: D, reason: collision with root package name */
    public static final TypeAdapter f18890D;

    /* renamed from: E, reason: collision with root package name */
    public static final r f18891E;

    /* renamed from: F, reason: collision with root package name */
    public static final TypeAdapter f18892F;

    /* renamed from: G, reason: collision with root package name */
    public static final r f18893G;

    /* renamed from: H, reason: collision with root package name */
    public static final TypeAdapter f18894H;

    /* renamed from: I, reason: collision with root package name */
    public static final r f18895I;

    /* renamed from: J, reason: collision with root package name */
    public static final TypeAdapter f18896J;

    /* renamed from: K, reason: collision with root package name */
    public static final r f18897K;

    /* renamed from: L, reason: collision with root package name */
    public static final TypeAdapter f18898L;

    /* renamed from: M, reason: collision with root package name */
    public static final r f18899M;

    /* renamed from: N, reason: collision with root package name */
    public static final TypeAdapter f18900N;

    /* renamed from: O, reason: collision with root package name */
    public static final r f18901O;

    /* renamed from: P, reason: collision with root package name */
    public static final TypeAdapter f18902P;

    /* renamed from: Q, reason: collision with root package name */
    public static final r f18903Q;

    /* renamed from: R, reason: collision with root package name */
    public static final TypeAdapter f18904R;

    /* renamed from: S, reason: collision with root package name */
    public static final r f18905S;

    /* renamed from: T, reason: collision with root package name */
    public static final TypeAdapter f18906T;

    /* renamed from: U, reason: collision with root package name */
    public static final r f18907U;

    /* renamed from: V, reason: collision with root package name */
    public static final TypeAdapter f18908V;

    /* renamed from: W, reason: collision with root package name */
    public static final r f18909W;

    /* renamed from: X, reason: collision with root package name */
    public static final r f18910X;

    /* renamed from: a, reason: collision with root package name */
    public static final TypeAdapter f18911a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f18912b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter f18913c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f18914d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeAdapter f18915e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeAdapter f18916f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f18917g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeAdapter f18918h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f18919i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeAdapter f18920j;

    /* renamed from: k, reason: collision with root package name */
    public static final r f18921k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeAdapter f18922l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f18923m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter f18924n;

    /* renamed from: o, reason: collision with root package name */
    public static final r f18925o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeAdapter f18926p;

    /* renamed from: q, reason: collision with root package name */
    public static final r f18927q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeAdapter f18928r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f18929s;

    /* renamed from: t, reason: collision with root package name */
    public static final TypeAdapter f18930t;

    /* renamed from: u, reason: collision with root package name */
    public static final TypeAdapter f18931u;

    /* renamed from: v, reason: collision with root package name */
    public static final TypeAdapter f18932v;

    /* renamed from: w, reason: collision with root package name */
    public static final TypeAdapter f18933w;

    /* renamed from: x, reason: collision with root package name */
    public static final r f18934x;

    /* renamed from: y, reason: collision with root package name */
    public static final TypeAdapter f18935y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeAdapter f18936z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass30 implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TypeToken f18937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f18938b;

        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.equals(this.f18937a)) {
                return this.f18938b;
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final Map f18951a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f18952b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map f18953c = new HashMap();

        /* loaded from: classes4.dex */
        class a implements PrivilegedAction {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f18954a;

            a(Class cls) {
                this.f18954a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f18954a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    c cVar = (c) field.getAnnotation(c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str2 : cVar.alternate()) {
                            this.f18951a.put(str2, r42);
                        }
                    }
                    this.f18951a.put(name, r42);
                    this.f18952b.put(str, r42);
                    this.f18953c.put(r42, name);
                }
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Enum b(C4002a c4002a) {
            if (c4002a.N() == EnumC4003b.NULL) {
                c4002a.J();
                return null;
            }
            String L8 = c4002a.L();
            Enum r02 = (Enum) this.f18951a.get(L8);
            if (r02 == null) {
                return (Enum) this.f18952b.get(L8);
            }
            return r02;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(t1.c cVar, Enum r32) {
            String str;
            if (r32 == null) {
                str = null;
            } else {
                str = (String) this.f18953c.get(r32);
            }
            cVar.Q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18956a;

        static {
            int[] iArr = new int[EnumC4003b.values().length];
            f18956a = iArr;
            try {
                iArr[EnumC4003b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18956a[EnumC4003b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18956a[EnumC4003b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18956a[EnumC4003b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18956a[EnumC4003b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18956a[EnumC4003b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter a9 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Class b(C4002a c4002a) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.a();
        f18911a = a9;
        f18912b = a(Class.class, a9);
        TypeAdapter a10 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BitSet b(C4002a c4002a) {
                BitSet bitSet = new BitSet();
                c4002a.a();
                EnumC4003b N8 = c4002a.N();
                int i8 = 0;
                while (N8 != EnumC4003b.END_ARRAY) {
                    int i9 = a.f18956a[N8.ordinal()];
                    boolean z8 = true;
                    if (i9 != 1 && i9 != 2) {
                        if (i9 == 3) {
                            z8 = c4002a.B();
                        } else {
                            throw new m("Invalid bitset value type: " + N8 + "; at path " + c4002a.getPath());
                        }
                    } else {
                        int F8 = c4002a.F();
                        if (F8 == 0) {
                            z8 = false;
                        } else if (F8 != 1) {
                            throw new m("Invalid bitset value " + F8 + ", expected 0 or 1; at path " + c4002a.r());
                        }
                    }
                    if (z8) {
                        bitSet.set(i8);
                    }
                    i8++;
                    N8 = c4002a.N();
                }
                c4002a.j();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, BitSet bitSet) {
                cVar.g();
                int length = bitSet.length();
                for (int i8 = 0; i8 < length; i8++) {
                    cVar.N(bitSet.get(i8) ? 1L : 0L);
                }
                cVar.j();
            }
        }.a();
        f18913c = a10;
        f18914d = a(BitSet.class, a10);
        TypeAdapter typeAdapter = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean b(C4002a c4002a) {
                EnumC4003b N8 = c4002a.N();
                if (N8 == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                if (N8 == EnumC4003b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(c4002a.L()));
                }
                return Boolean.valueOf(c4002a.B());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Boolean bool) {
                cVar.O(bool);
            }
        };
        f18915e = typeAdapter;
        f18916f = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return Boolean.valueOf(c4002a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Boolean bool) {
                String bool2;
                if (bool == null) {
                    bool2 = "null";
                } else {
                    bool2 = bool.toString();
                }
                cVar.Q(bool2);
            }
        };
        f18917g = b(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter typeAdapter2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                try {
                    int F8 = c4002a.F();
                    if (F8 <= 255 && F8 >= -128) {
                        return Byte.valueOf((byte) F8);
                    }
                    throw new m("Lossy conversion from " + F8 + " to byte; at path " + c4002a.r());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Number number) {
                if (number == null) {
                    cVar.z();
                } else {
                    cVar.N(number.byteValue());
                }
            }
        };
        f18918h = typeAdapter2;
        f18919i = b(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter typeAdapter3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                try {
                    int F8 = c4002a.F();
                    if (F8 <= 65535 && F8 >= -32768) {
                        return Short.valueOf((short) F8);
                    }
                    throw new m("Lossy conversion from " + F8 + " to short; at path " + c4002a.r());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Number number) {
                if (number == null) {
                    cVar.z();
                } else {
                    cVar.N(number.shortValue());
                }
            }
        };
        f18920j = typeAdapter3;
        f18921k = b(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                try {
                    return Integer.valueOf(c4002a.F());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Number number) {
                if (number == null) {
                    cVar.z();
                } else {
                    cVar.N(number.intValue());
                }
            }
        };
        f18922l = typeAdapter4;
        f18923m = b(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter a11 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicInteger b(C4002a c4002a) {
                try {
                    return new AtomicInteger(c4002a.F());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, AtomicInteger atomicInteger) {
                cVar.N(atomicInteger.get());
            }
        }.a();
        f18924n = a11;
        f18925o = a(AtomicInteger.class, a11);
        TypeAdapter a12 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicBoolean b(C4002a c4002a) {
                return new AtomicBoolean(c4002a.B());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, AtomicBoolean atomicBoolean) {
                cVar.R(atomicBoolean.get());
            }
        }.a();
        f18926p = a12;
        f18927q = a(AtomicBoolean.class, a12);
        TypeAdapter a13 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicIntegerArray b(C4002a c4002a) {
                ArrayList arrayList = new ArrayList();
                c4002a.a();
                while (c4002a.t()) {
                    try {
                        arrayList.add(Integer.valueOf(c4002a.F()));
                    } catch (NumberFormatException e8) {
                        throw new m(e8);
                    }
                }
                c4002a.j();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i8 = 0; i8 < size; i8++) {
                    atomicIntegerArray.set(i8, ((Integer) arrayList.get(i8)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, AtomicIntegerArray atomicIntegerArray) {
                cVar.g();
                int length = atomicIntegerArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    cVar.N(atomicIntegerArray.get(i8));
                }
                cVar.j();
            }
        }.a();
        f18928r = a13;
        f18929s = a(AtomicIntegerArray.class, a13);
        f18930t = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                try {
                    return Long.valueOf(c4002a.G());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Number number) {
                if (number == null) {
                    cVar.z();
                } else {
                    cVar.N(number.longValue());
                }
            }
        };
        f18931u = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C4002a c4002a) {
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
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                cVar.P(number);
            }
        };
        f18932v = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C4002a c4002a) {
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
                } else {
                    cVar.M(number.doubleValue());
                }
            }
        };
        TypeAdapter typeAdapter5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Character b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                String L8 = c4002a.L();
                if (L8.length() == 1) {
                    return Character.valueOf(L8.charAt(0));
                }
                throw new m("Expecting character, got: " + L8 + "; at " + c4002a.r());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Character ch) {
                String valueOf;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                cVar.Q(valueOf);
            }
        };
        f18933w = typeAdapter5;
        f18934x = b(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter typeAdapter6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public String b(C4002a c4002a) {
                EnumC4003b N8 = c4002a.N();
                if (N8 == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                if (N8 == EnumC4003b.BOOLEAN) {
                    return Boolean.toString(c4002a.B());
                }
                return c4002a.L();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, String str) {
                cVar.Q(str);
            }
        };
        f18935y = typeAdapter6;
        f18936z = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BigDecimal b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                String L8 = c4002a.L();
                try {
                    return new BigDecimal(L8);
                } catch (NumberFormatException e8) {
                    throw new m("Failed parsing '" + L8 + "' as BigDecimal; at path " + c4002a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, BigDecimal bigDecimal) {
                cVar.P(bigDecimal);
            }
        };
        f18887A = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BigInteger b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                String L8 = c4002a.L();
                try {
                    return new BigInteger(L8);
                } catch (NumberFormatException e8) {
                    throw new m("Failed parsing '" + L8 + "' as BigInteger; at path " + c4002a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, BigInteger bigInteger) {
                cVar.P(bigInteger);
            }
        };
        f18888B = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public f b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return new f(c4002a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, f fVar) {
                cVar.P(fVar);
            }
        };
        f18889C = a(String.class, typeAdapter6);
        TypeAdapter typeAdapter7 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public StringBuilder b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return new StringBuilder(c4002a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, StringBuilder sb) {
                String sb2;
                if (sb == null) {
                    sb2 = null;
                } else {
                    sb2 = sb.toString();
                }
                cVar.Q(sb2);
            }
        };
        f18890D = typeAdapter7;
        f18891E = a(StringBuilder.class, typeAdapter7);
        TypeAdapter typeAdapter8 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public StringBuffer b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return new StringBuffer(c4002a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, StringBuffer stringBuffer) {
                String stringBuffer2;
                if (stringBuffer == null) {
                    stringBuffer2 = null;
                } else {
                    stringBuffer2 = stringBuffer.toString();
                }
                cVar.Q(stringBuffer2);
            }
        };
        f18892F = typeAdapter8;
        f18893G = a(StringBuffer.class, typeAdapter8);
        TypeAdapter typeAdapter9 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public URL b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                String L8 = c4002a.L();
                if ("null".equals(L8)) {
                    return null;
                }
                return new URL(L8);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, URL url) {
                String externalForm;
                if (url == null) {
                    externalForm = null;
                } else {
                    externalForm = url.toExternalForm();
                }
                cVar.Q(externalForm);
            }
        };
        f18894H = typeAdapter9;
        f18895I = a(URL.class, typeAdapter9);
        TypeAdapter typeAdapter10 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public URI b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                try {
                    String L8 = c4002a.L();
                    if ("null".equals(L8)) {
                        return null;
                    }
                    return new URI(L8);
                } catch (URISyntaxException e8) {
                    throw new g(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, URI uri) {
                String aSCIIString;
                if (uri == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri.toASCIIString();
                }
                cVar.Q(aSCIIString);
            }
        };
        f18896J = typeAdapter10;
        f18897K = a(URI.class, typeAdapter10);
        TypeAdapter typeAdapter11 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InetAddress b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return InetAddress.getByName(c4002a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, InetAddress inetAddress) {
                String hostAddress;
                if (inetAddress == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress.getHostAddress();
                }
                cVar.Q(hostAddress);
            }
        };
        f18898L = typeAdapter11;
        f18899M = d(InetAddress.class, typeAdapter11);
        TypeAdapter typeAdapter12 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public UUID b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                String L8 = c4002a.L();
                try {
                    return UUID.fromString(L8);
                } catch (IllegalArgumentException e8) {
                    throw new m("Failed parsing '" + L8 + "' as UUID; at path " + c4002a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, UUID uuid) {
                String uuid2;
                if (uuid == null) {
                    uuid2 = null;
                } else {
                    uuid2 = uuid.toString();
                }
                cVar.Q(uuid2);
            }
        };
        f18900N = typeAdapter12;
        f18901O = a(UUID.class, typeAdapter12);
        TypeAdapter a14 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Currency b(C4002a c4002a) {
                String L8 = c4002a.L();
                try {
                    return Currency.getInstance(L8);
                } catch (IllegalArgumentException e8) {
                    throw new m("Failed parsing '" + L8 + "' as Currency; at path " + c4002a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Currency currency) {
                cVar.Q(currency.getCurrencyCode());
            }
        }.a();
        f18902P = a14;
        f18903Q = a(Currency.class, a14);
        TypeAdapter typeAdapter13 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Calendar b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                c4002a.b();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (c4002a.N() != EnumC4003b.END_OBJECT) {
                    String H8 = c4002a.H();
                    int F8 = c4002a.F();
                    if ("year".equals(H8)) {
                        i8 = F8;
                    } else if ("month".equals(H8)) {
                        i9 = F8;
                    } else if ("dayOfMonth".equals(H8)) {
                        i10 = F8;
                    } else if ("hourOfDay".equals(H8)) {
                        i11 = F8;
                    } else if ("minute".equals(H8)) {
                        i12 = F8;
                    } else if ("second".equals(H8)) {
                        i13 = F8;
                    }
                }
                c4002a.k();
                return new GregorianCalendar(i8, i9, i10, i11, i12, i13);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Calendar calendar) {
                if (calendar == null) {
                    cVar.z();
                    return;
                }
                cVar.h();
                cVar.u("year");
                cVar.N(calendar.get(1));
                cVar.u("month");
                cVar.N(calendar.get(2));
                cVar.u("dayOfMonth");
                cVar.N(calendar.get(5));
                cVar.u("hourOfDay");
                cVar.N(calendar.get(11));
                cVar.u("minute");
                cVar.N(calendar.get(12));
                cVar.u("second");
                cVar.N(calendar.get(13));
                cVar.k();
            }
        };
        f18904R = typeAdapter13;
        f18905S = c(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter typeAdapter14 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Locale b(C4002a c4002a) {
                String str;
                String str2;
                String str3 = null;
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c4002a.L(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null && str3 == null) {
                    return new Locale(str);
                }
                if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, Locale locale) {
                String locale2;
                if (locale == null) {
                    locale2 = null;
                } else {
                    locale2 = locale.toString();
                }
                cVar.Q(locale2);
            }
        };
        f18906T = typeAdapter14;
        f18907U = a(Locale.class, typeAdapter14);
        TypeAdapter typeAdapter15 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private com.google.gson.f f(C4002a c4002a, EnumC4003b enumC4003b) {
                int i8 = a.f18956a[enumC4003b.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 6) {
                                c4002a.J();
                                return h.f18799a;
                            }
                            throw new IllegalStateException("Unexpected token: " + enumC4003b);
                        }
                        return new k(Boolean.valueOf(c4002a.B()));
                    }
                    return new k(c4002a.L());
                }
                return new k(new f(c4002a.L()));
            }

            private com.google.gson.f g(C4002a c4002a, EnumC4003b enumC4003b) {
                int i8 = a.f18956a[enumC4003b.ordinal()];
                if (i8 != 4) {
                    if (i8 != 5) {
                        return null;
                    }
                    c4002a.b();
                    return new i();
                }
                c4002a.a();
                return new d();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public com.google.gson.f b(C4002a c4002a) {
                String str;
                boolean z8;
                EnumC4003b N8 = c4002a.N();
                com.google.gson.f g8 = g(c4002a, N8);
                if (g8 == null) {
                    return f(c4002a, N8);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c4002a.t()) {
                        if (g8 instanceof i) {
                            str = c4002a.H();
                        } else {
                            str = null;
                        }
                        EnumC4003b N9 = c4002a.N();
                        com.google.gson.f g9 = g(c4002a, N9);
                        if (g9 != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (g9 == null) {
                            g9 = f(c4002a, N9);
                        }
                        if (g8 instanceof d) {
                            ((d) g8).m(g9);
                        } else {
                            ((i) g8).m(str, g9);
                        }
                        if (z8) {
                            arrayDeque.addLast(g8);
                            g8 = g9;
                        }
                    } else {
                        if (g8 instanceof d) {
                            c4002a.j();
                        } else {
                            c4002a.k();
                        }
                        if (arrayDeque.isEmpty()) {
                            return g8;
                        }
                        g8 = (com.google.gson.f) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(t1.c cVar, com.google.gson.f fVar) {
                if (fVar != null && !fVar.j()) {
                    if (fVar.l()) {
                        k e8 = fVar.e();
                        if (e8.s()) {
                            cVar.P(e8.n());
                            return;
                        } else if (e8.q()) {
                            cVar.R(e8.m());
                            return;
                        } else {
                            cVar.Q(e8.o());
                            return;
                        }
                    }
                    if (fVar.g()) {
                        cVar.g();
                        Iterator it = fVar.c().iterator();
                        while (it.hasNext()) {
                            d(cVar, (com.google.gson.f) it.next());
                        }
                        cVar.j();
                        return;
                    }
                    if (fVar.k()) {
                        cVar.h();
                        for (Map.Entry entry : fVar.d().n()) {
                            cVar.u((String) entry.getKey());
                            d(cVar, (com.google.gson.f) entry.getValue());
                        }
                        cVar.k();
                        return;
                    }
                    throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
                }
                cVar.z();
            }
        };
        f18908V = typeAdapter15;
        f18909W = d(com.google.gson.f.class, typeAdapter15);
        f18910X = new r() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class c8 = typeToken.c();
                if (Enum.class.isAssignableFrom(c8) && c8 != Enum.class) {
                    if (!c8.isEnum()) {
                        c8 = c8.getSuperclass();
                    }
                    return new EnumTypeAdapter(c8);
                }
                return null;
            }
        };
    }

    public static r a(final Class cls, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                if (typeToken.c() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static r b(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class c8 = typeToken.c();
                if (c8 != cls && c8 != cls2) {
                    return null;
                }
                return typeAdapter;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static r c(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class c8 = typeToken.c();
                if (c8 != cls && c8 != cls2) {
                    return null;
                }
                return typeAdapter;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static r d(final Class cls, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                final Class<?> c8 = typeToken.c();
                if (!cls.isAssignableFrom(c8)) {
                    return null;
                }
                return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                    @Override // com.google.gson.TypeAdapter
                    public Object b(C4002a c4002a) {
                        Object b9 = typeAdapter.b(c4002a);
                        if (b9 != null && !c8.isInstance(b9)) {
                            throw new m("Expected a " + c8.getName() + " but was " + b9.getClass().getName() + "; at path " + c4002a.r());
                        }
                        return b9;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void d(t1.c cVar, Object obj) {
                        typeAdapter.d(cVar, obj);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
