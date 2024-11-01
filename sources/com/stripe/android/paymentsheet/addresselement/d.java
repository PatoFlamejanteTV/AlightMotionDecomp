package com.stripe.android.paymentsheet.addresselement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import w3.C4154a;

/* loaded from: classes4.dex */
public abstract class d implements Parcelable {

    /* loaded from: classes4.dex */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26891a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0589a();

        /* renamed from: com.stripe.android.paymentsheet.addresselement.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0589a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return a.f26891a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.d
        public int a() {
            return 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends d {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final C4154a f26892a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(C4154a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4154a address) {
            super(null);
            AbstractC3292y.i(address, "address");
            this.f26892a = address;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.d
        public int a() {
            return -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f26892a, ((b) obj).f26892a);
        }

        public int hashCode() {
            return this.f26892a.hashCode();
        }

        public String toString() {
            return "Succeeded(address=" + this.f26892a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f26892a.writeToParcel(out, i8);
        }
    }

    private d() {
    }

    public abstract int a();

    public /* synthetic */ d(AbstractC3284p abstractC3284p) {
        this();
    }
}
