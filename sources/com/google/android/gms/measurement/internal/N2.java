package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F7;
import com.google.android.gms.internal.measurement.I7;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N2 implements I7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ I2 f17483a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N2(I2 i22) {
        this.f17483a = i22;
    }

    @Override // com.google.android.gms.internal.measurement.I7
    public final void a(F7 f72, String str, List list, boolean z8, boolean z9) {
        C2415p2 F8;
        int i8 = O2.f17488a[f72.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        F8 = this.f17483a.a().J();
                    } else {
                        F8 = this.f17483a.a().K();
                    }
                } else if (z8) {
                    F8 = this.f17483a.a().N();
                } else if (!z9) {
                    F8 = this.f17483a.a().M();
                } else {
                    F8 = this.f17483a.a().L();
                }
            } else if (z8) {
                F8 = this.f17483a.a().I();
            } else if (!z9) {
                F8 = this.f17483a.a().H();
            } else {
                F8 = this.f17483a.a().G();
            }
        } else {
            F8 = this.f17483a.a().F();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    F8.a(str);
                    return;
                } else {
                    F8.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            F8.c(str, list.get(0), list.get(1));
            return;
        }
        F8.b(str, list.get(0));
    }
}
