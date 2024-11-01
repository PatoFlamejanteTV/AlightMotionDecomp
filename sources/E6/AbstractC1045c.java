package E6;

import A6.j;
import A6.k;
import Q5.C1413h;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import y6.InterfaceC4248a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: E6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1045c extends C6.V implements D6.h {

    /* renamed from: c, reason: collision with root package name */
    private final D6.a f2062c;

    /* renamed from: d, reason: collision with root package name */
    private final D6.i f2063d;

    /* renamed from: e, reason: collision with root package name */
    protected final D6.f f2064e;

    public /* synthetic */ AbstractC1045c(D6.a aVar, D6.i iVar, AbstractC3284p abstractC3284p) {
        this(aVar, iVar);
    }

    private final D6.p d0(D6.x xVar, String str) {
        D6.p pVar;
        if (xVar instanceof D6.p) {
            pVar = (D6.p) xVar;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            return pVar;
        }
        throw B.d(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    private final Void t0(String str) {
        throw B.e(-1, "Failed to parse literal as '" + str + "' value", f0().toString());
    }

    @Override // C6.s0, B6.e
    public B6.e A(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (U() != null) {
            return super.A(descriptor);
        }
        return new E(d(), s0()).A(descriptor);
    }

    @Override // C6.V
    protected String Z(String parentName, String childName) {
        AbstractC3292y.i(parentName, "parentName");
        AbstractC3292y.i(childName, "childName");
        return childName;
    }

    public void a(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
    }

    @Override // B6.c
    public F6.b b() {
        return d().e();
    }

    @Override // B6.e
    public B6.c c(A6.f descriptor) {
        boolean z8;
        AbstractC3292y.i(descriptor, "descriptor");
        D6.i f02 = f0();
        A6.j kind = descriptor.getKind();
        if (AbstractC3292y.d(kind, k.b.f289a)) {
            z8 = true;
        } else {
            z8 = kind instanceof A6.d;
        }
        if (z8) {
            D6.a d8 = d();
            if (f02 instanceof D6.b) {
                return new I(d8, (D6.b) f02);
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(D6.b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        if (AbstractC3292y.d(kind, k.c.f290a)) {
            D6.a d9 = d();
            A6.f a9 = V.a(descriptor.h(0), d9.e());
            A6.j kind2 = a9.getKind();
            if (!(kind2 instanceof A6.e) && !AbstractC3292y.d(kind2, j.b.f287a)) {
                if (d9.d().b()) {
                    D6.a d10 = d();
                    if (f02 instanceof D6.b) {
                        return new I(d10, (D6.b) f02);
                    }
                    throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(D6.b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
                }
                throw B.c(a9);
            }
            D6.a d11 = d();
            if (f02 instanceof D6.v) {
                return new J(d11, (D6.v) f02);
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(D6.v.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        D6.a d12 = d();
        if (f02 instanceof D6.v) {
            return new H(d12, (D6.v) f02, null, null, 12, null);
        }
        throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(D6.v.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
    }

    @Override // D6.h
    public D6.a d() {
        return this.f2062c;
    }

    protected abstract D6.i e0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final D6.i f0() {
        D6.i e02;
        String str = (String) U();
        if (str == null || (e02 = e0(str)) == null) {
            return s0();
        }
        return e02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String tag) {
        AbstractC3292y.i(tag, "tag");
        try {
            Boolean c8 = D6.j.c(r0(tag));
            if (c8 != null) {
                return c8.booleanValue();
            }
            t0(TypedValues.Custom.S_BOOLEAN);
            throw new C1413h();
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_BOOLEAN);
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String tag) {
        Byte b9;
        AbstractC3292y.i(tag, "tag");
        try {
            int g8 = D6.j.g(r0(tag));
            if (-128 <= g8 && g8 <= 127) {
                b9 = Byte.valueOf((byte) g8);
            } else {
                b9 = null;
            }
            if (b9 != null) {
                return b9.byteValue();
            }
            t0("byte");
            throw new C1413h();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String tag) {
        AbstractC3292y.i(tag, "tag");
        try {
            return l6.n.S0(r0(tag).c());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String tag) {
        AbstractC3292y.i(tag, "tag");
        try {
            double e8 = D6.j.e(r0(tag));
            if (!d().d().a() && (Double.isInfinite(e8) || Double.isNaN(e8))) {
                throw B.a(Double.valueOf(e8), tag, f0().toString());
            }
            return e8;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String tag, A6.f enumDescriptor) {
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.i(enumDescriptor, "enumDescriptor");
        return C.j(enumDescriptor, d(), r0(tag).c(), null, 4, null);
    }

    @Override // D6.h
    public D6.i l() {
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String tag) {
        AbstractC3292y.i(tag, "tag");
        try {
            float f8 = D6.j.f(r0(tag));
            if (!d().d().a() && (Float.isInfinite(f8) || Float.isNaN(f8))) {
                throw B.a(Float.valueOf(f8), tag, f0().toString());
            }
            return f8;
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_FLOAT);
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public B6.e P(String tag, A6.f inlineDescriptor) {
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.i(inlineDescriptor, "inlineDescriptor");
        if (P.b(inlineDescriptor)) {
            return new w(new Q(r0(tag).c()), d());
        }
        return super.P(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String tag) {
        AbstractC3292y.i(tag, "tag");
        try {
            return D6.j.g(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String tag) {
        AbstractC3292y.i(tag, "tag");
        try {
            return D6.j.k(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String tag) {
        Short sh;
        AbstractC3292y.i(tag, "tag");
        try {
            int g8 = D6.j.g(r0(tag));
            if (-32768 <= g8 && g8 <= 32767) {
                sh = Short.valueOf((short) g8);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            t0("short");
            throw new C1413h();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.s0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String tag) {
        AbstractC3292y.i(tag, "tag");
        D6.x r02 = r0(tag);
        if (!d().d().o() && !d0(r02, TypedValues.Custom.S_STRING).g()) {
            throw B.e(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", f0().toString());
        }
        if (!(r02 instanceof D6.t)) {
            return r02.c();
        }
        throw B.e(-1, "Unexpected 'null' value instead of string literal", f0().toString());
    }

    protected final D6.x r0(String tag) {
        D6.x xVar;
        AbstractC3292y.i(tag, "tag");
        D6.i e02 = e0(tag);
        if (e02 instanceof D6.x) {
            xVar = (D6.x) e02;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        throw B.e(-1, "Expected JsonPrimitive at " + tag + ", found " + e02, f0().toString());
    }

    public abstract D6.i s0();

    @Override // C6.s0, B6.e
    public Object w(InterfaceC4248a deserializer) {
        AbstractC3292y.i(deserializer, "deserializer");
        return L.d(this, deserializer);
    }

    @Override // B6.e
    public boolean x() {
        return !(f0() instanceof D6.t);
    }

    private AbstractC1045c(D6.a aVar, D6.i iVar) {
        this.f2062c = aVar;
        this.f2063d = iVar;
        this.f2064e = d().d();
    }
}
