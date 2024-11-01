package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private SensorManager f22970a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.shake.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0430a {

        /* renamed from: a, reason: collision with root package name */
        static a f22971a = new a();
    }

    public static a a() {
        return C0430a.f22971a;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f22970a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    private a() {
    }

    public final void a(SensorEventListener sensorEventListener) {
        Context c8 = c.m().c();
        if (c8 != null) {
            try {
                if (this.f22970a == null) {
                    this.f22970a = (SensorManager) c8.getSystemService("sensor");
                }
                this.f22970a.registerListener(sensorEventListener, this.f22970a.getDefaultSensor(1), 2);
            } catch (Exception e8) {
                e8.printStackTrace();
                String message = e8.getMessage();
                try {
                    if (TextUtils.isEmpty(message)) {
                        return;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000106&");
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U)) {
                        stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.f20649U + "&");
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                        stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.f20658g + "&");
                    }
                    stringBuffer.append("reason=" + message);
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        k.b(c8, stringBuffer.toString());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
