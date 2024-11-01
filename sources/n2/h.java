package N2;

import Q5.I;
import Q5.s;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3472p;
import n6.InterfaceC3470o;
import q0.C3616b;
import q0.InterfaceC3620f;

/* loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3616b f6443a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3616b c3616b) {
            super(1);
            this.f6443a = c3616b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            this.f6443a.a();
        }
    }

    public static final Object a(Task task, C3616b c3616b, U5.d dVar) {
        if (task.m()) {
            return task;
        }
        final C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        task.b(c.f6434a, new InterfaceC3620f() { // from class: N2.h.a
            @Override // q0.InterfaceC3620f
            public final void a(Task p02) {
                AbstractC3292y.i(p02, "p0");
                InterfaceC3470o.this.resumeWith(s.b(p02));
            }
        });
        if (c3616b != null) {
            c3472p.f(new b(c3616b));
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public static /* synthetic */ Object b(Task task, C3616b c3616b, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c3616b = null;
        }
        return a(task, c3616b, dVar);
    }
}
