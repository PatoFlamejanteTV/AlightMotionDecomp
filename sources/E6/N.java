package E6;

import A6.j;
import C6.AbstractC1007b;
import Q5.C1413h;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3292y;
import y6.InterfaceC4248a;

/* loaded from: classes5.dex */
public class N extends B6.a implements D6.h {

    /* renamed from: a, reason: collision with root package name */
    private final D6.a f2027a;

    /* renamed from: b, reason: collision with root package name */
    private final U f2028b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1043a f2029c;

    /* renamed from: d, reason: collision with root package name */
    private final F6.b f2030d;

    /* renamed from: e, reason: collision with root package name */
    private int f2031e;

    /* renamed from: f, reason: collision with root package name */
    private a f2032f;

    /* renamed from: g, reason: collision with root package name */
    private final D6.f f2033g;

    /* renamed from: h, reason: collision with root package name */
    private final y f2034h;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f2035a;

        public a(String str) {
            this.f2035a = str;
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2036a;

        static {
            int[] iArr = new int[U.values().length];
            try {
                iArr[U.f2051d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U.f2052e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[U.f2053f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[U.f2050c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2036a = iArr;
        }
    }

    public N(D6.a json, U mode, AbstractC1043a lexer, A6.f descriptor, a aVar) {
        y yVar;
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(mode, "mode");
        AbstractC3292y.i(lexer, "lexer");
        AbstractC3292y.i(descriptor, "descriptor");
        this.f2027a = json;
        this.f2028b = mode;
        this.f2029c = lexer;
        this.f2030d = json.e();
        this.f2031e = -1;
        this.f2032f = aVar;
        D6.f d8 = json.d();
        this.f2033g = d8;
        if (d8.h()) {
            yVar = null;
        } else {
            yVar = new y(descriptor);
        }
        this.f2034h = yVar;
    }

    private final void K() {
        if (this.f2029c.F() != 4) {
            return;
        }
        AbstractC1043a.x(this.f2029c, "Unexpected leading comma", 0, null, 6, null);
        throw new C1413h();
    }

    private final boolean L(A6.f fVar, int i8) {
        String G8;
        D6.a aVar = this.f2027a;
        A6.f h8 = fVar.h(i8);
        if (!h8.c() && this.f2029c.N(true)) {
            return true;
        }
        if (!AbstractC3292y.d(h8.getKind(), j.b.f287a) || ((h8.c() && this.f2029c.N(false)) || (G8 = this.f2029c.G(this.f2033g.o())) == null || C.h(h8, aVar, G8) != -3)) {
            return false;
        }
        this.f2029c.o();
        return true;
    }

    private final int M() {
        boolean M8 = this.f2029c.M();
        if (this.f2029c.e()) {
            int i8 = this.f2031e;
            if (i8 != -1 && !M8) {
                AbstractC1043a.x(this.f2029c, "Expected end of the array or comma", 0, null, 6, null);
                throw new C1413h();
            }
            int i9 = i8 + 1;
            this.f2031e = i9;
            return i9;
        }
        if (!M8 || this.f2027a.d().c()) {
            return -1;
        }
        B.g(this.f2029c, "array");
        throw new C1413h();
    }

    private final int N() {
        boolean z8;
        int i8 = this.f2031e;
        boolean z9 = false;
        if (i8 % 2 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (i8 != -1) {
                z9 = this.f2029c.M();
            }
        } else {
            this.f2029c.l(':');
        }
        if (this.f2029c.e()) {
            if (z8) {
                if (this.f2031e == -1) {
                    AbstractC1043a abstractC1043a = this.f2029c;
                    boolean z10 = !z9;
                    int i9 = abstractC1043a.f2058a;
                    if (!z10) {
                        AbstractC1043a.x(abstractC1043a, "Unexpected leading comma", i9, null, 4, null);
                        throw new C1413h();
                    }
                } else {
                    AbstractC1043a abstractC1043a2 = this.f2029c;
                    int i10 = abstractC1043a2.f2058a;
                    if (!z9) {
                        AbstractC1043a.x(abstractC1043a2, "Expected comma after the key-value pair", i10, null, 4, null);
                        throw new C1413h();
                    }
                }
            }
            int i11 = this.f2031e + 1;
            this.f2031e = i11;
            return i11;
        }
        if (!z9 || this.f2027a.d().c()) {
            return -1;
        }
        B.h(this.f2029c, null, 1, null);
        throw new C1413h();
    }

    private final int O(A6.f fVar) {
        int h8;
        boolean z8;
        boolean M8 = this.f2029c.M();
        while (true) {
            boolean z9 = true;
            if (this.f2029c.e()) {
                String P8 = P();
                this.f2029c.l(':');
                h8 = C.h(fVar, this.f2027a, P8);
                if (h8 != -3) {
                    if (!this.f2033g.e() || !L(fVar, h8)) {
                        break;
                    }
                    z8 = this.f2029c.M();
                    z9 = false;
                } else {
                    z8 = false;
                }
                if (z9) {
                    M8 = Q(P8);
                } else {
                    M8 = z8;
                }
            } else {
                if (M8 && !this.f2027a.d().c()) {
                    B.h(this.f2029c, null, 1, null);
                    throw new C1413h();
                }
                y yVar = this.f2034h;
                if (yVar != null) {
                    return yVar.d();
                }
                return -1;
            }
        }
        y yVar2 = this.f2034h;
        if (yVar2 != null) {
            yVar2.c(h8);
        }
        return h8;
    }

    private final String P() {
        if (this.f2033g.o()) {
            return this.f2029c.r();
        }
        return this.f2029c.i();
    }

    private final boolean Q(String str) {
        if (!this.f2033g.i() && !S(this.f2032f, str)) {
            this.f2029c.A(str);
        } else {
            this.f2029c.I(this.f2033g.o());
        }
        return this.f2029c.M();
    }

    private final void R(A6.f fVar) {
        do {
        } while (y(fVar) != -1);
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !AbstractC3292y.d(aVar.f2035a, str)) {
            return false;
        }
        aVar.f2035a = null;
        return true;
    }

    @Override // B6.a, B6.e
    public B6.e A(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (P.b(descriptor)) {
            return new w(this.f2029c, this.f2027a);
        }
        return super.A(descriptor);
    }

    @Override // B6.a, B6.e
    public byte D() {
        long m8 = this.f2029c.m();
        byte b9 = (byte) m8;
        if (m8 == b9) {
            return b9;
        }
        AbstractC1043a.x(this.f2029c, "Failed to parse byte for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1413h();
    }

    @Override // B6.a, B6.e
    public short F() {
        long m8 = this.f2029c.m();
        short s8 = (short) m8;
        if (m8 == s8) {
            return s8;
        }
        AbstractC1043a.x(this.f2029c, "Failed to parse short for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1413h();
    }

    @Override // B6.a, B6.e
    public float G() {
        AbstractC1043a abstractC1043a = this.f2029c;
        String q8 = abstractC1043a.q();
        try {
            float parseFloat = Float.parseFloat(q8);
            if (!this.f2027a.d().a() && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                B.k(this.f2029c, Float.valueOf(parseFloat));
                throw new C1413h();
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC1043a.x(abstractC1043a, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1413h();
        }
    }

    @Override // B6.a, B6.e
    public double H() {
        AbstractC1043a abstractC1043a = this.f2029c;
        String q8 = abstractC1043a.q();
        try {
            double parseDouble = Double.parseDouble(q8);
            if (!this.f2027a.d().a() && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                B.k(this.f2029c, Double.valueOf(parseDouble));
                throw new C1413h();
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC1043a.x(abstractC1043a, "Failed to parse type 'double' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1413h();
        }
    }

    @Override // B6.a, B6.c
    public void a(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (this.f2027a.d().i() && descriptor.e() == 0) {
            R(descriptor);
        }
        if (this.f2029c.M() && !this.f2027a.d().c()) {
            B.g(this.f2029c, "");
            throw new C1413h();
        }
        this.f2029c.l(this.f2028b.f2057b);
        this.f2029c.f2059b.b();
    }

    @Override // B6.c
    public F6.b b() {
        return this.f2030d;
    }

    @Override // B6.a, B6.e
    public B6.c c(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        U b9 = V.b(this.f2027a, descriptor);
        this.f2029c.f2059b.c(descriptor);
        this.f2029c.l(b9.f2056a);
        K();
        int i8 = b.f2036a[b9.ordinal()];
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            if (this.f2028b == b9 && this.f2027a.d().h()) {
                return this;
            }
            return new N(this.f2027a, b9, this.f2029c, descriptor, this.f2032f);
        }
        return new N(this.f2027a, b9, this.f2029c, descriptor, this.f2032f);
    }

    @Override // D6.h
    public final D6.a d() {
        return this.f2027a;
    }

    @Override // B6.a, B6.e
    public boolean f() {
        return this.f2029c.g();
    }

    @Override // B6.a, B6.e
    public char h() {
        String q8 = this.f2029c.q();
        if (q8.length() == 1) {
            return q8.charAt(0);
        }
        AbstractC1043a.x(this.f2029c, "Expected single char, but got '" + q8 + '\'', 0, null, 6, null);
        throw new C1413h();
    }

    @Override // B6.a, B6.e
    public int i(A6.f enumDescriptor) {
        AbstractC3292y.i(enumDescriptor, "enumDescriptor");
        return C.i(enumDescriptor, this.f2027a, r(), " at path " + this.f2029c.f2059b.a());
    }

    @Override // D6.h
    public D6.i l() {
        return new K(this.f2027a.d(), this.f2029c).e();
    }

    @Override // B6.a, B6.e
    public int n() {
        long m8 = this.f2029c.m();
        int i8 = (int) m8;
        if (m8 == i8) {
            return i8;
        }
        AbstractC1043a.x(this.f2029c, "Failed to parse int for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1413h();
    }

    @Override // B6.a, B6.c
    public Object p(A6.f descriptor, int i8, InterfaceC4248a deserializer, Object obj) {
        boolean z8;
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(deserializer, "deserializer");
        if (this.f2028b == U.f2052e && (i8 & 1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.f2029c.f2059b.d();
        }
        Object p8 = super.p(descriptor, i8, deserializer, obj);
        if (z8) {
            this.f2029c.f2059b.f(p8);
        }
        return p8;
    }

    @Override // B6.a, B6.e
    public Void q() {
        return null;
    }

    @Override // B6.a, B6.e
    public String r() {
        if (this.f2033g.o()) {
            return this.f2029c.r();
        }
        return this.f2029c.o();
    }

    @Override // B6.a, B6.e
    public long v() {
        return this.f2029c.m();
    }

    @Override // B6.a, B6.e
    public Object w(InterfaceC4248a deserializer) {
        AbstractC3292y.i(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC1007b) && !this.f2027a.d().n()) {
                String c8 = L.c(deserializer.a(), this.f2027a);
                String E8 = this.f2029c.E(c8, this.f2033g.o());
                if (E8 == null) {
                    return L.d(this, deserializer);
                }
                try {
                    InterfaceC4248a a9 = y6.f.a((AbstractC1007b) deserializer, this, E8);
                    AbstractC3292y.g(a9, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f2032f = new a(c8);
                    return a9.d(this);
                } catch (y6.h e8) {
                    String message = e8.getMessage();
                    AbstractC3292y.f(message);
                    String l02 = l6.n.l0(l6.n.J0(message, '\n', null, 2, null), ".");
                    String message2 = e8.getMessage();
                    AbstractC3292y.f(message2);
                    AbstractC1043a.x(this.f2029c, l02, 0, l6.n.B0(message2, '\n', ""), 2, null);
                    throw new C1413h();
                }
            }
            return deserializer.d(this);
        } catch (y6.c e9) {
            String message3 = e9.getMessage();
            AbstractC3292y.f(message3);
            if (l6.n.G(message3, "at path", false, 2, null)) {
                throw e9;
            }
            throw new y6.c(e9.a(), e9.getMessage() + " at path: " + this.f2029c.f2059b.a(), e9);
        }
    }

    @Override // B6.a, B6.e
    public boolean x() {
        boolean z8;
        y yVar = this.f2034h;
        if (yVar != null) {
            z8 = yVar.b();
        } else {
            z8 = false;
        }
        if (z8 || AbstractC1043a.O(this.f2029c, false, 1, null)) {
            return false;
        }
        return true;
    }

    @Override // B6.c
    public int y(A6.f descriptor) {
        int N8;
        AbstractC3292y.i(descriptor, "descriptor");
        int i8 = b.f2036a[this.f2028b.ordinal()];
        if (i8 != 2) {
            if (i8 != 4) {
                N8 = M();
            } else {
                N8 = O(descriptor);
            }
        } else {
            N8 = N();
        }
        if (this.f2028b != U.f2052e) {
            this.f2029c.f2059b.g(N8);
        }
        return N8;
    }
}
