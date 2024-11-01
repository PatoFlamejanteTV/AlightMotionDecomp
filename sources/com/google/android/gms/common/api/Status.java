package com.google.android.gms.common.api;

import N.C1339b;
import O.c;
import O.j;
import Q.AbstractC1394n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class Status extends R.a implements j, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f16067a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16068b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f16069c;

    /* renamed from: d, reason: collision with root package name */
    private final C1339b f16070d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f16059e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f16060f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f16061g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f16062h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f16063i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f16064j = new Status(16);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f16066l = new Status(17);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f16065k = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i8, String str, PendingIntent pendingIntent, C1339b c1339b) {
        this.f16067a = i8;
        this.f16068b = str;
        this.f16069c = pendingIntent;
        this.f16070d = c1339b;
    }

    public boolean I() {
        return this.f16067a <= 0;
    }

    public final String Q() {
        String str = this.f16068b;
        if (str != null) {
            return str;
        }
        return c.a(this.f16067a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f16067a != status.f16067a || !AbstractC1394n.a(this.f16068b, status.f16068b) || !AbstractC1394n.a(this.f16069c, status.f16069c) || !AbstractC1394n.a(this.f16070d, status.f16070d)) {
            return false;
        }
        return true;
    }

    @Override // O.j
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC1394n.b(Integer.valueOf(this.f16067a), this.f16068b, this.f16069c, this.f16070d);
    }

    public C1339b s() {
        return this.f16070d;
    }

    public String toString() {
        AbstractC1394n.a c8 = AbstractC1394n.c(this);
        c8.a("statusCode", Q());
        c8.a("resolution", this.f16069c);
        return c8.toString();
    }

    public PendingIntent u() {
        return this.f16069c;
    }

    public int v() {
        return this.f16067a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, v());
        R.c.q(parcel, 2, y(), false);
        R.c.p(parcel, 3, this.f16069c, i8, false);
        R.c.p(parcel, 4, s(), i8, false);
        R.c.b(parcel, a9);
    }

    public String y() {
        return this.f16068b;
    }

    public boolean z() {
        return this.f16069c != null;
    }

    public Status(int i8) {
        this(i8, (String) null);
    }

    public Status(C1339b c1339b, String str) {
        this(c1339b, str, 17);
    }

    public Status(int i8, String str) {
        this(i8, str, (PendingIntent) null);
    }

    public Status(C1339b c1339b, String str, int i8) {
        this(i8, str, c1339b.v(), c1339b);
    }

    public Status(int i8, String str, PendingIntent pendingIntent) {
        this(i8, str, pendingIntent, null);
    }
}
