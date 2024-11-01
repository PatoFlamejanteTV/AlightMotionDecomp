package r0;

import Q.AbstractC1396p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3867e extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3867e> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f37696a;

    /* renamed from: b, reason: collision with root package name */
    String f37697b;

    /* renamed from: c, reason: collision with root package name */
    String f37698c;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f37699d;

    /* renamed from: e, reason: collision with root package name */
    boolean f37700e;

    /* renamed from: f, reason: collision with root package name */
    String f37701f;

    /* renamed from: r0.e$a */
    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(S s8) {
        }

        public C3867e a() {
            return C3867e.this;
        }
    }

    C3867e() {
    }

    public static C3867e s(String str) {
        a u8 = u();
        C3867e.this.f37701f = (String) AbstractC1396p.m(str, "isReadyToPayRequestJson cannot be null!");
        return u8.a();
    }

    public static a u() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.m(parcel, 2, this.f37696a, false);
        R.c.q(parcel, 4, this.f37697b, false);
        R.c.q(parcel, 5, this.f37698c, false);
        R.c.m(parcel, 6, this.f37699d, false);
        R.c.c(parcel, 7, this.f37700e);
        R.c.q(parcel, 8, this.f37701f, false);
        R.c.b(parcel, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3867e(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z8, String str3) {
        this.f37696a = arrayList;
        this.f37697b = str;
        this.f37698c = str2;
        this.f37699d = arrayList2;
        this.f37700e = z8;
        this.f37701f = str3;
    }
}
