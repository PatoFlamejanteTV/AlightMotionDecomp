package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC2088a0;
import java.util.ArrayList;
import java.util.List;
import l0.C3302b;
import l0.InterfaceC3306f;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2338e2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC3306f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2338e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // l0.InterfaceC3306f
    public final void A(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        k(20, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void B(Y5 y52, M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, y52);
        AbstractC2088a0.d(h8, m52);
        k(2, h8);
    }

    @Override // l0.InterfaceC3306f
    public final String E(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        Parcel i8 = i(11, h8);
        String readString = i8.readString();
        i8.recycle();
        return readString;
    }

    @Override // l0.InterfaceC3306f
    public final void H(C2335e c2335e, M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, c2335e);
        AbstractC2088a0.d(h8, m52);
        k(12, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void J(long j8, String str, String str2, String str3) {
        Parcel h8 = h();
        h8.writeLong(j8);
        h8.writeString(str);
        h8.writeString(str2);
        h8.writeString(str3);
        k(10, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void O(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        k(27, h8);
    }

    @Override // l0.InterfaceC3306f
    public final List P(String str, String str2, String str3) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        h8.writeString(str3);
        Parcel i8 = i(17, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(C2335e.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3306f
    public final void Q(C2335e c2335e) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, c2335e);
        k(13, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void X(E e8, String str, String str2) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, e8);
        h8.writeString(str);
        h8.writeString(str2);
        k(5, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void a0(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        k(25, h8);
    }

    @Override // l0.InterfaceC3306f
    public final C3302b b0(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        Parcel i8 = i(21, h8);
        C3302b c3302b = (C3302b) AbstractC2088a0.a(i8, C3302b.CREATOR);
        i8.recycle();
        return c3302b;
    }

    @Override // l0.InterfaceC3306f
    public final List f0(String str, String str2, boolean z8, M5 m52) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2088a0.e(h8, z8);
        AbstractC2088a0.d(h8, m52);
        Parcel i8 = i(14, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(Y5.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3306f
    public final void i0(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        k(26, h8);
    }

    @Override // l0.InterfaceC3306f
    public final List j0(M5 m52, Bundle bundle) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        AbstractC2088a0.d(h8, bundle);
        Parcel i8 = i(24, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(B5.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3306f
    public final byte[] k0(E e8, String str) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, e8);
        h8.writeString(str);
        Parcel i8 = i(9, h8);
        byte[] createByteArray = i8.createByteArray();
        i8.recycle();
        return createByteArray;
    }

    @Override // l0.InterfaceC3306f
    public final List m(String str, String str2, M5 m52) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2088a0.d(h8, m52);
        Parcel i8 = i(16, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(C2335e.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3306f
    public final void n0(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        k(6, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void p(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        k(4, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void p0(E e8, M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, e8);
        AbstractC2088a0.d(h8, m52);
        k(1, h8);
    }

    @Override // l0.InterfaceC3306f
    public final List s(String str, String str2, String str3, boolean z8) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        h8.writeString(str3);
        AbstractC2088a0.e(h8, z8);
        Parcel i8 = i(15, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(Y5.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3306f
    public final void u(M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, m52);
        k(18, h8);
    }

    @Override // l0.InterfaceC3306f
    public final void z(Bundle bundle, M5 m52) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, bundle);
        AbstractC2088a0.d(h8, m52);
        k(19, h8);
    }
}
