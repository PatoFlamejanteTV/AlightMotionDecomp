package androidx.datastore.preferences;

import androidx.annotation.RestrictTo;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PreferencesMapCompat {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final PreferencesProto.PreferenceMap readFrom(InputStream input) {
            AbstractC3292y.i(input, "input");
            try {
                PreferencesProto.PreferenceMap parseFrom = PreferencesProto.PreferenceMap.parseFrom(input);
                AbstractC3292y.h(parseFrom, "{\n                Prefer…From(input)\n            }");
                return parseFrom;
            } catch (InvalidProtocolBufferException e8) {
                throw new CorruptionException("Unable to parse preferences proto.", e8);
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
