package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class TrackSelectorResult {
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final TrackSelectionArray selections;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, TrackSelection[] trackSelectionArr, Object obj) {
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = new TrackSelectionArray(trackSelectionArr);
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i8 = 0; i8 < this.selections.length; i8++) {
            if (!isEquivalent(trackSelectorResult, i8)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isRendererEnabled(int i8) {
        if (this.rendererConfigurations[i8] != null) {
            return true;
        }
        return false;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult, int i8) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i8], trackSelectorResult.rendererConfigurations[i8]) && Util.areEqual(this.selections.get(i8), trackSelectorResult.selections.get(i8));
    }
}
