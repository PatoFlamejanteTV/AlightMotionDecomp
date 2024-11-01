package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import q0.AbstractC3628n;
import q0.InterfaceC3617c;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2582n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f18706c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static n0 f18707d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f18708a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f18709b = new androidx.privacysandbox.ads.adservices.adid.g();

    public C2582n(Context context) {
        this.f18708a = context;
    }

    private static Task e(Context context, Intent intent, boolean z8) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        n0 f8 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (z8) {
            if (X.b().e(context)) {
                i0.f(context, f8, intent);
            } else {
                f8.c(intent);
            }
            return AbstractC3628n.e(-1);
        }
        return f8.c(intent).g(new androidx.privacysandbox.ads.adservices.adid.g(), new InterfaceC3617c() { // from class: com.google.firebase.messaging.m
            @Override // q0.InterfaceC3617c
            public final Object a(Task task) {
                Integer g8;
                g8 = C2582n.g(task);
                return g8;
            }
        });
    }

    private static n0 f(Context context, String str) {
        n0 n0Var;
        synchronized (f18706c) {
            try {
                if (f18707d == null) {
                    f18707d = new n0(context, str);
                }
                n0Var = f18707d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(X.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(Task task) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z8, Task task) {
        if (V.k.h() && ((Integer) task.j()).intValue() == 402) {
            return e(context, intent, z8).g(new androidx.privacysandbox.ads.adservices.adid.g(), new InterfaceC3617c() { // from class: com.google.firebase.messaging.l
                @Override // q0.InterfaceC3617c
                public final Object a(Task task2) {
                    Integer i8;
                    i8 = C2582n.i(task2);
                    return i8;
                }
            });
        }
        return task;
    }

    public Task k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f18708a, intent);
    }

    public Task l(final Context context, final Intent intent) {
        boolean z8;
        final boolean z9 = false;
        if (V.k.h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z9 = true;
        }
        if (z8 && !z9) {
            return e(context, intent, z9);
        }
        return AbstractC3628n.c(this.f18709b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h8;
                h8 = C2582n.h(context, intent);
                return h8;
            }
        }).h(this.f18709b, new InterfaceC3617c() { // from class: com.google.firebase.messaging.k
            @Override // q0.InterfaceC3617c
            public final Object a(Task task) {
                Task j8;
                j8 = C2582n.j(context, intent, z9, task);
                return j8;
            }
        });
    }
}
