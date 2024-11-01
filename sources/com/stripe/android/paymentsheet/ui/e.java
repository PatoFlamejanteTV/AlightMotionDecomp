package com.stripe.android.paymentsheet.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface e extends Parcelable {

    /* loaded from: classes4.dex */
    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27866a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0658a();

        /* renamed from: com.stripe.android.paymentsheet.ui.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0658a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return a.f27866a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
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
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27867a = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return b.f27867a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        private b() {
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
}
