package D6;

import A6.f;
import Q5.InterfaceC1416k;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;

/* loaded from: classes5.dex */
public abstract class l {

    /* loaded from: classes5.dex */
    public static final class a implements A6.f {

        /* renamed from: a */
        private final InterfaceC1416k f1494a;

        a(Function0 function0) {
            this.f1494a = Q5.l.b(function0);
        }

        private final A6.f b() {
            return (A6.f) this.f1494a.getValue();
        }

        @Override // A6.f
        public String a() {
            return b().a();
        }

        @Override // A6.f
        public boolean c() {
            return f.a.c(this);
        }

        @Override // A6.f
        public int d(String name) {
            AbstractC3292y.i(name, "name");
            return b().d(name);
        }

        @Override // A6.f
        public int e() {
            return b().e();
        }

        @Override // A6.f
        public String f(int i8) {
            return b().f(i8);
        }

        @Override // A6.f
        public List g(int i8) {
            return b().g(i8);
        }

        @Override // A6.f
        public List getAnnotations() {
            return f.a.a(this);
        }

        @Override // A6.f
        public A6.j getKind() {
            return b().getKind();
        }

        @Override // A6.f
        public A6.f h(int i8) {
            return b().h(i8);
        }

        @Override // A6.f
        public boolean i(int i8) {
            return b().i(i8);
        }

        @Override // A6.f
        public boolean isInline() {
            return f.a.b(this);
        }
    }

    public static final /* synthetic */ void b(B6.e eVar) {
        g(eVar);
    }

    public static final /* synthetic */ void c(B6.f fVar) {
        h(fVar);
    }

    public static final h d(B6.e eVar) {
        h hVar;
        AbstractC3292y.i(eVar, "<this>");
        if (eVar instanceof h) {
            hVar = (h) eVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + U.b(eVar.getClass()));
    }

    public static final m e(B6.f fVar) {
        m mVar;
        AbstractC3292y.i(fVar, "<this>");
        if (fVar instanceof m) {
            mVar = (m) fVar;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + U.b(fVar.getClass()));
    }

    public static final A6.f f(Function0 function0) {
        return new a(function0);
    }

    public static final void g(B6.e eVar) {
        d(eVar);
    }

    public static final void h(B6.f fVar) {
        e(fVar);
    }
}
