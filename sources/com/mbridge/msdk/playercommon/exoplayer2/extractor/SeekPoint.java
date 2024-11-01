package com.mbridge.msdk.playercommon.exoplayer2.extractor;

/* loaded from: classes4.dex */
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j8, long j9) {
        this.timeUs = j8;
        this.position = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekPoint.class != obj.getClass()) {
            return false;
        }
        SeekPoint seekPoint = (SeekPoint) obj;
        if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public final String toString() {
        return "[timeUs=" + this.timeUs + ", position=" + this.position + "]";
    }
}
