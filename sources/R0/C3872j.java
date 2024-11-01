package r0;

import Q.AbstractC1396p;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3872j extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3872j> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    boolean f37738a;

    /* renamed from: b, reason: collision with root package name */
    boolean f37739b;

    /* renamed from: c, reason: collision with root package name */
    C3865c f37740c;

    /* renamed from: d, reason: collision with root package name */
    boolean f37741d;

    /* renamed from: e, reason: collision with root package name */
    C3881t f37742e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f37743f;

    /* renamed from: g, reason: collision with root package name */
    C3874l f37744g;

    /* renamed from: h, reason: collision with root package name */
    C3882u f37745h;

    /* renamed from: i, reason: collision with root package name */
    boolean f37746i;

    /* renamed from: j, reason: collision with root package name */
    String f37747j;

    /* renamed from: k, reason: collision with root package name */
    byte[] f37748k;

    /* renamed from: l, reason: collision with root package name */
    Bundle f37749l;

    /* renamed from: r0.j$a */
    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(y yVar) {
        }

        public C3872j a() {
            C3872j c3872j = C3872j.this;
            if (c3872j.f37747j == null && c3872j.f37748k == null) {
                AbstractC1396p.m(c3872j.f37743f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                AbstractC1396p.m(C3872j.this.f37740c, "Card requirements must be set!");
                C3872j c3872j2 = C3872j.this;
                if (c3872j2.f37744g != null) {
                    AbstractC1396p.m(c3872j2.f37745h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return C3872j.this;
        }
    }

    private C3872j() {
        this.f37746i = true;
    }

    public static C3872j s(String str) {
        a u8 = u();
        C3872j.this.f37747j = (String) AbstractC1396p.m(str, "paymentDataRequestJson cannot be null!");
        return u8.a();
    }

    public static a u() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.c(parcel, 1, this.f37738a);
        R.c.c(parcel, 2, this.f37739b);
        R.c.p(parcel, 3, this.f37740c, i8, false);
        R.c.c(parcel, 4, this.f37741d);
        R.c.p(parcel, 5, this.f37742e, i8, false);
        R.c.m(parcel, 6, this.f37743f, false);
        R.c.p(parcel, 7, this.f37744g, i8, false);
        R.c.p(parcel, 8, this.f37745h, i8, false);
        R.c.c(parcel, 9, this.f37746i);
        R.c.q(parcel, 10, this.f37747j, false);
        R.c.e(parcel, 11, this.f37749l, false);
        R.c.f(parcel, 12, this.f37748k, false);
        R.c.b(parcel, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3872j(boolean z8, boolean z9, C3865c c3865c, boolean z10, C3881t c3881t, ArrayList arrayList, C3874l c3874l, C3882u c3882u, boolean z11, String str, byte[] bArr, Bundle bundle) {
        this.f37738a = z8;
        this.f37739b = z9;
        this.f37740c = c3865c;
        this.f37741d = z10;
        this.f37742e = c3881t;
        this.f37743f = arrayList;
        this.f37744g = c3874l;
        this.f37745h = c3882u;
        this.f37746i = z11;
        this.f37747j = str;
        this.f37748k = bArr;
        this.f37749l = bundle;
    }
}
