package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleCompat;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class BacsMandateConfirmationContract extends ActivityResultContract<a, c> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27423a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27425a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27426b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27427c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27428d;

        /* renamed from: e, reason: collision with root package name */
        private final w.b f27429e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0622a f27424f = new C0622a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0622a {
            private C0622a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return (a) BundleCompat.getParcelable(extras, "extra_activity_args", a.class);
                }
                return null;
            }

            public /* synthetic */ C0622a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), w.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String email, String nameOnAccount, String sortCode, String accountNumber, w.b appearance) {
            AbstractC3292y.i(email, "email");
            AbstractC3292y.i(nameOnAccount, "nameOnAccount");
            AbstractC3292y.i(sortCode, "sortCode");
            AbstractC3292y.i(accountNumber, "accountNumber");
            AbstractC3292y.i(appearance, "appearance");
            this.f27425a = email;
            this.f27426b = nameOnAccount;
            this.f27427c = sortCode;
            this.f27428d = accountNumber;
            this.f27429e = appearance;
        }

        public final String a() {
            return this.f27428d;
        }

        public final w.b b() {
            return this.f27429e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f27425a, aVar.f27425a) && AbstractC3292y.d(this.f27426b, aVar.f27426b) && AbstractC3292y.d(this.f27427c, aVar.f27427c) && AbstractC3292y.d(this.f27428d, aVar.f27428d) && AbstractC3292y.d(this.f27429e, aVar.f27429e);
        }

        public final String f() {
            return this.f27425a;
        }

        public final String h() {
            return this.f27426b;
        }

        public int hashCode() {
            return (((((((this.f27425a.hashCode() * 31) + this.f27426b.hashCode()) * 31) + this.f27427c.hashCode()) * 31) + this.f27428d.hashCode()) * 31) + this.f27429e.hashCode();
        }

        public final String i() {
            return this.f27427c;
        }

        public String toString() {
            return "Args(email=" + this.f27425a + ", nameOnAccount=" + this.f27426b + ", sortCode=" + this.f27427c + ", accountNumber=" + this.f27428d + ", appearance=" + this.f27429e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27425a);
            out.writeString(this.f27426b);
            out.writeString(this.f27427c);
            out.writeString(this.f27428d);
            this.f27429e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) BacsMandateConfirmationActivity.class).putExtra("extra_activity_args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c parseResult(int i8, Intent intent) {
        return c.f27457j0.a(intent);
    }
}
