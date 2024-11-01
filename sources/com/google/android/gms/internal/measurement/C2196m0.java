package com.google.android.gms.internal.measurement;

import java.io.File;

/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2196m0 implements InterfaceC2205n0 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2205n0
    public final String a(String str, AbstractC2236r0 abstractC2236r0, EnumC2213o0 enumC2213o0) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2205n0
    public final /* synthetic */ String b(File file, String str) {
        return e(file, str, AbstractC2236r0.f16953a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2205n0
    public final /* synthetic */ String c(String str) {
        return d(str, AbstractC2236r0.f16953a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2205n0
    public final /* synthetic */ String d(String str, AbstractC2236r0 abstractC2236r0) {
        return a(str, abstractC2236r0, EnumC2213o0.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2205n0
    public final /* synthetic */ String e(File file, String str, AbstractC2236r0 abstractC2236r0) {
        return d(new File(file, str).getPath(), abstractC2236r0);
    }
}
