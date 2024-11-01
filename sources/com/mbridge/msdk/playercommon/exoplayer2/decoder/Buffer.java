package com.mbridge.msdk.playercommon.exoplayer2.decoder;

/* loaded from: classes4.dex */
public abstract class Buffer {
    private int flags;

    public final void addFlag(int i8) {
        this.flags = i8 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i8) {
        this.flags = (~i8) & this.flags;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getFlag(int i8) {
        if ((this.flags & i8) == i8) {
            return true;
        }
        return false;
    }

    public final boolean isDecodeOnly() {
        return getFlag(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int i8) {
        this.flags = i8;
    }
}
