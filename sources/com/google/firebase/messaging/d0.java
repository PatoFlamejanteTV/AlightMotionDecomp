package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f18650d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18651a;

    /* renamed from: b, reason: collision with root package name */
    private Z f18652b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f18653c;

    private d0(SharedPreferences sharedPreferences, Executor executor) {
        this.f18653c = executor;
        this.f18651a = sharedPreferences;
    }

    public static synchronized d0 a(Context context, Executor executor) {
        d0 d0Var;
        synchronized (d0.class) {
            try {
                WeakReference weakReference = f18650d;
                if (weakReference != null) {
                    d0Var = (d0) weakReference.get();
                } else {
                    d0Var = null;
                }
                if (d0Var == null) {
                    d0Var = new d0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    d0Var.c();
                    f18650d = new WeakReference(d0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d0Var;
    }

    private synchronized void c() {
        this.f18652b = Z.c(this.f18651a, "topic_operation_queue", ",", this.f18653c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized c0 b() {
        return c0.a(this.f18652b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(c0 c0Var) {
        return this.f18652b.f(c0Var.e());
    }
}
