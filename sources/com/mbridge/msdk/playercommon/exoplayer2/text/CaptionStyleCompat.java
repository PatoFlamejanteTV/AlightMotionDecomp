package com.mbridge.msdk.playercommon.exoplayer2.text;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class CaptionStyleCompat {
    public static final CaptionStyleCompat DEFAULT = new CaptionStyleCompat(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int USE_TRACK_COLOR_SETTINGS = 1;
    public final int backgroundColor;
    public final int edgeColor;
    public final int edgeType;
    public final int foregroundColor;
    public final Typeface typeface;
    public final int windowColor;

    /* loaded from: classes4.dex */
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i8, int i9, int i10, int i11, int i12, Typeface typeface) {
        this.foregroundColor = i8;
        this.backgroundColor = i9;
        this.windowColor = i10;
        this.edgeType = i11;
        this.edgeColor = i12;
        this.typeface = typeface;
    }

    public static CaptionStyleCompat createFromCaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        if (Util.SDK_INT >= 21) {
            return createFromCaptionStyleV21(captionStyle);
        }
        return createFromCaptionStyleV19(captionStyle);
    }

    private static CaptionStyleCompat createFromCaptionStyleV19(CaptioningManager.CaptionStyle captionStyle) {
        return new CaptionStyleCompat(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static CaptionStyleCompat createFromCaptionStyleV21(CaptioningManager.CaptionStyle captionStyle) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (captionStyle.hasForegroundColor()) {
            i8 = captionStyle.foregroundColor;
        } else {
            i8 = DEFAULT.foregroundColor;
        }
        int i13 = i8;
        if (captionStyle.hasBackgroundColor()) {
            i9 = captionStyle.backgroundColor;
        } else {
            i9 = DEFAULT.backgroundColor;
        }
        int i14 = i9;
        if (captionStyle.hasWindowColor()) {
            i10 = captionStyle.windowColor;
        } else {
            i10 = DEFAULT.windowColor;
        }
        int i15 = i10;
        if (captionStyle.hasEdgeType()) {
            i11 = captionStyle.edgeType;
        } else {
            i11 = DEFAULT.edgeType;
        }
        int i16 = i11;
        if (captionStyle.hasEdgeColor()) {
            i12 = captionStyle.edgeColor;
        } else {
            i12 = DEFAULT.edgeColor;
        }
        return new CaptionStyleCompat(i13, i14, i15, i16, i12, captionStyle.getTypeface());
    }
}
