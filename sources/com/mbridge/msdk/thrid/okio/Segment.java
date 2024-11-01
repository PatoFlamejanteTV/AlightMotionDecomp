package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Segment {
    static final int SHARE_MINIMUM = 1024;
    static final int SIZE = 8192;
    final byte[] data;
    int limit;
    Segment next;
    boolean owner;
    int pos;
    Segment prev;
    boolean shared;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i8;
        Segment segment = this.prev;
        if (segment != this) {
            if (!segment.owner) {
                return;
            }
            int i9 = this.limit - this.pos;
            int i10 = 8192 - segment.limit;
            if (segment.shared) {
                i8 = 0;
            } else {
                i8 = segment.pos;
            }
            if (i9 > i10 + i8) {
                return;
            }
            writeTo(segment, i9);
            pop();
            SegmentPool.recycle(this);
            return;
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final Segment pop() {
        Segment segment;
        Segment segment2 = this.next;
        if (segment2 != this) {
            segment = segment2;
        } else {
            segment = null;
        }
        Segment segment3 = this.prev;
        segment3.next = segment2;
        this.next.prev = segment3;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i8) {
        Segment take;
        if (i8 > 0 && i8 <= this.limit - this.pos) {
            if (i8 >= 1024) {
                take = sharedCopy();
            } else {
                take = SegmentPool.take();
                System.arraycopy(this.data, this.pos, take.data, 0, i8);
            }
            take.limit = take.pos + i8;
            this.pos += i8;
            this.prev.push(take);
            return take;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Segment unsharedCopy() {
        return new Segment((byte[]) this.data.clone(), this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment segment, int i8) {
        if (segment.owner) {
            int i9 = segment.limit;
            if (i9 + i8 > 8192) {
                if (!segment.shared) {
                    int i10 = segment.pos;
                    if ((i9 + i8) - i10 <= 8192) {
                        byte[] bArr = segment.data;
                        System.arraycopy(bArr, i10, bArr, 0, i9 - i10);
                        segment.limit -= segment.pos;
                        segment.pos = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.data, this.pos, segment.data, segment.limit, i8);
            segment.limit += i8;
            this.pos += i8;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Segment(byte[] bArr, int i8, int i9, boolean z8, boolean z9) {
        this.data = bArr;
        this.pos = i8;
        this.limit = i9;
        this.shared = z8;
        this.owner = z9;
    }
}
