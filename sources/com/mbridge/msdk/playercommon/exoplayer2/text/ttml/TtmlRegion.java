package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

/* loaded from: classes4.dex */
final class TtmlRegion {
    public final String id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public TtmlRegion(String str, float f8, float f9, int i8, int i9, float f10, int i10, float f11) {
        this.id = str;
        this.position = f8;
        this.line = f9;
        this.lineType = i8;
        this.lineAnchor = i9;
        this.width = f10;
        this.textSizeType = i10;
        this.textSize = f11;
    }
}
