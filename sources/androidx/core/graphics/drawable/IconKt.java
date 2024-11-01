package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class IconKt {
    @RequiresApi(26)
    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Bitmap bitmap) {
        Icon createWithBitmap;
        createWithBitmap = Icon.createWithBitmap(bitmap);
        return createWithBitmap;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Uri uri) {
        Icon createWithContentUri;
        createWithContentUri = Icon.createWithContentUri(uri);
        return createWithContentUri;
    }

    @RequiresApi(26)
    public static final Icon toIcon(byte[] bArr) {
        Icon createWithData;
        createWithData = Icon.createWithData(bArr, 0, bArr.length);
        return createWithData;
    }
}
