package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface c extends Parcelable {

    /* renamed from: j0, reason: collision with root package name */
    public static final b f27457j0 = b.f27459a;

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27458a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0624a();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0624a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return a.f27458a;
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
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f27459a = new b();

        private b() {
        }

        public final c a(Intent intent) {
            c cVar;
            Bundle extras;
            if (intent != null && (extras = intent.getExtras()) != null) {
                cVar = (c) BundleCompat.getParcelable(extras, "extra_activity_result", c.class);
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return a.f27458a;
            }
            return cVar;
        }

        public final Intent b(Intent intent, c result) {
            AbstractC3292y.i(intent, "intent");
            AbstractC3292y.i(result, "result");
            Intent putExtra = intent.putExtra("extra_activity_result", result);
            AbstractC3292y.h(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0625c implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0625c f27460a = new C0625c();
        public static final Parcelable.Creator<C0625c> CREATOR = new a();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0625c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return C0625c.f27460a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0625c[] newArray(int i8) {
                return new C0625c[i8];
            }
        }

        private C0625c() {
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
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27461a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return d.f27461a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
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
