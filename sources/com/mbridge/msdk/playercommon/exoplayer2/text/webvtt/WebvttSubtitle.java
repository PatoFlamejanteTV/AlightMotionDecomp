package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class WebvttSubtitle implements Subtitle {
    private final long[] cueTimesUs;
    private final List<WebvttCue> cues;
    private final int numCues;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(List<WebvttCue> list) {
        this.cues = list;
        int size = list.size();
        this.numCues = size;
        this.cueTimesUs = new long[size * 2];
        for (int i8 = 0; i8 < this.numCues; i8++) {
            WebvttCue webvttCue = list.get(i8);
            int i9 = i8 * 2;
            long[] jArr = this.cueTimesUs;
            jArr[i9] = webvttCue.startTime;
            jArr[i9 + 1] = webvttCue.endTime;
        }
        long[] jArr2 = this.cueTimesUs;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.sortedCueTimesUs = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final List<Cue> getCues(long j8) {
        SpannableStringBuilder spannableStringBuilder = null;
        WebvttCue webvttCue = null;
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < this.numCues; i8++) {
            long[] jArr = this.cueTimesUs;
            int i9 = i8 * 2;
            if (jArr[i9] <= j8 && j8 < jArr[i9 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                WebvttCue webvttCue2 = this.cues.get(i8);
                if (webvttCue2.isNormalCue()) {
                    if (webvttCue == null) {
                        webvttCue = webvttCue2;
                    } else if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(webvttCue.text).append((CharSequence) "\n").append(webvttCue2.text);
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n").append(webvttCue2.text);
                    }
                } else {
                    arrayList.add(webvttCue2);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new WebvttCue(spannableStringBuilder));
        } else if (webvttCue != null) {
            arrayList.add(webvttCue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final long getEventTime(int i8) {
        boolean z8;
        boolean z9 = false;
        if (i8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        if (i8 < this.sortedCueTimesUs.length) {
            z9 = true;
        }
        Assertions.checkArgument(z9);
        return this.sortedCueTimesUs[i8];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j8) {
        int binarySearchCeil = Util.binarySearchCeil(this.sortedCueTimesUs, j8, false, false);
        if (binarySearchCeil >= this.sortedCueTimesUs.length) {
            return -1;
        }
        return binarySearchCeil;
    }
}
