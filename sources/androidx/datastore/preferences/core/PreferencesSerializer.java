package androidx.datastore.preferences.core;

import Q5.I;
import Q5.p;
import R5.AbstractC1435t;
import U5.d;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PreferencesSerializer implements OkioSerializer<Preferences> {
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();
    public static final String fileExtension = "preferences_pb";

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesSerializer() {
    }

    private final void addProtoEntryToPreferences(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) {
        int i8;
        PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
        if (valueCase == null) {
            i8 = -1;
        } else {
            i8 = WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()];
        }
        switch (i8) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new p();
            case 1:
                mutablePreferences.set(PreferencesKeys.booleanKey(str), Boolean.valueOf(value.getBoolean()));
                return;
            case 2:
                mutablePreferences.set(PreferencesKeys.floatKey(str), Float.valueOf(value.getFloat()));
                return;
            case 3:
                mutablePreferences.set(PreferencesKeys.doubleKey(str), Double.valueOf(value.getDouble()));
                return;
            case 4:
                mutablePreferences.set(PreferencesKeys.intKey(str), Integer.valueOf(value.getInteger()));
                return;
            case 5:
                mutablePreferences.set(PreferencesKeys.longKey(str), Long.valueOf(value.getLong()));
                return;
            case 6:
                Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
                String string = value.getString();
                AbstractC3292y.h(string, "value.string");
                mutablePreferences.set(stringKey, string);
                return;
            case 7:
                Preferences.Key<Set<String>> stringSetKey = PreferencesKeys.stringSetKey(str);
                List<String> stringsList = value.getStringSet().getStringsList();
                AbstractC3292y.h(stringsList, "value.stringSet.stringsList");
                mutablePreferences.set(stringSetKey, AbstractC1435t.b1(stringsList));
                return;
            case 8:
                Preferences.Key<byte[]> byteArrayKey = PreferencesKeys.byteArrayKey(str);
                byte[] byteArray = value.getBytes().toByteArray();
                AbstractC3292y.h(byteArray, "value.bytes.toByteArray()");
                mutablePreferences.set(byteArrayKey, byteArray);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final PreferencesProto.Value getValueProto(Object obj) {
        if (obj instanceof Boolean) {
            PreferencesProto.Value build = PreferencesProto.Value.newBuilder().setBoolean(((Boolean) obj).booleanValue()).build();
            AbstractC3292y.h(build, "newBuilder().setBoolean(value).build()");
            return build;
        }
        if (obj instanceof Float) {
            PreferencesProto.Value build2 = PreferencesProto.Value.newBuilder().setFloat(((Number) obj).floatValue()).build();
            AbstractC3292y.h(build2, "newBuilder().setFloat(value).build()");
            return build2;
        }
        if (obj instanceof Double) {
            PreferencesProto.Value build3 = PreferencesProto.Value.newBuilder().setDouble(((Number) obj).doubleValue()).build();
            AbstractC3292y.h(build3, "newBuilder().setDouble(value).build()");
            return build3;
        }
        if (obj instanceof Integer) {
            PreferencesProto.Value build4 = PreferencesProto.Value.newBuilder().setInteger(((Number) obj).intValue()).build();
            AbstractC3292y.h(build4, "newBuilder().setInteger(value).build()");
            return build4;
        }
        if (obj instanceof Long) {
            PreferencesProto.Value build5 = PreferencesProto.Value.newBuilder().setLong(((Number) obj).longValue()).build();
            AbstractC3292y.h(build5, "newBuilder().setLong(value).build()");
            return build5;
        }
        if (obj instanceof String) {
            PreferencesProto.Value build6 = PreferencesProto.Value.newBuilder().setString((String) obj).build();
            AbstractC3292y.h(build6, "newBuilder().setString(value).build()");
            return build6;
        }
        if (obj instanceof Set) {
            PreferencesProto.Value.Builder newBuilder = PreferencesProto.Value.newBuilder();
            PreferencesProto.StringSet.Builder newBuilder2 = PreferencesProto.StringSet.newBuilder();
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            PreferencesProto.Value build7 = newBuilder.setStringSet(newBuilder2.addAllStrings((Set) obj)).build();
            AbstractC3292y.h(build7, "newBuilder().setStringSe…                ).build()");
            return build7;
        }
        if (obj instanceof byte[]) {
            PreferencesProto.Value build8 = PreferencesProto.Value.newBuilder().setBytes(ByteString.copyFrom((byte[]) obj)).build();
            AbstractC3292y.h(build8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return build8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(InterfaceC1451g interfaceC1451g, d dVar) throws IOException, CorruptionException {
        PreferencesProto.PreferenceMap readFrom = PreferencesMapCompat.Companion.readFrom(interfaceC1451g.inputStream());
        MutablePreferences createMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto.Value> preferencesMap = readFrom.getPreferencesMap();
        AbstractC3292y.h(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry<String, PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            String name = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            AbstractC3292y.h(name, "name");
            AbstractC3292y.h(value, "value");
            preferencesSerializer.addProtoEntryToPreferences(name, value, createMutable);
        }
        return createMutable.toPreferences();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.okio.OkioSerializer
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(Preferences preferences, InterfaceC1450f interfaceC1450f, d dVar) throws IOException, CorruptionException {
        Map<Preferences.Key<?>, Object> asMap = preferences.asMap();
        PreferencesProto.PreferenceMap.Builder newBuilder = PreferencesProto.PreferenceMap.newBuilder();
        for (Map.Entry<Preferences.Key<?>, Object> entry : asMap.entrySet()) {
            newBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        newBuilder.build().writeTo(interfaceC1450f.outputStream());
        return I.f8786a;
    }
}
