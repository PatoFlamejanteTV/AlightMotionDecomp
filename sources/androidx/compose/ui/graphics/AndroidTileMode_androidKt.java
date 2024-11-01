package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;

/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m2858isSupported0vamqd0(int i8) {
        if (Build.VERSION.SDK_INT < 31 && TileMode.m3294equalsimpl0(i8, TileMode.Companion.m3299getDecal3opZhB0())) {
            return false;
        }
        return true;
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m2859toAndroidTileMode0vamqd0(int i8) {
        TileMode.Companion companion = TileMode.Companion;
        if (TileMode.m3294equalsimpl0(i8, companion.m3298getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m3294equalsimpl0(i8, companion.m3301getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m3294equalsimpl0(i8, companion.m3300getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m3294equalsimpl0(i8, companion.m3299getDecal3opZhB0())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        Shader.TileMode tileMode2;
        int i8 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        tileMode2 = Shader.TileMode.DECAL;
                        if (tileMode == tileMode2) {
                            return TileModeVerificationHelper.INSTANCE.m3302getComposeTileModeDecal3opZhB0();
                        }
                    }
                    return TileMode.Companion.m3298getClamp3opZhB0();
                }
                return TileMode.Companion.m3301getRepeated3opZhB0();
            }
            return TileMode.Companion.m3300getMirror3opZhB0();
        }
        return TileMode.Companion.m3298getClamp3opZhB0();
    }
}
