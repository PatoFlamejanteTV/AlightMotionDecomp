package q0;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36618a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f36619b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36620c;

    public final void a(I i8) {
        synchronized (this.f36618a) {
            try {
                if (this.f36619b == null) {
                    this.f36619b = new ArrayDeque();
                }
                this.f36619b.add(i8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        I i8;
        synchronized (this.f36618a) {
            if (this.f36619b != null && !this.f36620c) {
                this.f36620c = true;
                while (true) {
                    synchronized (this.f36618a) {
                        try {
                            i8 = (I) this.f36619b.poll();
                            if (i8 == null) {
                                this.f36620c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    i8.c(task);
                }
            }
        }
    }
}
