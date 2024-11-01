package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18603a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18604b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18605c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f18607e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f18606d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f18608f = false;

    private Z(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f18603a = sharedPreferences;
        this.f18604b = str;
        this.f18605c = str2;
        this.f18607e = executor;
    }

    private boolean b(boolean z8) {
        if (z8 && !this.f18608f) {
            i();
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        Z z8 = new Z(sharedPreferences, str, str2, executor);
        z8.d();
        return z8;
    }

    private void d() {
        synchronized (this.f18606d) {
            try {
                this.f18606d.clear();
                String string = this.f18603a.getString(this.f18604b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f18605c)) {
                    String[] split = string.split(this.f18605c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f18606d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f18606d) {
            this.f18603a.edit().putString(this.f18604b, g()).commit();
        }
    }

    private void i() {
        this.f18607e.execute(new Runnable() { // from class: com.google.firebase.messaging.Y
            @Override // java.lang.Runnable
            public final void run() {
                Z.this.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f18606d) {
            str = (String) this.f18606d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b9;
        synchronized (this.f18606d) {
            b9 = b(this.f18606d.remove(obj));
        }
        return b9;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f18606d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f18605c);
        }
        return sb.toString();
    }
}
