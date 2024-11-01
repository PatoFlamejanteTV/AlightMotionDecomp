package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class TtmlSubtitle implements Subtitle {
    private final long[] eventTimesUs;
    private final Map<String, TtmlStyle> globalStyles;
    private final Map<String, TtmlRegion> regionMap;
    private final TtmlNode root;

    public TtmlSubtitle(TtmlNode ttmlNode, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2) {
        Map<String, TtmlStyle> emptyMap;
        this.root = ttmlNode;
        this.regionMap = map2;
        if (map != null) {
            emptyMap = DesugarCollections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.globalStyles = emptyMap;
        this.eventTimesUs = ttmlNode.getEventTimesUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final List<Cue> getCues(long j8) {
        return this.root.getCues(j8, this.globalStyles, this.regionMap);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final long getEventTime(int i8) {
        return this.eventTimesUs[i8];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.eventTimesUs.length;
    }

    final Map<String, TtmlStyle> getGlobalStyles() {
        return this.globalStyles;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j8) {
        int binarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j8, false, false);
        if (binarySearchCeil >= this.eventTimesUs.length) {
            return -1;
        }
        return binarySearchCeil;
    }

    final TtmlNode getRoot() {
        return this.root;
    }
}
