package com.mbridge.msdk.thrid.okio;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class HashingSource extends ForwardingSource {
    private final Mac mac;
    private final MessageDigest messageDigest;

    private HashingSource(Source source, String str) {
        super(source);
        try {
            this.messageDigest = MessageDigest.getInstance(str);
            this.mac = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static HashingSource hmacSha1(Source source, ByteString byteString) {
        return new HashingSource(source, byteString, "HmacSHA1");
    }

    public static HashingSource hmacSha256(Source source, ByteString byteString) {
        return new HashingSource(source, byteString, "HmacSHA256");
    }

    public static HashingSource md5(Source source) {
        return new HashingSource(source, SameMD5.TAG);
    }

    public static HashingSource sha1(Source source) {
        return new HashingSource(source, "SHA-1");
    }

    public static HashingSource sha256(Source source) {
        return new HashingSource(source, "SHA-256");
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

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSource, com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j8) throws IOException {
        long read = super.read(buffer, j8);
        if (read != -1) {
            long j9 = buffer.size;
            long j10 = j9 - read;
            Segment segment = buffer.head;
            while (j9 > j10) {
                segment = segment.prev;
                j9 -= segment.limit - segment.pos;
            }
            while (j9 < buffer.size) {
                int i8 = (int) ((segment.pos + j10) - j9);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i8, segment.limit - i8);
                } else {
                    this.mac.update(segment.data, i8, segment.limit - i8);
                }
                j10 = (segment.limit - segment.pos) + j9;
                segment = segment.next;
                j9 = j10;
            }
        }
        return read;
    }

    private HashingSource(Source source, ByteString byteString, String str) {
        super(source);
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
