package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.mbridge.msdk.out.NativeListener;

/* loaded from: classes4.dex */
public interface a extends e {

    /* renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0438a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i8, String str);

        void a(boolean z8);

        void b();
    }

    int a();

    void a(int i8);

    void a(int i8, String str);

    void a(Activity activity);

    void a(InterfaceC0438a interfaceC0438a);

    void a(com.mbridge.msdk.videocommon.d.c cVar);

    void a(String str);

    void a(boolean z8);

    void b(int i8);

    void b(String str);

    void b(boolean z8);

    boolean b();

    String c();

    void c(int i8);

    void d();

    void d(int i8);

    void e();

    void e(int i8);

    void f();

    void f(int i8);

    int g();

    String g(int i8);

    int h();

    void h(int i8);

    String i();
}
