package androidx.compose.ui.text.font;

import R5.AbstractC1435t;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.X;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    @Immutable
    /* loaded from: classes.dex */
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Immutable
    /* loaded from: classes.dex */
    public static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String str, float f8) {
            this.axisName = str;
            this.value = f8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            if (AbstractC3292y.d(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.floatToIntBits(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Immutable
    /* loaded from: classes.dex */
    public static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String str, int i8) {
            this.axisName = str;
            this.value = i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            if (AbstractC3292y.d(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    private static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        public /* synthetic */ SettingTextUnit(String str, long j8, AbstractC3284p abstractC3284p) {
            this(str, j8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            if (AbstractC3292y.d(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m5339equalsimpl0(this.value, settingTextUnit.value)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m4803getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m5343hashCodeimpl(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m5349toStringimpl(this.value)) + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) {
                return TextUnit.m5342getValueimpl(this.value) * density.getFontScale();
            }
            throw new IllegalArgumentException("density must not be null".toString());
        }

        private SettingTextUnit(String str, long j8) {
            this.axisName = str;
            this.value = j8;
            this.needsDensity = true;
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public Settings(Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z8 = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    AbstractC1435t.C(arrayList, list);
                } else {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + AbstractC1435t.w0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.settings = arrayList2;
            int size = arrayList2.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                if (((Setting) arrayList2.get(i8)).getNeedsDensity()) {
                    z8 = true;
                    break;
                }
                i8++;
            }
            this.needsDensity = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Settings) && AbstractC3292y.d(this.settings, ((Settings) obj).settings)) {
                return true;
            }
            return false;
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.needsDensity;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private FontVariation() {
    }

    public final Setting Setting(String str, float f8) {
        if (str.length() == 4) {
            return new SettingFloat(str, f8);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + str + '\'').toString());
    }

    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m4801Settings6EWAqTQ(FontWeight fontWeight, int i8, Setting... settingArr) {
        X x8 = new X(3);
        x8.a(weight(fontWeight.getWeight()));
        x8.a(italic(i8));
        x8.b(settingArr);
        return new Settings((Setting[]) x8.d(new Setting[x8.c()]));
    }

    public final Setting grade(int i8) {
        if (-1000 <= i8 && i8 < 1001) {
            return new SettingInt("GRAD", i8);
        }
        throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
    }

    public final Setting italic(float f8) {
        if (0.0f <= f8 && f8 <= 1.0f) {
            return new SettingFloat("ital", f8);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f8).toString());
    }

    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m4802opticalSizingR2X_6o(long j8) {
        if (TextUnit.m5345isSpimpl(j8)) {
            return new SettingTextUnit("opsz", j8, null);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
    }

    public final Setting slant(float f8) {
        if (-90.0f <= f8 && f8 <= 90.0f) {
            return new SettingFloat("slnt", f8);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f8).toString());
    }

    public final Setting weight(int i8) {
        if (1 <= i8 && i8 < 1001) {
            return new SettingInt("wght", i8);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i8).toString());
    }

    public final Setting width(float f8) {
        if (f8 > 0.0f) {
            return new SettingFloat("wdth", f8);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f8).toString());
    }
}
