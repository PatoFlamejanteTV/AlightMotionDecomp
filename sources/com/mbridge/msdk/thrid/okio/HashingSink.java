package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class HashingSink extends ForwardingSink {

    @Nullable
    private final Mac mac;

    @Nullable
    private final MessageDigest messageDigest;

    private HashingSink(Sink sink, String str) {
        super(sink);
        try {
            this.messageDigest = MessageDigest.getInstance(str);
            this.mac = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA1");
    }

    public static HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA256");
    }

    public static HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA512");
    }

    public static HashingSink md5(Sink sink) {
        return new HashingSink(sink, SameMD5.TAG);
    }

    public static HashingSink sha1(Sink sink) {
        return new HashingSink(sink, "SHA-1");
    }

    public static HashingSink sha256(Sink sink) {
        return new HashingSink(sink, "SHA-256");
    }

    public static HashingSink sha512(Sink sink) {
        return new HashingSink(sink, "SHA-512");
    }

    public final ByteString hash() {
        byte[] doFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            doFinal = this.mac.doFinal();
        }
        return ByteString.of(doFinal);
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSink, com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j8) throws IOException {
        Util.checkOffsetAndCount(buffer.size, 0L, j8);
        Segment segment = buffer.head;
        long j9 = 0;
        while (j9 < j8) {
            int min = (int) Math.min(j8 - j9, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, min);
            } else {
                this.mac.update(segment.data, segment.pos, min);
            }
            j9 += min;
            segment = segment.next;
        }
        super.write(buffer, j8);
    }

    private HashingSink(Sink sink, ByteString byteString, String str) {
        super(sink);
        try {
            Mac mac = Mac.getInstance(str);
            this.mac = mac;
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.messageDigest = null;
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
