package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* loaded from: classes4.dex */
public abstract class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private int f22972a;

    /* renamed from: b, reason: collision with root package name */
    private int f22973b;

    /* renamed from: d, reason: collision with root package name */
    public long f22974d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f22975e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f22976f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f22977g = 0.0f;

    public b(int i8, int i9) {
        this.f22972a = i8;
        this.f22973b = i9;
    }

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:            if (java.lang.Math.abs(r10 - r2) > r9.f22972a) goto L14;     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSensorChanged(android.hardware.SensorEvent r10) {
        /*
            r9 = this;
            float[] r10 = r10.values
            r0 = 0
            r0 = r10[r0]
            float r0 = -r0
            r1 = 1
            r1 = r10[r1]
            float r1 = -r1
            r2 = 2
            r10 = r10[r2]
            float r10 = -r10
            float r2 = r9.f22975e
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L22
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r9.f22972a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L22:
            float r2 = r9.f22976f
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L35
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r9.f22972a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L35:
            float r2 = r9.f22977g
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5c
            float r2 = r10 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r9.f22972a
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5c
        L48:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.f22974d
            long r4 = r2 - r4
            int r6 = r9.f22973b
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L5c
            r9.f22974d = r2
            r9.a()
        L5c:
            r9.f22975e = r0
            r9.f22976f = r1
            r9.f22977g = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.shake.b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
