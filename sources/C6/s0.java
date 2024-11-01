package C6;

import B6.c;
import R5.AbstractC1435t;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import y6.InterfaceC4248a;

/* loaded from: classes5.dex */
public abstract class s0 implements B6.e, B6.c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f1095a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f1096b;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4248a f1098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1099c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC4248a interfaceC4248a, Object obj) {
            super(0);
            this.f1098b = interfaceC4248a;
            this.f1099c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            s0 s0Var = s0.this;
            InterfaceC4248a interfaceC4248a = this.f1098b;
            Object obj = this.f1099c;
            if (!interfaceC4248a.a().c() && !s0Var.x()) {
                return s0Var.q();
            }
            return s0Var.I(interfaceC4248a, obj);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4248a f1101b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC4248a interfaceC4248a, Object obj) {
            super(0);
            this.f1101b = interfaceC4248a;
            this.f1102c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return s0.this.I(this.f1101b, this.f1102c);
        }
    }

    private final Object Y(Object obj, Function0 function0) {
        X(obj);
        Object invoke = function0.invoke();
        if (!this.f1096b) {
            W();
        }
        this.f1096b = false;
        return invoke;
    }

    @Override // B6.e
    public B6.e A(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        return P(W(), descriptor);
    }

    @Override // B6.c
    public final float B(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return O(V(descriptor, i8));
    }

    @Override // B6.c
    public final byte C(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return K(V(descriptor, i8));
    }

    @Override // B6.e
    public final byte D() {
        return K(W());
    }

    @Override // B6.c
    public final short E(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return S(V(descriptor, i8));
    }

    @Override // B6.e
    public final short F() {
        return S(W());
    }

    @Override // B6.e
    public final float G() {
        return O(W());
    }

    @Override // B6.e
    public final double H() {
        return M(W());
    }

    protected Object I(InterfaceC4248a deserializer, Object obj) {
        AbstractC3292y.i(deserializer, "deserializer");
        return w(deserializer);
    }

    protected abstract boolean J(Object obj);

    protected abstract byte K(Object obj);

    protected abstract char L(Object obj);

    protected abstract double M(Object obj);

    protected abstract int N(Object obj, A6.f fVar);

    protected abstract float O(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public B6.e P(Object obj, A6.f inlineDescriptor) {
        AbstractC3292y.i(inlineDescriptor, "inlineDescriptor");
        X(obj);
        return this;
    }

    protected abstract int Q(Object obj);

    protected abstract long R(Object obj);

    protected abstract short S(Object obj);

    protected abstract String T(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object U() {
        return AbstractC1435t.z0(this.f1095a);
    }

    protected abstract Object V(A6.f fVar, int i8);

    protected final Object W() {
        ArrayList arrayList = this.f1095a;
        Object remove = arrayList.remove(AbstractC1435t.o(arrayList));
        this.f1096b = true;
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X(Object obj) {
        this.f1095a.add(obj);
    }

    @Override // B6.c
    public final double e(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return M(V(descriptor, i8));
    }

    @Override // B6.e
    public final boolean f() {
        return J(W());
    }

    @Override // B6.c
    public final B6.e g(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return P(V(descriptor, i8), descriptor.h(i8));
    }

    @Override // B6.e
    public final char h() {
        return L(W());
    }

    @Override // B6.e
    public final int i(A6.f enumDescriptor) {
        AbstractC3292y.i(enumDescriptor, "enumDescriptor");
        return N(W(), enumDescriptor);
    }

    @Override // B6.c
    public final char j(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return L(V(descriptor, i8));
    }

    @Override // B6.c
    public final long k(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return R(V(descriptor, i8));
    }

    @Override // B6.c
    public final boolean m(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return J(V(descriptor, i8));
    }

    @Override // B6.e
    public final int n() {
        return Q(W());
    }

    @Override // B6.c
    public final String o(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return T(V(descriptor, i8));
    }

    @Override // B6.c
    public final Object p(A6.f descriptor, int i8, InterfaceC4248a deserializer, Object obj) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(deserializer, "deserializer");
        return Y(V(descriptor, i8), new b(deserializer, obj));
    }

    @Override // B6.e
    public final Void q() {
        return null;
    }

    @Override // B6.e
    public final String r() {
        return T(W());
    }

    @Override // B6.c
    public int s(A6.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // B6.c
    public final Object t(A6.f descriptor, int i8, InterfaceC4248a deserializer, Object obj) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(deserializer, "deserializer");
        return Y(V(descriptor, i8), new a(deserializer, obj));
    }

    @Override // B6.c
    public final int u(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return Q(V(descriptor, i8));
    }

    @Override // B6.e
    public final long v() {
        return R(W());
    }

    @Override // B6.e
    public abstract Object w(InterfaceC4248a interfaceC4248a);

    @Override // B6.c
    public boolean z() {
        return c.a.b(this);
    }
}
