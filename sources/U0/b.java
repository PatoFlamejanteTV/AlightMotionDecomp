package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b extends R.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    String f40154a;

    /* renamed from: b, reason: collision with root package name */
    String f40155b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f40156c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, String str2, ArrayList arrayList) {
        this.f40154a = str;
        this.f40155b = str2;
        this.f40156c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f40154a, false);
        R.c.q(parcel, 3, this.f40155b, false);
        R.c.u(parcel, 4, this.f40156c, false);
        R.c.b(parcel, a9);
    }
}
