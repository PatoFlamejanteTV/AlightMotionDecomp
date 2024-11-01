package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.s;
import com.squareup.picasso.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class y extends x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24657a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Context context) {
        this.f24657a = context;
    }

    private static Bitmap j(Resources resources, int i8, v vVar) {
        BitmapFactory.Options d8 = x.d(vVar);
        if (x.g(d8)) {
            BitmapFactory.decodeResource(resources, i8, d8);
            x.b(vVar.f24610h, vVar.f24611i, d8, vVar);
        }
        return BitmapFactory.decodeResource(resources, i8, d8);
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        if (vVar.f24607e != 0) {
            return true;
        }
        return "android.resource".equals(vVar.f24606d.getScheme());
    }

    @Override // com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        Resources n8 = C.n(this.f24657a, vVar);
        return new x.a(j(n8, C.m(n8, vVar), vVar), s.e.DISK);
    }
}
