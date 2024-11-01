package K2;

import U5.g;
import c6.InterfaceC2072n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3491z;
import n6.InterfaceC3449d0;
import n6.InterfaceC3481u;
import n6.InterfaceC3485w;
import n6.InterfaceC3487x;
import n6.InterfaceC3488x0;
import n6.U;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes4.dex */
public abstract class b {

    /* loaded from: classes4.dex */
    public static final class a implements U {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC3487x f4574a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f4575b;

        a(InterfaceC3487x interfaceC3487x, InterfaceC3821f interfaceC3821f) {
            this.f4575b = interfaceC3821f;
            this.f4574a = interfaceC3487x;
        }

        @Override // n6.InterfaceC3488x0
        public InterfaceC3481u B(InterfaceC3485w child) {
            AbstractC3292y.i(child, "child");
            return this.f4574a.B(child);
        }

        @Override // n6.InterfaceC3488x0
        public boolean b() {
            return this.f4574a.b();
        }

        @Override // n6.InterfaceC3488x0
        public void cancel(CancellationException cancellationException) {
            this.f4574a.cancel(cancellationException);
        }

        @Override // U5.g.b, U5.g
        public Object fold(Object obj, InterfaceC2072n operation) {
            AbstractC3292y.i(operation, "operation");
            return this.f4574a.fold(obj, operation);
        }

        @Override // n6.U
        public Object g() {
            return this.f4574a.g();
        }

        @Override // U5.g.b, U5.g
        public g.b get(g.c key) {
            AbstractC3292y.i(key, "key");
            return this.f4574a.get(key);
        }

        @Override // U5.g.b
        public g.c getKey() {
            return this.f4574a.getKey();
        }

        @Override // n6.InterfaceC3488x0
        public InterfaceC3488x0 getParent() {
            return this.f4574a.getParent();
        }

        @Override // n6.U
        public Object h(U5.d dVar) {
            return AbstractC3823h.w(AbstractC3823h.v(this.f4575b), dVar);
        }

        @Override // n6.InterfaceC3488x0
        public boolean isActive() {
            return this.f4574a.isActive();
        }

        @Override // n6.InterfaceC3488x0
        public boolean isCancelled() {
            return this.f4574a.isCancelled();
        }

        @Override // n6.InterfaceC3488x0
        public Object k(U5.d dVar) {
            return this.f4574a.k(dVar);
        }

        @Override // U5.g.b, U5.g
        public g minusKey(g.c key) {
            AbstractC3292y.i(key, "key");
            return this.f4574a.minusKey(key);
        }

        @Override // n6.InterfaceC3488x0
        public InterfaceC3449d0 p(boolean z8, boolean z9, Function1 handler) {
            AbstractC3292y.i(handler, "handler");
            return this.f4574a.p(z8, z9, handler);
        }

        @Override // U5.g
        public g plus(g context) {
            AbstractC3292y.i(context, "context");
            return this.f4574a.plus(context);
        }

        @Override // n6.InterfaceC3488x0
        public CancellationException q() {
            return this.f4574a.q();
        }

        @Override // n6.InterfaceC3488x0
        public boolean start() {
            return this.f4574a.start();
        }

        @Override // n6.InterfaceC3488x0
        public InterfaceC3449d0 u(Function1 handler) {
            AbstractC3292y.i(handler, "handler");
            return this.f4574a.u(handler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U b(InterfaceC3821f interfaceC3821f) {
        return new a(AbstractC3491z.b(null, 1, null), interfaceC3821f);
    }
}
