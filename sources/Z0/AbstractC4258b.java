package z0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import w0.h;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4258b extends AbstractC4259c {

    /* renamed from: z0.b$a */
    /* loaded from: classes3.dex */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future f41318a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC4257a f41319b;

        a(Future future, InterfaceC4257a interfaceC4257a) {
            this.f41318a = future;
            this.f41319b = interfaceC4257a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41319b.a(AbstractC4258b.b(this.f41318a));
            } catch (Error e8) {
                e = e8;
                this.f41319b.b(e);
            } catch (RuntimeException e9) {
                e = e9;
                this.f41319b.b(e);
            } catch (ExecutionException e10) {
                this.f41319b.b(e10.getCause());
            }
        }

        public String toString() {
            return w0.d.a(this).c(this.f41319b).toString();
        }
    }

    public static void a(InterfaceFutureC4260d interfaceFutureC4260d, InterfaceC4257a interfaceC4257a, Executor executor) {
        h.i(interfaceC4257a);
        interfaceFutureC4260d.addListener(new a(interfaceFutureC4260d, interfaceC4257a), executor);
    }

    public static Object b(Future future) {
        h.p(future.isDone(), "Future was expected to be done: %s", future);
        return e.a(future);
    }
}
