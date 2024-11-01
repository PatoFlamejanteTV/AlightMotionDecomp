package x6;

import Q5.I;
import Q5.s;
import Q5.t;
import U5.d;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3472p;
import n6.InterfaceC3470o;
import q0.C3616b;
import q0.InterfaceC3620f;

/* loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3620f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3470o f41138a;

        a(InterfaceC3470o interfaceC3470o) {
            this.f41138a = interfaceC3470o;
        }

        @Override // q0.InterfaceC3620f
        public final void a(Task task) {
            Exception i8 = task.i();
            if (i8 == null) {
                if (task.l()) {
                    InterfaceC3470o.a.a(this.f41138a, null, 1, null);
                    return;
                }
                InterfaceC3470o interfaceC3470o = this.f41138a;
                s.a aVar = s.f8810b;
                interfaceC3470o.resumeWith(s.b(task.j()));
                return;
            }
            InterfaceC3470o interfaceC3470o2 = this.f41138a;
            s.a aVar2 = s.f8810b;
            interfaceC3470o2.resumeWith(s.b(t.a(i8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x6.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0938b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3616b f41139a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0938b(C3616b c3616b) {
            super(1);
            this.f41139a = c3616b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            this.f41139a.a();
        }
    }

    public static final Object a(Task task, d dVar) {
        return b(task, null, dVar);
    }

    private static final Object b(Task task, C3616b c3616b, d dVar) {
        if (task.m()) {
            Exception i8 = task.i();
            if (i8 == null) {
                if (!task.l()) {
                    return task.j();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw i8;
        }
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        task.b(ExecutorC4231a.f41137a, new a(c3472p));
        if (c3616b != null) {
            c3472p.f(new C0938b(c3616b));
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            h.c(dVar);
        }
        return y8;
    }
}
