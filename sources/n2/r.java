package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import v2.C4120a;

/* loaded from: classes4.dex */
public final class r implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    private static r f35414d;

    /* renamed from: a, reason: collision with root package name */
    private final String f35415a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35416b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f35413c = new a(null);
    public static final Parcelable.Creator<r> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ void c(a aVar, Context context, String str, String str2, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                str2 = null;
            }
            aVar.b(context, str, str2);
        }

        private final r d(Context context) {
            r a9 = new c(context).a();
            if (a9 != null) {
                r.f35414d = a9;
                return a9;
            }
            throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
        }

        public final r a(Context context) {
            AbstractC3292y.i(context, "context");
            r rVar = r.f35414d;
            if (rVar == null) {
                return d(context);
            }
            return rVar;
        }

        public final void b(Context context, String publishableKey, String str) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(publishableKey, "publishableKey");
            r.f35414d = new r(publishableKey, str);
            new c(context).b(publishableKey, str);
            new C3404g(context, null, 2, 0 == true ? 1 : 0).b();
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new r(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r[] newArray(int i8) {
            return new r[i8];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        private static final a f35417b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final String f35418c = r.class.getCanonicalName();

        /* renamed from: a, reason: collision with root package name */
        private final SharedPreferences f35419a;

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public c(Context context) {
            AbstractC3292y.i(context, "context");
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f35418c, 0);
            AbstractC3292y.h(sharedPreferences, "getSharedPreferences(...)");
            this.f35419a = sharedPreferences;
        }

        public final /* synthetic */ r a() {
            String string = this.f35419a.getString("key_publishable_key", null);
            if (string == null) {
                return null;
            }
            return new r(string, this.f35419a.getString("key_account_id", null));
        }

        public final /* synthetic */ void b(String publishableKey, String str) {
            AbstractC3292y.i(publishableKey, "publishableKey");
            this.f35419a.edit().putString("key_publishable_key", publishableKey).putString("key_account_id", str).apply();
        }
    }

    public r(String publishableKey, String str) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        this.f35415a = publishableKey;
        this.f35416b = str;
        C4120a.f40423a.a().b(publishableKey);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3292y.d(this.f35415a, rVar.f35415a) && AbstractC3292y.d(this.f35416b, rVar.f35416b)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f35415a;
    }

    public final String h() {
        return this.f35416b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f35415a.hashCode() * 31;
        String str = this.f35416b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "PaymentConfiguration(publishableKey=" + this.f35415a + ", stripeAccountId=" + this.f35416b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f35415a);
        out.writeString(this.f35416b);
    }
}
