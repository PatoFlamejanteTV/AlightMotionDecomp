package g4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import v4.C4132a;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2918b implements Parcelable {
    public static final Parcelable.Creator<C2918b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f32283a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32284b;

    /* renamed from: g4.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2918b createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2918b(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2918b[] newArray(int i8) {
            return new C2918b[i8];
        }
    }

    public C2918b(long j8, String currencyCode) {
        AbstractC3292y.i(currencyCode, "currencyCode");
        this.f32283a = j8;
        this.f32284b = currencyCode;
    }

    public final C2.c a() {
        int i8 = n.f32369F;
        C4132a c4132a = C4132a.f40643a;
        long j8 = this.f32283a;
        String str = this.f32284b;
        Locale locale = AppCompatDelegate.getApplicationLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        AbstractC3292y.f(locale);
        return C2.d.g(i8, new Object[]{c4132a.a(j8, str, locale)}, null, 4, null);
    }

    public final String b() {
        return this.f32284b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2918b)) {
            return false;
        }
        C2918b c2918b = (C2918b) obj;
        if (this.f32283a == c2918b.f32283a && AbstractC3292y.d(this.f32284b, c2918b.f32284b)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f32283a;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f32283a) * 31) + this.f32284b.hashCode();
    }

    public String toString() {
        return "Amount(value=" + this.f32283a + ", currencyCode=" + this.f32284b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeLong(this.f32283a);
        out.writeString(this.f32284b);
    }
}
