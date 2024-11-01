package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface a extends Parcelable {

    /* renamed from: k0, reason: collision with root package name */
    public static final b f27507k0 = b.f27509a;

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0632a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0632a f27508a = new C0632a();
        public static final Parcelable.Creator<C0632a> CREATOR = new C0633a();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0633a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0632a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return C0632a.f27508a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0632a[] newArray(int i8) {
                return new C0632a[i8];
            }
        }

        private C0632a() {
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
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f27509a = new b();

        private b() {
        }

        public final a a(Intent intent) {
            a aVar;
            Bundle extras;
            if (intent != null && (extras = intent.getExtras()) != null) {
                aVar = (a) BundleCompat.getParcelable(extras, "extra_activity_result", a.class);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return C0632a.f27508a;
            }
            return aVar;
        }

        public final Intent b(Intent intent, a result) {
            AbstractC3292y.i(intent, "intent");
            AbstractC3292y.i(result, "result");
            Intent putExtra = intent.putExtra("extra_activity_result", result);
            AbstractC3292y.h(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {
        public static final Parcelable.Creator<c> CREATOR = new C0634a();

        /* renamed from: a, reason: collision with root package name */
        private final String f27510a;

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0634a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String cvc) {
            AbstractC3292y.i(cvc, "cvc");
            this.f27510a = cvc;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f27510a, ((c) obj).f27510a);
        }

        public int hashCode() {
            return this.f27510a.hashCode();
        }

        public String toString() {
            return "Confirmed(cvc=" + this.f27510a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27510a);
        }
    }
}
