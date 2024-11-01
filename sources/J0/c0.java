package J0;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q0.InterfaceC3617c;

/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f3897a = F.c("awaitEvenIfOnMainThread task continuation executor");

    public static Object b(Task task) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.g(f3897a, new InterfaceC3617c() { // from class: J0.b0
            @Override // q0.InterfaceC3617c
            public final Object a(Task task2) {
                Object d8;
                d8 = c0.d(countDownLatch, task2);
                return d8;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.n()) {
            return task.j();
        }
        if (!task.l()) {
            if (task.m()) {
                throw new IllegalStateException(task.i());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static boolean c(CountDownLatch countDownLatch, long j8, TimeUnit timeUnit) {
        boolean z8 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z8 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z8) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }
}
