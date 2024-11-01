package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class R0 extends Y implements P0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public R0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void beginAdUnitExposure(String str, long j8) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeLong(j8);
        k(23, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2088a0.d(h8, bundle);
        k(9, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void endAdUnitExposure(String str, long j8) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeLong(j8);
        k(24, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void generateEventId(U0 u02) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, u02);
        k(22, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCachedAppInstanceId(U0 u02) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, u02);
        k(19, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getConditionalUserProperties(String str, String str2, U0 u02) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2088a0.c(h8, u02);
        k(10, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenClass(U0 u02) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, u02);
        k(17, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenName(U0 u02) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, u02);
        k(16, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getGmpAppId(U0 u02) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, u02);
        k(21, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getMaxUserProperties(String str, U0 u02) {
        Parcel h8 = h();
        h8.writeString(str);
        AbstractC2088a0.c(h8, u02);
        k(6, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getUserProperties(String str, String str2, boolean z8, U0 u02) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2088a0.e(h8, z8);
        AbstractC2088a0.c(h8, u02);
        k(5, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void initialize(Y.a aVar, C2107c1 c2107c1, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        AbstractC2088a0.d(h8, c2107c1);
        h8.writeLong(j8);
        k(1, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2088a0.d(h8, bundle);
        AbstractC2088a0.e(h8, z8);
        AbstractC2088a0.e(h8, z9);
        h8.writeLong(j8);
        k(2, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logHealthData(int i8, String str, Y.a aVar, Y.a aVar2, Y.a aVar3) {
        Parcel h8 = h();
        h8.writeInt(i8);
        h8.writeString(str);
        AbstractC2088a0.c(h8, aVar);
        AbstractC2088a0.c(h8, aVar2);
        AbstractC2088a0.c(h8, aVar3);
        k(33, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityCreated(Y.a aVar, Bundle bundle, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        AbstractC2088a0.d(h8, bundle);
        h8.writeLong(j8);
        k(27, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityDestroyed(Y.a aVar, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        h8.writeLong(j8);
        k(28, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityPaused(Y.a aVar, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        h8.writeLong(j8);
        k(29, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityResumed(Y.a aVar, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        h8.writeLong(j8);
        k(30, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivitySaveInstanceState(Y.a aVar, U0 u02, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        AbstractC2088a0.c(h8, u02);
        h8.writeLong(j8);
        k(31, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStarted(Y.a aVar, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        h8.writeLong(j8);
        k(25, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStopped(Y.a aVar, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        h8.writeLong(j8);
        k(26, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void registerOnMeasurementEventListener(V0 v02) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, v02);
        k(35, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setConditionalUserProperty(Bundle bundle, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.d(h8, bundle);
        h8.writeLong(j8);
        k(8, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setCurrentScreen(Y.a aVar, String str, String str2, long j8) {
        Parcel h8 = h();
        AbstractC2088a0.c(h8, aVar);
        h8.writeString(str);
        h8.writeString(str2);
        h8.writeLong(j8);
        k(15, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setDataCollectionEnabled(boolean z8) {
        Parcel h8 = h();
        AbstractC2088a0.e(h8, z8);
        k(39, h8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setUserProperty(String str, String str2, Y.a aVar, boolean z8, long j8) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2088a0.c(h8, aVar);
        AbstractC2088a0.e(h8, z8);
        h8.writeLong(j8);
        k(4, h8);
    }
}
