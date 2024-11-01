package com.uptodown.util.views;

import E4.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import s5.C3971e;

/* loaded from: classes5.dex */
public final class CropImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    private C3971e f31176a;

    /* renamed from: b, reason: collision with root package name */
    private int f31177b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        if (getDrawable() != null) {
            this.f31176a = new C3971e(this);
        }
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f1836d0);
        AbstractC3292y.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f31177b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final int getCropType() {
        return this.f31177b;
    }

    public final void setCropType(int i8) {
        this.f31177b = i8;
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        if (!isInEditMode() && this.f31176a != null && getDrawable() != null) {
            C3971e c3971e = this.f31176a;
            AbstractC3292y.f(c3971e);
            c3971e.a();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        AbstractC3292y.i(bm, "bm");
        super.setImageBitmap(bm);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i8) {
        super.setImageResource(i8);
        a();
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f31177b = -1;
        b(attributeSet);
        a();
    }
}
