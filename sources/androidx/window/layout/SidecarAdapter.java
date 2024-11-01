package androidx.window.layout;

import R5.AbstractC1435t;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SidecarAdapter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = SidecarAdapter.class.getSimpleName();
    private final SpecificationComputer.VerificationMode verificationMode;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final int getRawSidecarDevicePosture(SidecarDeviceState sidecarDeviceState) {
            AbstractC3292y.i(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (invoke != null) {
                    return ((Integer) invoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }

        public final int getSidecarDevicePosture$window_release(SidecarDeviceState sidecarDeviceState) {
            AbstractC3292y.i(sidecarDeviceState, "sidecarDeviceState");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(SidecarWindowLayoutInfo info) {
            AbstractC3292y.i(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    if (list == null) {
                        return AbstractC1435t.m();
                    }
                    return list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return AbstractC1435t.m();
                }
            } catch (NoSuchFieldError unused2) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void setSidecarDevicePosture(SidecarDeviceState sidecarDeviceState, int i8) {
            AbstractC3292y.i(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i8;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i8));
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void setSidecarDisplayFeatures(SidecarWindowLayoutInfo info, List<SidecarDisplayFeature> displayFeatures) {
            AbstractC3292y.i(info, "info");
            AbstractC3292y.i(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public SidecarAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC3292y.d(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC3292y.d(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean isEqualSidecarDisplayFeatures(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            if (!isEqualSidecarDisplayFeature(list.get(i8), list2.get(i8))) {
                return false;
            }
            i8 = i9;
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (AbstractC3292y.d(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        Companion companion = Companion;
        if (companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (AbstractC3292y.d(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        Companion companion = Companion;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }

    public final List<DisplayFeature> translate(List<SidecarDisplayFeature> sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        AbstractC3292y.i(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        AbstractC3292y.i(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            DisplayFeature translate$window_release = translate$window_release((SidecarDisplayFeature) it.next(), deviceState);
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return arrayList;
    }

    public final DisplayFeature translate$window_release(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        AbstractC3292y.i(feature, "feature");
        AbstractC3292y.i(deviceState, "deviceState");
        SpecificationComputer.Companion companion = SpecificationComputer.Companion;
        String TAG2 = TAG;
        AbstractC3292y.h(TAG2, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) SpecificationComputer.Companion.startSpecification$default(companion, feature, TAG2, this.verificationMode, null, 4, null).require("Type must be either TYPE_FOLD or TYPE_HINGE", SidecarAdapter$translate$checkedFeature$1.INSTANCE).require("Feature bounds must not be 0", SidecarAdapter$translate$checkedFeature$2.INSTANCE).require("TYPE_FOLD must have 0 area", SidecarAdapter$translate$checkedFeature$3.INSTANCE).require("Feature be pinned to either left or top", SidecarAdapter$translate$checkedFeature$4.INSTANCE).compute();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        } else {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        }
        int sidecarDevicePosture$window_release = Companion.getSidecarDevicePosture$window_release(deviceState);
        if (sidecarDevicePosture$window_release == 0 || sidecarDevicePosture$window_release == 1) {
            return null;
        }
        if (sidecarDevicePosture$window_release != 2) {
            if (sidecarDevicePosture$window_release != 3) {
                if (sidecarDevicePosture$window_release == 4) {
                    return null;
                }
                state = FoldingFeature.State.FLAT;
            } else {
                state = FoldingFeature.State.FLAT;
            }
        } else {
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect rect = feature.getRect();
        AbstractC3292y.h(rect, "feature.rect");
        return new HardwareFoldingFeature(new Bounds(rect), fold, state);
    }

    public SidecarAdapter(SpecificationComputer.VerificationMode verificationMode) {
        AbstractC3292y.i(verificationMode, "verificationMode");
        this.verificationMode = verificationMode;
    }

    public /* synthetic */ SidecarAdapter(SpecificationComputer.VerificationMode verificationMode, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }

    public final WindowLayoutInfo translate(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        AbstractC3292y.i(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(AbstractC1435t.m());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        Companion companion = Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState, companion.getSidecarDevicePosture$window_release(state));
        return new WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState));
    }
}
