package r0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3870h extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3870h> CREATOR = new W();

    /* renamed from: a, reason: collision with root package name */
    PendingIntent f37729a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3870h(PendingIntent pendingIntent) {
        this.f37729a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.p(parcel, 1, this.f37729a, i8, false);
        R.c.b(parcel, a9);
    }
}
