package j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {

    /* renamed from: g, reason: collision with root package name */
    static final int f33087g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f33088h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f33089i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f33090j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f33091k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f33092l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f33093m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f33094n;

    /* renamed from: o, reason: collision with root package name */
    private static final int f33095o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    volatile transient l[] f33096a;

    /* renamed from: b, reason: collision with root package name */
    private volatile transient l[] f33097b;
    private volatile transient long baseCount;

    /* renamed from: c, reason: collision with root package name */
    private volatile transient c[] f33098c;
    private volatile transient int cellsBusy;

    /* renamed from: d, reason: collision with root package name */
    private transient i f33099d;

    /* renamed from: e, reason: collision with root package name */
    private transient s f33100e;

    /* renamed from: f, reason: collision with root package name */
    private transient e f33101f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a h8 = j$.sun.misc.a.h();
        f33088h = h8;
        f33089i = h8.j(ConcurrentHashMap.class, "sizeCtl");
        f33090j = h8.j(ConcurrentHashMap.class, "transferIndex");
        f33091k = h8.j(ConcurrentHashMap.class, "baseCount");
        f33092l = h8.j(ConcurrentHashMap.class, "cellsBusy");
        f33093m = h8.j(c.class, "value");
        f33094n = h8.a(l[].class);
        int b9 = h8.b(l[].class);
        if (((b9 - 1) & b9) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f33095o = 31 - Integer.numberOfLeadingZeros(b9);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i8) {
        this(i8, 0.75f, 1);
    }

    public ConcurrentHashMap(int i8, float f8, int i9) {
        if (f8 <= 0.0f || i8 < 0 || i9 <= 0) {
            throw new IllegalArgumentException();
        }
        long j8 = (long) (((i8 < i9 ? i9 : i8) / f8) + 1.0d);
        this.sizeCtl = j8 >= 1073741824 ? 1073741824 : l((int) j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x013f, code lost:            if (r25.f33098c != r7) goto L150;     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0141, code lost:            r25.f33098c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:            if (r1.d(r25, r3, r5, r14) == false) goto L6;     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(l[] lVarArr, int i8, l lVar) {
        return f33088h.e(lVarArr, (i8 << f33095o) + f33094n, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.f33096a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i8 = this.sizeCtl;
            if (i8 < 0) {
                Thread.yield();
            } else if (f33088h.c(this, f33089i, i8, -1)) {
                try {
                    l[] lVarArr2 = this.f33096a;
                    if (lVarArr2 != null) {
                        if (lVarArr2.length == 0) {
                        }
                        this.sizeCtl = i8;
                        return lVarArr2;
                    }
                    int i9 = i8 > 0 ? i8 : 16;
                    l[] lVarArr3 = new l[i9];
                    this.f33096a = lVarArr3;
                    i8 = i9 - (i9 >>> 2);
                    lVarArr2 = lVarArr3;
                    this.sizeCtl = i8;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i8;
                    throw th;
                }
            }
        }
    }

    static final void h(l[] lVarArr, int i8, l lVar) {
        f33088h.l(lVarArr, (i8 << f33095o) + f33094n, lVar);
    }

    static final int i(int i8) {
        return (i8 ^ (i8 >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l k(l[] lVarArr, int i8) {
        return (l) f33088h.g(lVarArr, (i8 << f33095o) + f33094n);
    }

    private static final int l(int i8) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i8 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i8;
        int i9;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i10;
        r rVar;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i11 = f33087g;
        int i12 = i11 > 1 ? (length >>> 3) / i11 : length;
        int i13 = i12 < 16 ? 16 : i12;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.f33097b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        int i14 = 0;
        int i15 = 0;
        boolean z8 = true;
        boolean z9 = false;
        while (true) {
            if (z8) {
                int i16 = i15 - 1;
                if (i16 >= i14 || z9) {
                    i14 = i14;
                    i15 = i16;
                } else {
                    int i17 = concurrentHashMap2.transferIndex;
                    if (i17 <= 0) {
                        i15 = -1;
                    } else {
                        j$.sun.misc.a aVar = f33088h;
                        long j8 = f33090j;
                        int i18 = i17 > i13 ? i17 - i13 : 0;
                        int i19 = i14;
                        if (aVar.c(this, j8, i17, i18)) {
                            i15 = i17 - 1;
                            i14 = i18;
                        } else {
                            i14 = i19;
                            i15 = i16;
                        }
                    }
                }
                z8 = false;
            } else {
                int i20 = i14;
                r rVar2 = null;
                if (i15 < 0 || i15 >= length || (i10 = i15 + length) >= length2) {
                    i8 = i13;
                    i9 = length2;
                    gVar = gVar2;
                    concurrentHashMap = this;
                    if (z9) {
                        concurrentHashMap.f33097b = null;
                        concurrentHashMap.f33096a = lVarArr3;
                        concurrentHashMap.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    j$.sun.misc.a aVar2 = f33088h;
                    long j9 = f33089i;
                    int i21 = concurrentHashMap.sizeCtl;
                    int i22 = i15;
                    if (!aVar2.c(this, j9, i21, i21 - 1)) {
                        i15 = i22;
                    } else {
                        if (i21 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i15 = length;
                        z8 = true;
                        z9 = true;
                    }
                } else {
                    ?? k8 = k(lVarArr4, i15);
                    if (k8 == 0) {
                        z8 = b(lVarArr4, i15, gVar2);
                        concurrentHashMap = concurrentHashMap2;
                        i8 = i13;
                        i9 = length2;
                        gVar = gVar2;
                    } else {
                        int i23 = k8.f33121a;
                        if (i23 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i8 = i13;
                            i9 = length2;
                            gVar = gVar2;
                            z8 = true;
                        } else {
                            synchronized (k8) {
                                try {
                                    if (k(lVarArr4, i15) == k8) {
                                        if (i23 >= 0) {
                                            int i24 = i23 & length;
                                            r rVar3 = k8;
                                            for (r rVar4 = k8.f33124d; rVar4 != null; rVar4 = rVar4.f33124d) {
                                                int i25 = rVar4.f33121a & length;
                                                if (i25 != i24) {
                                                    rVar3 = rVar4;
                                                    i24 = i25;
                                                }
                                            }
                                            if (i24 == 0) {
                                                rVar = null;
                                                rVar2 = rVar3;
                                            } else {
                                                rVar = rVar3;
                                            }
                                            l lVar = k8;
                                            while (lVar != rVar3) {
                                                int i26 = lVar.f33121a;
                                                Object obj = lVar.f33122b;
                                                int i27 = i13;
                                                Object obj2 = lVar.f33123c;
                                                int i28 = length2;
                                                if ((i26 & length) == 0) {
                                                    rVar2 = new l(i26, obj, obj2, rVar2);
                                                } else {
                                                    rVar = new l(i26, obj, obj2, rVar);
                                                }
                                                lVar = lVar.f33124d;
                                                i13 = i27;
                                                length2 = i28;
                                            }
                                            i8 = i13;
                                            i9 = length2;
                                            h(lVarArr3, i15, rVar2);
                                            h(lVarArr3, i10, rVar);
                                            h(lVarArr4, i15, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i8 = i13;
                                            i9 = length2;
                                            if (k8 instanceof q) {
                                                q qVar = (q) k8;
                                                r rVar5 = null;
                                                r rVar6 = null;
                                                l lVar2 = qVar.f33140f;
                                                int i29 = 0;
                                                int i30 = 0;
                                                r rVar7 = null;
                                                while (lVar2 != null) {
                                                    q qVar2 = qVar;
                                                    int i31 = lVar2.f33121a;
                                                    g gVar3 = gVar2;
                                                    r rVar8 = new r(i31, lVar2.f33122b, lVar2.f33123c, null, null);
                                                    if ((i31 & length) == 0) {
                                                        rVar8.f33145h = rVar6;
                                                        if (rVar6 == null) {
                                                            rVar2 = rVar8;
                                                        } else {
                                                            rVar6.f33124d = rVar8;
                                                        }
                                                        i29++;
                                                        rVar6 = rVar8;
                                                    } else {
                                                        rVar8.f33145h = rVar5;
                                                        if (rVar5 == null) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            rVar5.f33124d = rVar8;
                                                        }
                                                        i30++;
                                                        rVar5 = rVar8;
                                                    }
                                                    lVar2 = lVar2.f33124d;
                                                    qVar = qVar2;
                                                    gVar2 = gVar3;
                                                }
                                                q qVar3 = qVar;
                                                g gVar4 = gVar2;
                                                l p8 = i29 <= 6 ? p(rVar2) : i30 != 0 ? new q(rVar2) : qVar3;
                                                l p9 = i30 <= 6 ? p(rVar7) : i29 != 0 ? new q(rVar7) : qVar3;
                                                h(lVarArr3, i15, p8);
                                                h(lVarArr3, i10, p9);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i15, gVar);
                                            }
                                        }
                                        z8 = true;
                                    } else {
                                        i8 = i13;
                                        i9 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                i14 = i20;
                i13 = i8;
                length2 = i9;
            }
        }
    }

    private final void n(l[] lVarArr, int i8) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k8 = k(lVarArr, i8);
        if (k8 == null || k8.f33121a < 0) {
            return;
        }
        synchronized (k8) {
            try {
                if (k(lVarArr, i8) == k8) {
                    r rVar = null;
                    l lVar = k8;
                    r rVar2 = null;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f33121a, lVar.f33122b, lVar.f33123c, null, null);
                        rVar3.f33145h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f33124d = rVar3;
                        }
                        lVar = lVar.f33124d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i8, new q(rVar));
                }
            } finally {
            }
        }
    }

    private final void o(int i8) {
        int length;
        int l8 = i8 >= 536870912 ? 1073741824 : l(i8 + (i8 >>> 1) + 1);
        while (true) {
            int i9 = this.sizeCtl;
            if (i9 < 0) {
                return;
            }
            l[] lVarArr = this.f33096a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i10 = i9 > l8 ? i9 : l8;
                if (f33088h.c(this, f33089i, i9, -1)) {
                    try {
                        if (this.f33096a == lVarArr) {
                            this.f33096a = new l[i10];
                            i9 = i10 - (i10 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i9;
                    }
                } else {
                    continue;
                }
            } else {
                if (l8 <= i9 || length >= 1073741824) {
                    return;
                }
                if (lVarArr == this.f33096a) {
                    if (f33088h.c(this, f33089i, i9, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(lVarArr, null);
                    }
                }
            }
        }
    }

    static l p(l lVar) {
        l lVar2 = null;
        l lVar3 = null;
        while (lVar != null) {
            l lVar4 = new l(lVar.f33121a, lVar.f33122b, lVar.f33123c);
            if (lVar3 == null) {
                lVar2 = lVar4;
            } else {
                lVar3.f33124d = lVar4;
            }
            lVar = lVar.f33124d;
            lVar3 = lVar4;
        }
        return lVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j8;
        boolean z8;
        boolean z9;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j9 = 0;
        long j10 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j8 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j10++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j10 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j11 = (long) ((((float) j10) / 0.75f) + 1.0d);
        int l8 = j11 >= 1073741824 ? 1073741824 : l((int) j11);
        l[] lVarArr = new l[l8];
        int i8 = l8 - 1;
        while (lVar != null) {
            l lVar2 = lVar.f33124d;
            int i9 = lVar.f33121a;
            int i10 = i9 & i8;
            l k8 = k(lVarArr, i10);
            if (k8 == null) {
                z9 = true;
            } else {
                Object obj2 = lVar.f33122b;
                if (k8.f33121a >= 0) {
                    int i11 = 0;
                    for (l lVar3 = k8; lVar3 != null; lVar3 = lVar3.f33124d) {
                        if (lVar3.f33121a == i9 && ((obj = lVar3.f33122b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z8 = false;
                            break;
                        }
                        i11++;
                    }
                    z8 = true;
                    if (!z8 || i11 < 8) {
                        z9 = z8;
                    } else {
                        long j12 = j9 + 1;
                        lVar.f33124d = k8;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j13 = j12;
                            r rVar3 = new r(lVar4.f33121a, lVar4.f33122b, lVar4.f33123c, null, null);
                            rVar3.f33145h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f33124d = rVar3;
                            }
                            lVar4 = lVar4.f33124d;
                            rVar2 = rVar3;
                            j12 = j13;
                        }
                        h(lVarArr, i10, new q(rVar));
                        j9 = j12;
                    }
                } else if (((q) k8).e(i9, obj2, lVar.f33123c) == null) {
                    j9 += j8;
                }
                z9 = false;
            }
            j8 = 1;
            if (z9) {
                j9++;
                lVar.f33124d = k8;
                h(lVarArr, i10, lVar);
            }
            lVar = lVar2;
        }
        this.f33096a = lVarArr;
        this.sizeCtl = l8 - (l8 >>> 2);
        this.baseCount = j9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i8 = 1;
        int i9 = 0;
        while (i8 < 16) {
            i9++;
            i8 <<= 1;
        }
        int i10 = 32 - i9;
        int i11 = i8 - 1;
        n[] nVarArr = new n[16];
        for (int i12 = 0; i12 < 16; i12++) {
            nVarArr[i12] = new ReentrantLock();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i10);
        putFields.put("segmentMask", i11);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f33096a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a9 = pVar.a();
                if (a9 == null) {
                    break;
                }
                objectOutputStream.writeObject(a9.f33122b);
                objectOutputStream.writeObject(a9.f33123c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        l k8;
        l[] lVarArr = this.f33096a;
        long j8 = 0;
        loop0: while (true) {
            int i8 = 0;
            while (lVarArr != null && i8 < lVarArr.length) {
                k8 = k(lVarArr, i8);
                if (k8 == null) {
                    i8++;
                } else {
                    int i9 = k8.f33121a;
                    if (i9 == -1) {
                        break;
                    }
                    synchronized (k8) {
                        try {
                            if (k(lVarArr, i8) == k8) {
                                for (l lVar = i9 >= 0 ? k8 : k8 instanceof q ? ((q) k8).f33140f : null; lVar != null; lVar = lVar.f33124d) {
                                    j8--;
                                }
                                h(lVarArr, i8, null);
                                i8++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k8);
        }
        if (j8 != 0) {
            a(j8, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0112, code lost:            if (r4 == 0) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:            a(r4, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0118, code lost:            return r5;     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f0, code lost:            if (r5 == null) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:            a(1, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:            return r5;     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:            throw new java.lang.IllegalStateException("Recursive update");     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.f33096a
            r3 = 0
            r5 = r0
            r4 = 0
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f33121a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f33121a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f33122b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f33123c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f33123c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f33124d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f33124d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = -1
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f33124d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f33139e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f33123c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f33123c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f33140f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = -1
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f33096a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a9 = pVar.a();
                if (a9 == null) {
                    break;
                }
                Object obj2 = a9.f33123c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    final l[] d(l[] lVarArr, l lVar) {
        l[] lVarArr2;
        int i8;
        if (!(lVar instanceof g) || (lVarArr2 = ((g) lVar).f33114e) == null) {
            return this.f33096a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
        while (true) {
            if (lVarArr2 != this.f33097b || this.f33096a != lVarArr || (i8 = this.sizeCtl) >= 0 || (i8 >>> 16) != numberOfLeadingZeros || i8 == numberOfLeadingZeros + 1 || i8 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            }
            if (f33088h.c(this, f33089i, i8, i8 + 1)) {
                m(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f33101f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = (Set<Map.Entry<K, V>>) new b(this);
        this.f33101f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArr = this.f33096a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l a9 = pVar.a();
            if (a9 == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v8 = get(key)) == null || (value != v8 && !value.equals(v8))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = a9.f33123c;
            Object obj3 = map.get(a9.f33122b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:            a(1, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a5, code lost:            throw new java.lang.IllegalStateException("Recursive update");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f33096a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a9 = pVar.a();
            if (a9 == null) {
                return;
            } else {
                biConsumer.accept(a9.f33122b, a9.f33123c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ab, code lost:            throw new java.lang.IllegalStateException("Recursive update");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r12.f33096a
        La:
            r2 = 0
            if (r1 == 0) goto Lbd
            int r3 = r1.length
            if (r3 == 0) goto Lbd
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r4 = k(r1, r3)
            if (r4 != 0) goto L1b
            goto Lbd
        L1b:
            int r5 = r4.f33121a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.l[] r1 = r12.d(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.l r7 = k(r1, r3)     // Catch: java.lang.Throwable -> L42
            if (r7 != r4) goto Lac
            r7 = 1
            if (r5 < 0) goto L6e
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.f33121a     // Catch: java.lang.Throwable -> L42
            if (r9 != r0) goto L65
            java.lang.Object r9 = r5.f33122b     // Catch: java.lang.Throwable -> L42
            if (r9 == r13) goto L45
            if (r9 == 0) goto L65
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L65
            goto L45
        L42:
            r13 = move-exception
            goto Lbb
        L45:
            java.lang.Object r9 = r5.f33123c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L53
            if (r15 == r9) goto L53
            if (r9 == 0) goto Lad
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lad
        L53:
            if (r14 == 0) goto L58
            r5.f33123c = r14     // Catch: java.lang.Throwable -> L42
            goto Lae
        L58:
            if (r8 == 0) goto L5f
            j$.util.concurrent.l r3 = r5.f33124d     // Catch: java.lang.Throwable -> L42
            r8.f33124d = r3     // Catch: java.lang.Throwable -> L42
            goto Lae
        L5f:
            j$.util.concurrent.l r5 = r5.f33124d     // Catch: java.lang.Throwable -> L42
        L61:
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lae
        L65:
            j$.util.concurrent.l r8 = r5.f33124d     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L6a
            goto Lad
        L6a:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6e:
            boolean r5 = r4 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L9f
            r5 = r4
            j$.util.concurrent.q r5 = (j$.util.concurrent.q) r5     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.r r8 = r5.f33139e     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lad
            j$.util.concurrent.r r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lad
            java.lang.Object r9 = r8.f33123c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L8d
            if (r15 == r9) goto L8d
            if (r9 == 0) goto Lad
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lad
        L8d:
            if (r14 == 0) goto L92
            r8.f33123c = r14     // Catch: java.lang.Throwable -> L42
            goto Lae
        L92:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lae
            j$.util.concurrent.r r5 = r5.f33140f     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.l r5 = p(r5)     // Catch: java.lang.Throwable -> L42
            goto L61
        L9f:
            boolean r3 = r4 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La4
            goto Lac
        La4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L42
            throw r13     // Catch: java.lang.Throwable -> L42
        Lac:
            r7 = 0
        Lad:
            r9 = r2
        Lae:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto La
            if (r9 == 0) goto Lbd
            if (r14 != 0) goto Lba
            r13 = -1
            r12.a(r13, r6)
        Lba:
            return r9
        Lbb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r13
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:            return (V) r1.f33123c;     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r4.f33096a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r1 = k(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f33121a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f33122b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f33123c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.l r5 = r1.a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f33123c
        L36:
            return r2
        L37:
            j$.util.concurrent.l r1 = r1.f33124d
            if (r1 == 0) goto L4e
            int r3 = r1.f33121a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f33122b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f33123c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v8 = get(obj);
        return v8 == null ? obj2 : v8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f33096a;
        int i8 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a9 = pVar.a();
                if (a9 == null) {
                    break;
                }
                i8 += a9.f33123c.hashCode() ^ a9.f33122b.hashCode();
            }
        }
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long j() {
        c[] cVarArr = this.f33098c;
        long j8 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j8 += cVar.value;
                }
            }
        }
        return j8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.f33099d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = (Set<K>) new b(this);
        this.f33099d = iVar2;
        return iVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:            throw new java.lang.IllegalStateException("Recursive update");     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k8, V v8) {
        return (V) f(k8, v8, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k8, V v8) {
        return (V) f(k8, v8, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 != null) {
            return g(obj, obj2, null);
        }
        throw null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f33096a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a9 = pVar.a();
            if (a9 == null) {
                return;
            }
            Object obj = a9.f33123c;
            Object obj2 = a9.f33122b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j8 = j();
        if (j8 < 0) {
            return 0;
        }
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j8;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f33096a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l a9 = pVar.a();
        if (a9 != null) {
            while (true) {
                Object obj = a9.f33122b;
                Object obj2 = a9.f33123c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                a9 = pVar.a();
                if (a9 == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.f33100e;
        if (sVar != null) {
            return sVar;
        }
        b bVar = new b(this);
        this.f33100e = bVar;
        return bVar;
    }
}
