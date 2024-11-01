package a5;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.AbstractC3292y;
import q0.InterfaceC3620f;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1675b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Task task) {
        AbstractC3292y.i(task, "task");
        task.n();
    }

    public final void b() {
        FirebaseMessaging.n().q().c(new InterfaceC3620f() { // from class: a5.a
            @Override // q0.InterfaceC3620f
            public final void a(Task task) {
                C1675b.c(task);
            }
        });
    }
}
