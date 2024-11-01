package com.squareup.picasso;

import U6.L;
import android.content.Context;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class e extends x {

    /* renamed from: a, reason: collision with root package name */
    final Context f24492a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this.f24492a = context;
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        return "content".equals(vVar.f24606d.getScheme());
    }

    @Override // com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        return new x.a(L.l(j(vVar)), s.e.DISK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputStream j(v vVar) {
        return this.f24492a.getContentResolver().openInputStream(vVar.f24606d);
    }
}
