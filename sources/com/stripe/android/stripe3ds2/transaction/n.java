package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f28134a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28135b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28136c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28137d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f28132e = new a(null);
    public static final Parcelable.Creator<n> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final n f28133f = new n("", "", "", null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final n a() {
            return n.f28133f;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    public n(String clientSecret, String sourceId, String publishableKey, String str) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(sourceId, "sourceId");
        AbstractC3292y.i(publishableKey, "publishableKey");
        this.f28134a = clientSecret;
        this.f28135b = sourceId;
        this.f28136c = publishableKey;
        this.f28137d = str;
    }

    public final String b() {
        return this.f28137d;
    }

    public final String d() {
        return this.f28134a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3292y.d(this.f28134a, nVar.f28134a) && AbstractC3292y.d(this.f28135b, nVar.f28135b) && AbstractC3292y.d(this.f28136c, nVar.f28136c) && AbstractC3292y.d(this.f28137d, nVar.f28137d);
    }

    public final String f() {
        return this.f28136c;
    }

    public final String h() {
        return this.f28135b;
    }

    public int hashCode() {
        int hashCode = ((((this.f28134a.hashCode() * 31) + this.f28135b.hashCode()) * 31) + this.f28136c.hashCode()) * 31;
        String str = this.f28137d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.f28134a + ", sourceId=" + this.f28135b + ", publishableKey=" + this.f28136c + ", accountId=" + this.f28137d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f28134a);
        out.writeString(this.f28135b);
        out.writeString(this.f28136c);
        out.writeString(this.f28137d);
    }
}
