package androidx.compose.animation.core;

import Q5.r;
import Q5.x;
import R5.Q;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import e6.AbstractC2829a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesSpecConfig<T> config;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class KeyframesSpecConfig<T> {
        public static final int $stable = 8;
        private int delayMillis;
        private int durationMillis = 300;
        private final Map<Integer, KeyframeEntity<T>> keyframes = new LinkedHashMap();

        public final KeyframeEntity<T> at(T t8, int i8) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t8, null, 2, 0 == true ? 1 : 0);
            this.keyframes.put(Integer.valueOf(i8), keyframeEntity);
            return keyframeEntity;
        }

        public final KeyframeEntity<T> atFraction(T t8, float f8) {
            return at(t8, AbstractC2829a.d(this.durationMillis * f8));
        }

        public boolean equals(Object obj) {
            if (obj instanceof KeyframesSpecConfig) {
                KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpecConfig) obj;
                if (this.delayMillis == keyframesSpecConfig.delayMillis && this.durationMillis == keyframesSpecConfig.durationMillis && AbstractC3292y.d(this.keyframes, keyframesSpecConfig.keyframes)) {
                    return true;
                }
            }
            return false;
        }

        public final int getDelayMillis() {
            return this.delayMillis;
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        public final Map<Integer, KeyframeEntity<T>> getKeyframes$animation_core_release() {
            return this.keyframes;
        }

        public int hashCode() {
            return (((this.durationMillis * 31) + this.delayMillis) * 31) + this.keyframes.hashCode();
        }

        public final void setDelayMillis(int i8) {
            this.delayMillis = i8;
        }

        public final void setDurationMillis(int i8) {
            this.durationMillis = i8;
        }

        public final void with(KeyframeEntity<T> keyframeEntity, Easing easing) {
            AbstractC3292y.i(keyframeEntity, "<this>");
            AbstractC3292y.i(easing, "easing");
            keyframeEntity.setEasing$animation_core_release(easing);
        }
    }

    public KeyframesSpec(KeyframesSpecConfig<T> config) {
        AbstractC3292y.i(config, "config");
        this.config = config;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof KeyframesSpec) && AbstractC3292y.d(this.config, ((KeyframesSpec) obj).config)) {
            return true;
        }
        return false;
    }

    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class KeyframeEntity<T> {
        public static final int $stable = 8;
        private Easing easing;
        private final T value;

        public KeyframeEntity(T t8, Easing easing) {
            AbstractC3292y.i(easing, "easing");
            this.value = t8;
            this.easing = easing;
        }

        public boolean equals(Object obj) {
            if (obj instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
                if (AbstractC3292y.d(keyframeEntity.value, this.value) && AbstractC3292y.d(keyframeEntity.easing, this.easing)) {
                    return true;
                }
            }
            return false;
        }

        public final Easing getEasing$animation_core_release() {
            return this.easing;
        }

        public final T getValue$animation_core_release() {
            return this.value;
        }

        public int hashCode() {
            int i8;
            T t8 = this.value;
            if (t8 != null) {
                i8 = t8.hashCode();
            } else {
                i8 = 0;
            }
            return (i8 * 31) + this.easing.hashCode();
        }

        public final void setEasing$animation_core_release(Easing easing) {
            AbstractC3292y.i(easing, "<set-?>");
            this.easing = easing;
        }

        public final <V extends AnimationVector> r toPair$animation_core_release(Function1 convertToVector) {
            AbstractC3292y.i(convertToVector, "convertToVector");
            return x.a(convertToVector.invoke(this.value), this.easing);
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i8, AbstractC3284p abstractC3284p) {
            this(obj, (i8 & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(TwoWayConverter<T, V> converter) {
        AbstractC3292y.i(converter, "converter");
        Map<Integer, KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.d(keyframes$animation_core_release.size()));
        Iterator<T> it = keyframes$animation_core_release.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((KeyframeEntity) entry.getValue()).toPair$animation_core_release(converter.getConvertToVector()));
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }
}
