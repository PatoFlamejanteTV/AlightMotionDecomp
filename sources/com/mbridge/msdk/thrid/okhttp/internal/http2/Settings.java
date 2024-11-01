package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Settings {
    static final int COUNT = 10;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    static final int ENABLE_PUSH = 2;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int get(int i8) {
        return this.values[i8];
    }

    boolean getEnablePush(boolean z8) {
        int i8;
        if ((this.set & 4) != 0) {
            i8 = this.values[2];
        } else if (z8) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (i8 != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxConcurrentStreams(int i8) {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxFrameSize(int i8) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i8;
    }

    int getMaxHeaderListSize(int i8) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSet(int i8) {
        if (((1 << i8) & this.set) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void merge(Settings settings) {
        for (int i8 = 0; i8 < 10; i8++) {
            if (settings.isSet(i8)) {
                set(i8, settings.get(i8));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Settings set(int i8, int i9) {
        if (i8 >= 0) {
            int[] iArr = this.values;
            if (i8 < iArr.length) {
                this.set = (1 << i8) | this.set;
                iArr[i8] = i9;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int size() {
        return Integer.bitCount(this.set);
    }
}
