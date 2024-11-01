package com.mbridge.msdk.playercommon.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public class Cue {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = Float.MIN_VALUE;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final int positionAnchor;
    public final float size;
    public final CharSequence text;
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int windowColor;
    public final boolean windowColorSet;

    /* loaded from: classes4.dex */
    public @interface AnchorType {
    }

    /* loaded from: classes4.dex */
    public @interface LineType {
    }

    /* loaded from: classes4.dex */
    public @interface TextSizeType {
    }

    public Cue(Bitmap bitmap, float f8, int i8, float f9, int i9, float f10, float f11) {
        this(null, null, bitmap, f9, 0, i9, f8, i8, Integer.MIN_VALUE, Float.MIN_VALUE, f10, f11, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f8, int i8, int i9, float f9, int i10, float f10) {
        this(charSequence, alignment, f8, i8, i9, f9, i10, f10, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f8, int i8, int i9, float f9, int i10, float f10, int i11, float f11) {
        this(charSequence, alignment, null, f8, i8, i9, f9, i10, i11, f11, f10, Float.MIN_VALUE, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f8, int i8, int i9, float f9, int i10, float f10, boolean z8, int i11) {
        this(charSequence, alignment, null, f8, i8, i9, f9, i10, Integer.MIN_VALUE, Float.MIN_VALUE, f10, Float.MIN_VALUE, z8, i11);
    }

    private Cue(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f8, int i8, int i9, float f9, int i10, int i11, float f10, float f11, float f12, boolean z8, int i12) {
        this.text = charSequence;
        this.textAlignment = alignment;
        this.bitmap = bitmap;
        this.line = f8;
        this.lineType = i8;
        this.lineAnchor = i9;
        this.position = f9;
        this.positionAnchor = i10;
        this.size = f11;
        this.bitmapHeight = f12;
        this.windowColorSet = z8;
        this.windowColor = i12;
        this.textSizeType = i11;
        this.textSize = f10;
    }
}
