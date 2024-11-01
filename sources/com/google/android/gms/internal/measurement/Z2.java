package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Z2 {
    public static Object a(InterfaceC2109c3 interfaceC2109c3) {
        try {
            return interfaceC2109c3.w();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC2109c3.w();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
