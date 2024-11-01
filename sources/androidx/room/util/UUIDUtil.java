package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class UUIDUtil {
    public static final UUID convertByteToUUID(byte[] bytes) {
        AbstractC3292y.i(bytes, "bytes");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public static final byte[] convertUUIDToByte(UUID uuid) {
        AbstractC3292y.i(uuid, "uuid");
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        AbstractC3292y.h(array, "buffer.array()");
        return array;
    }
}
