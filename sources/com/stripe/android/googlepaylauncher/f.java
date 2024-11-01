package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25072a;

    /* renamed from: b, reason: collision with root package name */
    private final b f25073b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25074c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new f(parcel.readInt() != 0, b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i8) {
            return new f[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f25075b = new b("Min", 0, "MIN");

        /* renamed from: c, reason: collision with root package name */
        public static final b f25076c = new b("Full", 1, "FULL");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f25077d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25078e;

        /* renamed from: a, reason: collision with root package name */
        private final String f25079a;

        static {
            b[] a9 = a();
            f25077d = a9;
            f25078e = W5.b.a(a9);
        }

        private b(String str, int i8, String str2) {
            this.f25079a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f25075b, f25076c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25077d.clone();
        }
    }

    public f(boolean z8, b format, boolean z9) {
        AbstractC3292y.i(format, "format");
        this.f25072a = z8;
        this.f25073b = format;
        this.f25074c = z9;
    }

    public final b a() {
        return this.f25073b;
    }

    public final boolean b() {
        return this.f25074c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f25072a == fVar.f25072a && this.f25073b == fVar.f25073b && this.f25074c == fVar.f25074c;
    }

    public final boolean f() {
        return this.f25072a;
    }

    public int hashCode() {
        return (((androidx.compose.foundation.a.a(this.f25072a) * 31) + this.f25073b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25074c);
    }

    public String toString() {
        return "BillingAddressConfig(isRequired=" + this.f25072a + ", format=" + this.f25073b + ", isPhoneNumberRequired=" + this.f25074c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeInt(this.f25072a ? 1 : 0);
        out.writeString(this.f25073b.name());
        out.writeInt(this.f25074c ? 1 : 0);
    }
}
