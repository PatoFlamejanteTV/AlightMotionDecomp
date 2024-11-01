package com.uptodown.tv.utils;

import E4.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import o5.C3540a;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public final class CropImageViewTv extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private C3540a f31174a;

    /* renamed from: b, reason: collision with root package name */
    private int f31175b;

    public CropImageViewTv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        if (getDrawable() != null) {
            this.f31174a = new C3540a(this);
        }
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f1836d0);
        AbstractC3292y.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f31175b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final int getCropType() {
        return this.f31175b;
    }

    public final void setCropType(int i8) {
        this.f31175b = i8;
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        if (!isInEditMode() && this.f31174a != null && getDrawable() != null) {
            C3540a c3540a = this.f31174a;
            AbstractC3292y.f(c3540a);
            c3540a.a();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        AbstractC3292y.i(bm, "bm");
        super.setImageBitmap(bm);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        super.setImageResource(i8);
        a();
    }

    public /* synthetic */ CropImageViewTv(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    public CropImageViewTv(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f31175b = -1;
        b(attributeSet);
        a();
    }
}
