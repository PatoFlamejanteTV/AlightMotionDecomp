package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes.dex */
final class TileModeVerificationHelper {
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    @DoNotInline
    /* renamed from: getComposeTileModeDecal-3opZhB0, reason: not valid java name */
    public final int m3302getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m3299getDecal3opZhB0();
    }

    @DoNotInline
    public final Shader.TileMode getFrameworkTileModeDecal() {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
