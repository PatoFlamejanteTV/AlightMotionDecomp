package R;

import Q.AbstractC1396p;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public abstract class e {
    public static d a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC1396p.l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        d dVar = (d) creator.createFromParcel(obtain);
        obtain.recycle();
        return dVar;
    }

    public static d b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }
}
