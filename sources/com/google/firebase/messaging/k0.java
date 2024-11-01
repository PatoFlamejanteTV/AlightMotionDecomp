package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.n0;
import q0.InterfaceC3620f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f18703a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface a {
        Task a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(a aVar) {
        this.f18703a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final n0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f18703a.a(aVar.f18716a).b(new androidx.privacysandbox.ads.adservices.adid.g(), new InterfaceC3620f() { // from class: com.google.firebase.messaging.j0
                @Override // q0.InterfaceC3620f
                public final void a(Task task) {
                    n0.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
