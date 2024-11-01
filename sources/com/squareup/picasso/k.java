package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k extends AbstractC2596a {

    /* renamed from: m, reason: collision with root package name */
    m2.b f24518m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(s sVar, ImageView imageView, v vVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj, m2.b bVar, boolean z8) {
        super(sVar, imageView, vVar, i8, i9, i10, drawable, str, obj, z8);
        this.f24518m = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2596a
    public void a() {
        super.a();
        if (this.f24518m != null) {
            this.f24518m = null;
        }
    }

    @Override // com.squareup.picasso.AbstractC2596a
    public void b(Bitmap bitmap, s.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f24447c.get();
            if (imageView == null) {
                return;
            }
            s sVar = this.f24445a;
            t.c(imageView, sVar.f24559d, bitmap, eVar, this.f24448d, sVar.f24567l);
            m2.b bVar = this.f24518m;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.AbstractC2596a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f24447c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i8 = this.f24451g;
        if (i8 != 0) {
            imageView.setImageResource(i8);
        } else {
            Drawable drawable2 = this.f24452h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        m2.b bVar = this.f24518m;
        if (bVar != null) {
            bVar.a(exc);
        }
    }
}
