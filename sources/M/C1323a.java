package M;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: M.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1323a extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1323a> CREATOR = new C1326d();

    /* renamed from: a, reason: collision with root package name */
    final Intent f5447a;

    public C1323a(Intent intent) {
        this.f5447a = intent;
    }

    public Intent s() {
        return this.f5447a;
    }

    public String u() {
        String stringExtra = this.f5447a.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return this.f5447a.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer v() {
        if (this.f5447a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f5447a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.p(parcel, 1, this.f5447a, i8, false);
        R.c.b(parcel, a9);
    }
}
