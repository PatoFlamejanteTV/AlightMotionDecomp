package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PictureInPictureModeChangedInfo {
    private final boolean isInPictureInPictureMode;

    @RequiresApi(26)
    private Configuration newConfiguration;

    public PictureInPictureModeChangedInfo(boolean z8) {
        this.isInPictureInPictureMode = z8;
    }

    @RequiresApi(26)
    public final Configuration getNewConfig() {
        Configuration configuration = this.newConfiguration;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?".toString());
    }

    public final boolean isInPictureInPictureMode() {
        return this.isInPictureInPictureMode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(26)
    public PictureInPictureModeChangedInfo(boolean z8, Configuration newConfig) {
        this(z8);
        AbstractC3292y.i(newConfig, "newConfig");
        this.newConfiguration = newConfig;
    }
}
