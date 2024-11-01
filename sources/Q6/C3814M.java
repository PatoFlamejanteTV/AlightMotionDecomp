package q6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;
import p6.EnumC3588a;
import s6.C3980F;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.M, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3814M extends r6.b implements w, InterfaceC3821f, r6.p {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37382f = AtomicReferenceFieldUpdater.newUpdater(C3814M.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    private int f37383e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.M$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37384a;

        /* renamed from: b, reason: collision with root package name */
        Object f37385b;

        /* renamed from: c, reason: collision with root package name */
        Object f37386c;

        /* renamed from: d, reason: collision with root package name */
        Object f37387d;

        /* renamed from: e, reason: collision with root package name */
        Object f37388e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37389f;

        /* renamed from: h, reason: collision with root package name */
        int f37391h;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37389f = obj;
            this.f37391h |= Integer.MIN_VALUE;
            return C3814M.this.collect(null, this);
        }
    }

    public C3814M(Object obj) {
        this._state = obj;
    }

    private final boolean p(Object obj, Object obj2) {
        int i8;
        r6.d[] m8;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37382f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC3292y.d(obj3, obj)) {
                return false;
            }
            if (AbstractC3292y.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f37383e;
            if ((i9 & 1) == 0) {
                int i10 = i9 + 1;
                this.f37383e = i10;
                r6.d[] m9 = m();
                Q5.I i11 = Q5.I.f8786a;
                while (true) {
                    O[] oArr = (O[]) m9;
                    if (oArr != null) {
                        for (O o8 : oArr) {
                            if (o8 != null) {
                                o8.g();
                            }
                        }
                    }
                    synchronized (this) {
                        i8 = this.f37383e;
                        if (i8 == i10) {
                            this.f37383e = i10 + 1;
                            return true;
                        }
                        m8 = m();
                        Q5.I i12 = Q5.I.f8786a;
                    }
                    m9 = m8;
                    i10 = i8;
                }
            } else {
                this.f37383e = i9 + 2;
                return true;
            }
        }
    }

    @Override // q6.w
    public boolean a(Object obj, Object obj2) {
        if (obj == null) {
            obj = r6.s.f38851a;
        }
        if (obj2 == null) {
            obj2 = r6.s.f38851a;
        }
        return p(obj, obj2);
    }

    @Override // r6.p
    public InterfaceC3821f b(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return AbstractC3815N.d(this, gVar, i8, enumC3588a);
    }

    @Override // q6.v
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c1 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // q6.InterfaceC3802A, q6.InterfaceC3821f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(q6.InterfaceC3822g r11, U5.d r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C3814M.collect(q6.g, U5.d):java.lang.Object");
    }

    @Override // q6.v
    public boolean d(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // q6.v, q6.InterfaceC3822g
    public Object emit(Object obj, U5.d dVar) {
        setValue(obj);
        return Q5.I.f8786a;
    }

    @Override // q6.w, q6.InterfaceC3813L
    public Object getValue() {
        C3980F c3980f = r6.s.f38851a;
        Object obj = f37382f.get(this);
        if (obj == c3980f) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r6.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public O i() {
        return new O();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r6.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public O[] j(int i8) {
        return new O[i8];
    }

    @Override // q6.w
    public void setValue(Object obj) {
        if (obj == null) {
            obj = r6.s.f38851a;
        }
        p(null, obj);
    }
}
