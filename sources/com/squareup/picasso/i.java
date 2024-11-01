package com.squareup.picasso;

import U6.L;
import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.squareup.picasso.s;
import com.squareup.picasso.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class i extends e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        return new ExifInterface(uri.getPath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.x
    public boolean c(v vVar) {
        return "file".equals(vVar.f24606d.getScheme());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        return new x.a(null, L.l(j(vVar)), s.e.DISK, k(vVar.f24606d));
    }
}
